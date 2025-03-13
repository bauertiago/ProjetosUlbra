package com.projetoapi.apisus.repositories;

import com.projetoapi.apisus.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
