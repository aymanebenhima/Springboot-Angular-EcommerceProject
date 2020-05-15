package com.ecomapp.springbootecommerce.security.jwt;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

@Getter
@Setter
public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private String username;
    private Long id;
    private Collection<? extends GrantedAuthority> authorities;

    public JwtResponse(String accessToken, Long id, String username, Collection<? extends GrantedAuthority> authorities) {
        this.token = accessToken;
        this.id = id;
        this.username = username;
        this.authorities = authorities;
    }
}
