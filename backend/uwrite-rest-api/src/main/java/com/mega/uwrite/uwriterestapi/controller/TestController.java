package com.mega.uwrite.uwriterestapi.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    private final String SESSION_COOKIE_TAG = "SESSION_COOKIE";

    @GetMapping("/protected")
    public String protectedEndpoint(HttpServletRequest request)
    {
        String sessionID = (String) request.getSession().getAttribute(SESSION_COOKIE_TAG);
        System.out.println(sessionID);
        return "CHECK BACKEND LOGS";
    }
}
