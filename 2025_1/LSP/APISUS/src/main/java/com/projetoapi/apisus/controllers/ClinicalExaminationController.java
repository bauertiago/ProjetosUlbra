package com.projetoapi.apisus.controllers;

import com.projetoapi.apisus.dtos.ClinicalExaminationResponseDTO;
import com.projetoapi.apisus.entities.ClinicalExamination;
import com.projetoapi.apisus.services.ClinicalExaminationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clinicalExamination")
public class ClinicalExaminationController {
    private ClinicalExaminationService clinicalExaminationService;

    @Autowired
    public ClinicalExaminationController(ClinicalExaminationService clinicalExaminationService) {
        this.clinicalExaminationService = clinicalExaminationService;
    }

    @GetMapping
    public ResponseEntity<Map<String, List<ClinicalExaminationResponseDTO>>> getAllClinicalExamination() {
        List<ClinicalExaminationResponseDTO> clinicalExamination = this.clinicalExaminationService.getAllClinicalExamination();
        Map<String, List<ClinicalExaminationResponseDTO>> response = new HashMap<>();
        response.put("clinicalExamination", clinicalExamination);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ClinicalExaminationResponseDTO creatClinicalExamination(@RequestBody ClinicalExaminationResponseDTO bodyRequest){
        return this.clinicalExaminationService.creatClinicalExamination(bodyRequest);
    }

    @PutMapping("/{id}")
    public ClinicalExamination updateClinicalExamination(@PathVariable long id, @RequestBody ClinicalExamination updateClinicalExamination){
        return clinicalExaminationService.updateClinicalExamination(id, updateClinicalExamination);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletClinicalExamination(@PathVariable long id){
        ResponseEntity<String> response = clinicalExaminationService.deletClinicalExamination(id);
        return response;
    }
    @DeleteMapping("All")
    public String deletAll(){
        clinicalExaminationService.deletAll();
        return "Produtos deletados com sucesso!";
    }
}
