package com.ulbra.database.repositories;

import com.ulbra.database.entities.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> { }
