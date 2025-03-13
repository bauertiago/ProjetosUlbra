package com.projetoapi.apisus.services;

import com.projetoapi.apisus.dtos.SchedulingResponseDTO;
import com.projetoapi.apisus.entities.Scheduling;
import com.projetoapi.apisus.exceptions.NotFoundSchedulingExeptions;
import com.projetoapi.apisus.repositories.SchedulingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SchedulingService {
    private SchedulingRepository schedulingRepository;

    @Autowired
    public SchedulingService(SchedulingRepository schedulingRepository){
        this.schedulingRepository = schedulingRepository;
    }

    public List<SchedulingResponseDTO> getAllScheduling(){
        List<SchedulingResponseDTO> schedulingDTO = new ArrayList<>();

        List<Scheduling> schedulings = this.schedulingRepository.findAll();
        if (schedulings.isEmpty()){
            throw new NotFoundSchedulingExeptions();
        }
        for (Scheduling scheduling : schedulings){
            schedulingDTO.add(new SchedulingResponseDTO(scheduling.getNamePatient(), scheduling.getCpfPatient(), scheduling.getClinicName(), scheduling.getClinicAddress(), scheduling.getDateTime(), scheduling.getPriorityOfService()));
        }
        return schedulingDTO;
    }

    public SchedulingResponseDTO createScheduling(SchedulingResponseDTO schedulingDTO){
        Scheduling schedulingReturn = this.schedulingRepository.save(schedulingDTO.convertDTOToScheduling());

        return schedulingDTO.convertSchedulingToDTO(schedulingReturn);
    }

    public Scheduling updateScheduling(long id, Scheduling updateScheduling){
        Optional<Scheduling> opitionalScheduling = schedulingRepository.findById(id);
        if (opitionalScheduling.isPresent()){
            Scheduling newScheduling = opitionalScheduling.get();
            newScheduling.setNamePatient(updateScheduling.getNamePatient());
            newScheduling.setCpfPatient(updateScheduling.getCpfPatient());
            newScheduling.setClinicName(updateScheduling.getClinicName());
            newScheduling.setClinicAddress(updateScheduling.getClinicAddress());
            newScheduling.setDateTime(updateScheduling.getDateTime());
            newScheduling.setPriorityOfService(updateScheduling.getPriorityOfService());

            return schedulingRepository.save(newScheduling);
        }
        throw new NotFoundSchedulingExeptions();
    }

    public ResponseEntity<String> deleteScheduling(long id){
        Optional<Scheduling> optionalScheduling = schedulingRepository.findById(id);

        if (optionalScheduling.isPresent()){
            Scheduling deleteScheduling = optionalScheduling.get();
            schedulingRepository.delete(deleteScheduling);
            return ResponseEntity.ok("Agendamento deletado com sucesso");
        }
        return ResponseEntity.notFound().build();
    }

    public void deleteAll(){
        schedulingRepository.deleteAll();
    }
}
