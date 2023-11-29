package com.ulbra.tdeaula20.services;

import com.ulbra.tdeaula20.dtos.ClienteResponseDTO;
import com.ulbra.tdeaula20.entities.Cliente;
import com.ulbra.tdeaula20.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteResponseDTO> getAllClientes(){
        List<ClienteResponseDTO> clienteDTO = new ArrayList<>();

        List<Cliente> clientes = this.clienteRepository.findAll();

        for (int i = 0; i < clientes.size(); i++){
            clienteDTO.add(new ClienteResponseDTO(clientes.get(i).getNome(),clientes.get(i).getIdade()));
        }

        return clienteDTO;
    }
}
