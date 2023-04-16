package com.mega.uwrite.uwriterestapi.controller;

import com.mega.uwrite.uwriterestapi.dto.UserLogin;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
@CrossOrigin
public class TestController {

    private final String SESSION_COOKIE_TAG = "SESSION_COOKIE";

    @GetMapping("/protected")
    public String protectedEndpoint(HttpServletRequest request)
    {
        String sessionID = (String) request.getSession().getAttribute(SESSION_COOKIE_TAG);
        System.out.println(sessionID);
        return "CHECK BACKEND LOGS";
    }

    @GetMapping("/basic-get")
    @ResponseBody
    public String basicGet()
    {
        System.out.println("TEST RECEIVED");
        return "REQUEST RECEIVED";
    }

    @PostMapping
    @ResponseBody
    public String basicPost(UserLogin userLogin)
    {
        System.out.println(userLogin.getUserId());
        return "REQUEST SUCCESS";
    }
}
