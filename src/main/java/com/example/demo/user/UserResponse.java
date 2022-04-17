package com.example.demo.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
    public String firstName;
    public String lastName;
    public String email;

    public UserResponse() {
        this.firstName = "Dale";
        this.lastName = "Carnegie";
        this.email = "dc@example.com";
    }
}
