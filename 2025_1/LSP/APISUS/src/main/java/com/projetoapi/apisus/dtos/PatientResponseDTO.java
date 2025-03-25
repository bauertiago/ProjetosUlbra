package com.projetoapi.apisus.dtos;

import com.projetoapi.apisus.entities.Patient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientResponseDTO {
    private String name;
    private String cpf;
    private LocalDate dataDeNascimento;
    private String phone;

    public Patient convertDTOToProduct(){
        return new Patient(this.getName(),this.getCpf(),this.getDataDeNascimento(),this.getPhone());
    }

    public PatientResponseDTO convertPatientToDTO(Patient patient){
        return new PatientResponseDTO(patient.getName(), patient.getCpf(), patient.getDataDeNascimento(), patient.getPhone());
    }
}
