package com.ecomapp.springbootecommerce.services;

import com.ecomapp.springbootecommerce.dao.ClientRepository;
import com.ecomapp.springbootecommerce.entity.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServices implements IUserServices{
    private final ClientRepository clientRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Client> getClientById(Long id) {
        Optional<Client> client = clientRepository.findById(id);
        if (client.isEmpty()) throw new RuntimeException("Client Introuvable!");
        return client;
    }

    @Transactional
    @Override
    public Client getCLientByUsername(String userName) {
        Client client = clientRepository.findByUsername(userName).get();
        if (client == null) throw new RuntimeException("Username Introuvable!");
        return client;
    }
    
    @Transactional
	@Override
	public void deleteUserById(Long id) {
    	getClientById(id);
		clientRepository.deleteById(id);
		
	}
}
