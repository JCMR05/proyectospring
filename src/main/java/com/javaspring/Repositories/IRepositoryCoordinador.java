package com.javaspring.Repositories;

import com.javaspring.Entities.Coordinador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryCoordinador extends JpaRepository<Coordinador,Long> {
}