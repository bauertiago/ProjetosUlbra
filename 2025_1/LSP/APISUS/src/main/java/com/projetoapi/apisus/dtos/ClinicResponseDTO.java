package com.projetoapi.apisus.dtos;

import com.projetoapi.apisus.entities.Clinic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClinicResponseDTO {
    private String name;
    private String address;
    private String phone;

    public Clinic convertDTOToClinic(){
        return new Clinic(this.getName(), this.getAddress(), this.getPhone());
    }
    public ClinicResponseDTO convertClinicToDTO(Clinic clinic){
        return new ClinicResponseDTO(clinic.getName(), clinic.getAddress(), clinic.getPhone());
    }
}
