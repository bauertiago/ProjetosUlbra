package com.projetoapi.apisus.repositories;

import com.projetoapi.apisus.entities.ClinicalExamination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicalExaminationRepository extends JpaRepository<ClinicalExamination, Long> {
}
