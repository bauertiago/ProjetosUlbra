package com.projetoapi.apisus.services;

import com.projetoapi.apisus.dtos.ClinicalExaminationResponseDTO;
import com.projetoapi.apisus.entities.ClinicalExamination;
import com.projetoapi.apisus.exceptions.NotFoundClinicalExaminationsExceptions;
import com.projetoapi.apisus.repositories.ClinicalExaminationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClinicalExaminationService {
    private ClinicalExaminationRepository clinicalExaminationRepository;

    @Autowired
    public ClinicalExaminationService(ClinicalExaminationRepository clinicalExaminationRepository){
        this.clinicalExaminationRepository = clinicalExaminationRepository;
    }

    public List<ClinicalExaminationResponseDTO> getAllClinicalExamination(){
        List<ClinicalExaminationResponseDTO> clinicalExaminationDTO = new ArrayList<>();

        List<ClinicalExamination> clinicalExaminations = this.clinicalExaminationRepository.findAll();
        if (clinicalExaminations.isEmpty()){
            throw new NotFoundClinicalExaminationsExceptions();
        }
        for (ClinicalExamination clinicalExamination : clinicalExaminations){
            clinicalExaminationDTO.add(new ClinicalExaminationResponseDTO(clinicalExamination.getName(),clinicalExamination.getDuracaoMedia(),clinicalExamination.getStatus()));
        }
        return clinicalExaminationDTO;
    }

    public ClinicalExaminationResponseDTO creatClinicalExamination(ClinicalExaminationResponseDTO clinicalExaminationDTO){
        ClinicalExamination clinicalExaminationReturn = this.clinicalExaminationRepository.save(clinicalExaminationDTO.convertDTOToClinicalExamination());
        return clinicalExaminationDTO.convertClinicalExaminationToDTO(clinicalExaminationReturn);
    }

    public ClinicalExamination updateClinicalExamination(long id, ClinicalExamination updateClinicalExamination){
        Optional<ClinicalExamination> optionalClinicalExamination = clinicalExaminationRepository.findById(id);
        if (optionalClinicalExamination.isPresent()){
            ClinicalExamination newClinicalExamination = optionalClinicalExamination.get();
            newClinicalExamination.setName(updateClinicalExamination.getName());
            newClinicalExamination.setDuracaoMedia(updateClinicalExamination.getDuracaoMedia());
            newClinicalExamination.setStatus(updateClinicalExamination.getStatus());

            return clinicalExaminationRepository.save(newClinicalExamination);
        }
        throw new NotFoundClinicalExaminationsExceptions();
    }

    public ResponseEntity<String> deletClinicalExamination(long id){
        Optional<ClinicalExamination> optionalClinicalExamination = clinicalExaminationRepository.findById(id);

        if (optionalClinicalExamination.isPresent()){
            ClinicalExamination deleteClinicalExamination = optionalClinicalExamination.get();
            clinicalExaminationRepository.delete(deleteClinicalExamination);
            return ResponseEntity.ok("Exame Clínico deletado com sucesso!");
        }
        return ResponseEntity.notFound().build();
    }

    public void deletAll() {
        clinicalExaminationRepository.deleteAll();
    }
}
