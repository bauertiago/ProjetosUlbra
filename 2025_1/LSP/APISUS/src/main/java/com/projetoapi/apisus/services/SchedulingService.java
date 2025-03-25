package com.projetoapi.apisus.services;

import com.projetoapi.apisus.dtos.SchedulingResponseDTO;
import com.projetoapi.apisus.entities.Scheduling;
import com.projetoapi.apisus.exceptions.NotFoundSchedulingExceptions;
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
        List<Scheduling> schedulings = schedulingRepository.findAll();
        if (schedulings.isEmpty()){
            throw new NotFoundSchedulingExceptions();
        }
        return schedulings.stream()
                .map(s -> new SchedulingResponseDTO(s.getNamePatient(), s.getCpfPatient(), s.getClinicName(), s.getClinicAddress(), s.getExamType(), s.getDateTime(), s.getPriorityOfService()))
                .toList();
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
            newScheduling.setExamType(updateScheduling.getExamType());
            newScheduling.setDateTime(updateScheduling.getDateTime());
            newScheduling.setPriorityOfService(updateScheduling.getPriorityOfService());

            return schedulingRepository.save(newScheduling);
        }
        throw new NotFoundSchedulingExceptions();
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