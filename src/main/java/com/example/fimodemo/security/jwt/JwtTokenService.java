package com.example.fimodemo.security.jwt;

import com.example.fimodemo.user.domain.User;

public interface JwtTokenService {

    String createJwtToken(User user);

    boolean verifyJwtToken(String jwtToken);

    String getUserNameFromJwtToken(String token);
}
