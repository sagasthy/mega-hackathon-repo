package com.mega.uwrite.uwriterestapi.controller;

import com.mega.uwrite.uwriterestapi.dto.RegisterUser;
import com.mega.uwrite.uwriterestapi.model.User;
import com.mega.uwrite.uwriterestapi.repository.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    @ResponseBody
    public String registerUser(@RequestBody RegisterUser newUser)
    {
        User createUser = new User();
        createUser.setEmail(newUser.getEmail());
        createUser.setFirstName(newUser.getFirstName());
        createUser.setLastName(newUser.getLastName());

        userRepository.save(createUser);

        return "SUCCESS";
    }

    @GetMapping("/get-users")
    @ResponseBody
    public List<User> getAll()
    {
        return userRepository.findAll();
    }

    @GetMapping("/login")
    @ResponseBody
    public String loginuser(Model model, HttpSession session)
    {
        List<String> notes = (List<String>) session.getAttribute("NOTES_SESSION");
        model.addAttribute("noteSession", notes != null ? notes : new ArrayList<>());

        User retrievedUser = userRepository.findUserById(1L);
        System.out.println("USER IS "+(retrievedUser == null));
        return "SUCCESS";
    }

    @GetMapping("/test")
    @ResponseBody
    public String tester(HttpServletRequest request)
    {
        System.out.println("IN TESTEER");
        List<String> notes = (List<String>) request.getSession().getAttribute("NOTES_SESSION");
        if(notes == null)
        {
            System.out.println("IN 1");
            notes = new ArrayList<>();
            request.getSession().setAttribute("NOTES_SESSION", notes);
        }

        System.out.println("IN 2");
        notes.add("FJEWO");
        request.getSession().setAttribute("NOTES_SESSION", notes);
        return "TRUTH";
    }
}


