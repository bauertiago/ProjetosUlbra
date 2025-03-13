package com.projetoapi.apisus.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Pattern(regexp = "\\(\\d{2}\\d{5}-\\d{4}", message = "Formato inválido! Use (xx)xxxxx-xxxx")
    private long id;
    private String name;
    private int cpf;
    private LocalDate dataDeNascimento;
    private String phone;

    public Patient(String name, int cpf, LocalDate dataDeNascimento, String phone) {
        this.name = name;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.phone = phone;
    }
}
