package com.javaspring.servicios;

import com.javaspring.modelos.Horario;

import java.util.List;

public interface IServicioHorario {

    List<Horario> listaHorarios();

    Horario buscarHorarioPorId(Long id);

    Horario guardarHorario(Horario horario);

    void eliminarHorario(Long id);
}