package com.example.demo.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1/users")
@RestController

public class UserController {

    @GetMapping("/current")
    public UserResponse getCurrentUser () {
        return new UserResponse();
    }
}