package com.example.fimodemo.user.validation;

import  com.example.fimodemo.user.domain.UserLoginDto;
import com.example.fimodemo.security.config.PasswordEncoder;
import com.example.fimodemo.user.domain.User;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
@AllArgsConstructor
public class UserValidator{

    PasswordEncoder passwordEncoder;

    public void validatePassword(UserLoginDto userToVerify, User userStored){
        if(!passwordEncoder.bCryptPasswordEncoder()
                .matches(userToVerify.getPassword(), userStored.getPassword())){
            throw new ResponseStatusException(
                    HttpStatus.UNAUTHORIZED, "Invalid credentials."
            );
        }
    }
}
