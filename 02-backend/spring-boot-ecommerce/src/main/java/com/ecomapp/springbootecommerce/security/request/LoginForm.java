package com.ecomapp.springbootecommerce.security.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginForm {

    private String username;

    private String password;
}
