package com.javaspring.Service;

import com.javaspring.Entities.Coordinador;

import java.util.List;

public interface IServiceCoordinador {

    List<Coordinador> obtenerCoordinadores();

    Coordinador buscarCoordinadorPorId(Long id);

    Coordinador guardarCoordinador(Coordinador coordinador);

    void eliminarCoordinador(Long id);
}
