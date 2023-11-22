package com.ulbra.database.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "db_clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Cliente() {

    }
    public Cliente(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    private String name;
    private int idade;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
