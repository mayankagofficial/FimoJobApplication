package com.example.fimodemo.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum Permissions {
    USER_ROLE("user:role");

    private String permission;
}
