package com.ranokuhl.grunderapp.controller;

import com.ranokuhl.grunderapp.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstname", defaultValue = "Rano") String firstname,
                        @RequestParam(value = "lastname", defaultValue = "Kuhl") String lastname,
                        @RequestParam(value = "age", defaultValue = "39") int age) {

        User user = new User();

        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setAge(age);

        return user;
    }
}
