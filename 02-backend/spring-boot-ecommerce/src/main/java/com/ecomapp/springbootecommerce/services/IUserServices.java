package com.ecomapp.springbootecommerce.services;

import com.ecomapp.springbootecommerce.entity.Client;

import java.util.List;
import java.util.Optional;

public interface IUserServices {
    List<Client> getClients();

    Optional<Client> getClientById(Long id);

    Client getCLientByUsername(String username);
    
    void deleteUserById(Long id);
}
