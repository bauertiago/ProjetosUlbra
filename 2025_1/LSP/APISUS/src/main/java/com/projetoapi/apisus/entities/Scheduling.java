package com.projetoapi.apisus.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    private String cpfPatient;
    private String clinicName;
    private String clinicAddress;
    private String examType;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime dateTime;
    private String priorityOfService;

    public Scheduling(String namePatient, String cpfPatient, String clinicName, String clinicAddress,String examType, LocalDateTime dateTime, String priorityOfService){
        this.namePatient = namePatient;
        this.cpfPatient = cpfPatient;
        this.clinicName = clinicName;
        this.clinicAddress = clinicAddress;
        this.examType = examType;
        this.dateTime = dateTime;
        this.priorityOfService = priorityOfService;
    }
}