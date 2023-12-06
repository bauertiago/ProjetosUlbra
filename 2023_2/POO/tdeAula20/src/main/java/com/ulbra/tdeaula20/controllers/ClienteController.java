package com.ulbra.tdeaula20.controllers;

import com.ulbra.tdeaula20.dtos.ClienteResponseDTO;
import com.ulbra.tdeaula20.entities.Cliente;
import com.ulbra.tdeaula20.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/idade")
    public List<ClienteResponseDTO> getClienteIdade(@RequestParam(name = "idade", required = false) Integer idade){
        return this.clienteService.getClienteIdade(idade);
    }
    @PostMapping
    public ClienteResponseDTO createCliente(@RequestBody ClienteResponseDTO bodyRequest){
        return this.clienteService.createCliente(bodyRequest);
    }

    @PutMapping("/{id}")
    public Cliente updateCliente(@PathVariable long id, @RequestBody Cliente clienteAtualizado){

        return clienteService.updateCliente(id,clienteAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable long id){
        ResponseEntity<String> response = clienteService.deleteCliente(id);
        return response;
    }

    @DeleteMapping("/todos")
    public String deletAll(){
        clienteService.deleteAll();
        return "Clientes deletados com sucesso";
    }
}
