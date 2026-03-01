package com.iraus.iraus.controller.AuthenticationController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AuthController {

    @GetMapping("/")
    public String r(){
        return "dsfd";
    }

    @GetMapping("/kumar")
    public String Test(){
        return "test";
    }

}
