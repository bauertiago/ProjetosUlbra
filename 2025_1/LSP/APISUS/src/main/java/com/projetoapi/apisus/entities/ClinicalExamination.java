package com.projetoapi.apisus.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClinicalExamination {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String name;
    private String duracaoMedia;
    private String status;

    public ClinicalExamination(String name, String duracaoMedia, String status){
        this.name = name;
        this.duracaoMedia = duracaoMedia;
        this.status = status;
    }
}
