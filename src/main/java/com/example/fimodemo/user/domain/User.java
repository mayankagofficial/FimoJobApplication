package com.example.fimodemo.user.domain;

import com.example.fimodemo.user.validation.email.ValidEmail;
import com.example.fimodemo.user.validation.password.ValidPassword;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_info")
public class User implements UserDetails {

    @Schema(hidden = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @NotNull
    @NotEmpty
    @ValidPassword
    private String password;

    @NotNull
    @NotEmpty
    @ValidEmail
    @Column(unique = true)
    private String email;

    @NotNull
    private Integer age;


    @Override
    @Schema(hidden = true)
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    @Schema(hidden = true)
    public String getUsername() {
        return null;
    }

    @Override
    @Schema(hidden = true)
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    @Schema(hidden = true)
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    @Schema(hidden = true)
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    @Schema(hidden = true)
    public boolean isEnabled() {
        return false;
    }
}
