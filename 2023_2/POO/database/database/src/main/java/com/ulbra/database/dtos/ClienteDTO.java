package com.ulbra.database.dtos;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ClienteDTO {

    public ClienteDTO(String name, int idade){
        this.name = name;
        this.idade = idade;
    }

    private String name;
    private int idade;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
