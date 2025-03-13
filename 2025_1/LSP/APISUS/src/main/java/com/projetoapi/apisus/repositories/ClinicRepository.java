package com.projetoapi.apisus.repositories;

import com.projetoapi.apisus.entities.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicRepository extends JpaRepository<Clinic, Long> {
}
