package com.ecomapp.springbootecommerce.webcontrollers;

import com.ecomapp.springbootecommerce.entity.Client;
import com.ecomapp.springbootecommerce.exception.ResourceNotFoundException;
import com.ecomapp.springbootecommerce.services.IUserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserControllers {
    private final IUserServices userServices;

    @GetMapping(path = "/clients")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public List<Client> getAllClients() {
        return userServices.getClients();
    }

    @GetMapping(path = "/clients/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<Client> getClientsId(@PathVariable("id") Long id) throws ResourceNotFoundException {
        Client client;
        client = userServices.getClientById(id).orElseThrow(() -> new ResourceNotFoundException("User not found for this id : " + id));
        return ResponseEntity.ok().body(client);
    }

    @GetMapping(path = "/client")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public Client getClientByUsername(@RequestParam(required=false) String username){
        return userServices.getCLientByUsername(username);
    }
    
    @DeleteMapping(path = "/clients/{id}")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public void deleteUserById(@PathVariable("id") Long id){
        
       userServices.deleteUserById(id);
    }
}
