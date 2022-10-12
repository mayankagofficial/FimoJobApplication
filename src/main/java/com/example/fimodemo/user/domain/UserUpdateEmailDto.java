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
public class UserUpdateEmailDto {

    @NotNull
    @NotEmpty
    @ValidEmail
    String oldEmail;

    @NotNull
    @NotEmpty
    @ValidEmail
    String newEmail;
}
