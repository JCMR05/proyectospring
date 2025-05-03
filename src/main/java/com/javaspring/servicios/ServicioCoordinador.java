package com.javaspring.servicios;

import com.javaspring.modelos.Cooordinador;
import com.javaspring.repositorios.IRepositorioCoordinador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioCoordinador implements IServicioCoordinador {

    @Autowired
    private IRepositorioCoordinador iRepositorioCoordinador;


    @Override
    public List<Cooordinador> listaCoordinadores() {

        return this.iRepositorioCoordinador.findAll();
    }

    @Override
    public Cooordinador buscarCoordinadorPorId(Long id) {
        return this.iRepositorioCoordinador.findById(id).orElse(null);
    }

    @Override
    public Cooordinador guardarCoordinador(Cooordinador coordinador) {
        return this.iRepositorioCoordinador.save(coordinador);
    }

    @Override
    public void eliminarCoordinador(Long id) {
        this.iRepositorioCoordinador.deleteById(id);
    }
}
