package com.example.fimodemo.user.domain;

import com.example.fimodemo.user.validation.email.ValidEmail;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserFilterListDto {

    @NotNull
    @NotEmpty
    @ValidEmail
    String email;

    @NotNull
    private Integer age;
}
