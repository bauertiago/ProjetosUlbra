package com.ulbra.aplicacaoAp2.controller;

import com.ulbra.aplicacaoAp2.model.Cliente;
import com.ulbra.aplicacaoAp2.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private ClienteService service;

    @Autowired
    public ClienteController(ClienteService service){
        this.service = service;
    }

    @GetMapping("{id}")
    public Cliente getClienteById(@PathVariable int id) {
        return service.getClienteById(id);
    }

    @GetMapping
    public ArrayList<Cliente> getCliente(@RequestParam(name = "idade", required = false) Integer idade){
        return service.getClientes(idade);
    }

    @PostMapping
    public Cliente setCliente(@RequestBody Cliente cliente){
        return service.creatCliente(cliente);
    }

    @PutMapping("/{id}")
    public Cliente update(@PathVariable int id, @RequestBody Cliente clienteAtualizado){
        Cliente update = service.update(id,clienteAtualizado);
        if (update != null){
            return update;
        }else{
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public Cliente delete(@PathVariable int id){
        Cliente delete = service.deletarCliente(id);
        if (delete != null){
            return delete;
        }else{
            return null;
        }
    }

    @DeleteMapping("/todos")
    public void deletarLista(){
        service.deletarTodos();
    }
}
