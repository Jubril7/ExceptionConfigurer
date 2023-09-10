package com.exceptiontutorial.service;

import com.exceptiontutorial.exception.UserNotFoundException;
import com.exceptiontutorial.model.Users;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String findUser(Users user) {
        if(user.getName() != "Joan") {
            throw new UserNotFoundException("not user found");
        } else {
            return user.getName();
        }
    }
}
