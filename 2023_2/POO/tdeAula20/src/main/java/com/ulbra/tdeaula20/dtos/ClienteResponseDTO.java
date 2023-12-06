package com.ulbra.tdeaula20.dtos;

import com.ulbra.tdeaula20.entities.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteResponseDTO {

    private String nome;
    private int idade;
    private String profissao;

    public Cliente convertDTOToCliente(){
        return new Cliente(this.getNome(),this.getIdade(),this.getProfissao());
    }
    public ClienteResponseDTO convertClienteToDTO(Cliente cliente){
        return new ClienteResponseDTO(cliente.getNome(), cliente.getIdade(), cliente.getProfissao());
    }

}
