package com.projetoapi.apisus.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Scheduling {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String namePatient;
    private int cpfPatient;
    private String clinicName;
    private String clinicAddress;
    private LocalDateTime dateTime;
    private String priorityOfService;

    public Scheduling(String namePatient, int cpfPatient, String clinicName, String clinicAddress, LocalDateTime dateTime, String priorityOfService){
        this.namePatient = namePatient;
        this.cpfPatient = cpfPatient;
        this.clinicName = clinicName;
        this.clinicAddress = clinicAddress;
        this.dateTime = dateTime;
        this.priorityOfService = priorityOfService;
    }
}