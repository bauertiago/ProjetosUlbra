package com.projetoapi.apisus.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clinic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private long id;
    private String name;
    private String address;
    @Pattern(regexp = "\\(\\d{2}\\)\\d{5}-\\d{4}", message = "Formato inválido! Use (xx)xxxxx-xxxx")
    private String phone;

    public Clinic(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}
