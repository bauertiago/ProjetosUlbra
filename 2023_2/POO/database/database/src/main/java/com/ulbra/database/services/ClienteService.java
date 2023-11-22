package com.ulbra.database.services;

import com.ulbra.database.dtos.ClienteDTO;
import com.ulbra.database.entities.Cliente;
import com.ulbra.database.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    ClienteRepository repository;
    @Autowired
    public ClienteService(ClienteRepository repository){
        this.repository = repository;
    }
    public ClienteDTO createCliente(ClienteDTO cliente){

        //Convertendo de DTO para Entity
        Cliente clienteDtoToCliente = new Cliente(cliente.getName(),cliente.getIdade());
        Cliente resultadoSave = this.repository.save(clienteDtoToCliente);

        //Convertendo Resultado Entity para DTO
        return new ClienteDTO(resultadoSave.getName(), resultadoSave.getIdade());
    }


}
