package com.ulbra.database.controllers;

import com.ulbra.database.dtos.ClienteDTO;
import com.ulbra.database.entities.Cliente;
import com.ulbra.database.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    ClienteService service;
    @Autowired
    public ClienteController(ClienteService service){

        this.service = service;
    }

    @PostMapping
    public ClienteDTO createCliente(@RequestBody ClienteDTO bodyRequest){
        this.service.createCliente(bodyRequest);
        return bodyRequest;
    }
}
