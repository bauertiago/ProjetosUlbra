package com.projetoapi.apisus.dtos;

import com.projetoapi.apisus.entities.Scheduling;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchedulingResponseDTO {
    private String namePatient;
    private String cpfPatient;
    private String clinicName;
    private String clinicAddress;
    private String examType;
    private LocalDateTime dateTime;
    private String priorityOfService;

    public Scheduling convertDTOToScheduling(){
        return new Scheduling(this.getNamePatient(), this.getCpfPatient(), this.getClinicName(), this.getClinicAddress(),this.getExamType(),this.getDateTime(), this.getPriorityOfService());
    }

    public SchedulingResponseDTO convertSchedulingToDTO(Scheduling scheduling){
        return new SchedulingResponseDTO(scheduling.getNamePatient(), scheduling.getCpfPatient(), scheduling.getClinicName(), scheduling.getClinicAddress(), scheduling.getExamType(), scheduling.getDateTime(), scheduling.getPriorityOfService());
    }
}
