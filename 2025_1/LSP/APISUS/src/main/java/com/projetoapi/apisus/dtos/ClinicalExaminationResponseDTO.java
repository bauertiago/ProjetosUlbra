package com.projetoapi.apisus.dtos;

import com.projetoapi.apisus.entities.ClinicalExamination;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClinicalExaminationResponseDTO {
    private String name;
    private String duracaoMedia;
    private String status;

    public ClinicalExamination convertDTOToClinicalExamination(){
        return new ClinicalExamination(this.getName(), this.getDuracaoMedia(), this.getStatus());
    }
    public ClinicalExaminationResponseDTO convertClinicalExaminationToDTO(ClinicalExamination clinicalExamination){
        return new ClinicalExaminationResponseDTO(clinicalExamination.getName(), clinicalExamination.getDuracaoMedia(), clinicalExamination.getStatus());
    }
}
