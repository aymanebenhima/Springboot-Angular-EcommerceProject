package com.ecomapp.springbootecommerce.security.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public class SignUpForm {

    private String name;

    private String username;

    private String email;

    private Set<String> role;

    private String password;

}
