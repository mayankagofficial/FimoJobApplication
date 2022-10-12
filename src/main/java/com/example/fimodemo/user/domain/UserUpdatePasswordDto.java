package com.example.fimodemo.user.domain;

import com.example.fimodemo.user.validation.email.ValidEmail;
import com.example.fimodemo.user.validation.password.ValidPassword;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdatePasswordDto {

    @NotNull
    @NotEmpty
    @ValidEmail
    String email;

    @NotNull
    @NotEmpty
    @ValidPassword
    String password;
}
