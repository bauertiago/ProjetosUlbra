package com.ulbra.tdeaula20.repositories;

import com.ulbra.tdeaula20.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
