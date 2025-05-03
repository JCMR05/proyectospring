package com.javaspring.repositorios;

import com.javaspring.modelos.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioHorario extends JpaRepository<Horario, Long> {
}
