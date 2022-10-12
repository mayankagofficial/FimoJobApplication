package com.example.fimodemo.security.jwt;

import com.example.fimodemo.security.jwt.domain.BlacklistedJwtToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BlacklistedJwtTokenRepository extends JpaRepository<BlacklistedJwtToken, Long> {

    Optional<BlacklistedJwtToken> findByToken(String token);
}
