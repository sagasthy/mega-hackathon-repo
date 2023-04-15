package com.mega.uwrite.uwriterestapi.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/protected")
    public String protectedEndpoint(HttpServletRequest request)
    {
        List<String> notes = (List<String>) request.getSession().getAttribute("NOTES_SESSION");
        System.out.println(notes.size());
        return "HAS ACCESS";
    }
}
