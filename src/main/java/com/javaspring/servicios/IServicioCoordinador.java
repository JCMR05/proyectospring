package com.javaspring.servicios;

import com.javaspring.modelos.Cooordinador;

import java.util.List;

public interface IServicioCoordinador {

    List<Cooordinador> listaCoordinadores();

    Cooordinador buscarCoordinadorPorId(Long id);

    Cooordinador guardarCoordinador(Cooordinador coordinador);

    void eliminarCoordinador(Long id);
}
