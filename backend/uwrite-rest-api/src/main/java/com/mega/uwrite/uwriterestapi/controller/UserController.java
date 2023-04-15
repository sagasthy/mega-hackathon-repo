package com.mega.uwrite.uwriterestapi.controller;

import com.mega.uwrite.uwriterestapi.dto.UserLogin;
import com.mega.uwrite.uwriterestapi.dto.UserRegister;
import com.mega.uwrite.uwriterestapi.model.User;
import com.mega.uwrite.uwriterestapi.repository.UserRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserRepository userRepository;

    private final String SESSION_COOKIE_TAG = "SESSION_COOKIE";

    @PostMapping("/register")
    @ResponseBody
    public String registerUser(@RequestBody UserRegister newUser)
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

    @PostMapping("/login")
    @ResponseBody
    public String loginUser(Model model, HttpSession session, @RequestBody UserLogin loginCredentials)
    {
        System.out.println((String) session.getAttribute(SESSION_COOKIE_TAG));

        User retrievedUser = userRepository.findUserById(Long.parseLong(loginCredentials.getUserId()));

        if(retrievedUser != null)
        {
            String sessionTag = (String) session.getAttribute(SESSION_COOKIE_TAG);
            if(sessionTag == null)
            {
                session.setAttribute(SESSION_COOKIE_TAG, "NEW SESSION TAG");
                model.addAttribute("sessionId", "");
            }
        }

        return "PROCESSED";
    }
}


