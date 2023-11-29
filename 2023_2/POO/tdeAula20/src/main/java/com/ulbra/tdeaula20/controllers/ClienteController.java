package com.ulbra.tdeaula20.controllers;

import com.ulbra.tdeaula20.dtos.ClienteResponseDTO;
import com.ulbra.tdeaula20.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }
    @GetMapping
    public List<ClienteResponseDTO> getAllClientes(){
        return this.clienteService.getAllClientes();
    }
}
