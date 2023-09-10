package com.exceptiontutorial.controller;

import com.exceptiontutorial.model.Users;
import com.exceptiontutorial.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.PanelUI;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @GetMapping("get-user")
    public String getUser(Users user) {
        return userService.findUser(user);
    }
 }
