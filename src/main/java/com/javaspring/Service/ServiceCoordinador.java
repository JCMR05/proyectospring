package com.javaspring.Service;

import com.javaspring.Entities.Coordinador;
import com.javaspring.Repositories.IRepositoryCoordinador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class ServiceCoordinador implements IServiceCoordinador{

    @Autowired
    private IRepositoryCoordinador iRepositoryCoordinador;

    @Override
    public List<Coordinador> obtenerCoordinadores(){
        return this.iRepositoryCoordinador.findAll();
    }
    @Override
    public Coordinador buscarCoordinadorPorId(Long id){
        return this.iRepositoryCoordinador.findById(id).orElse(null);
    }
    @Override
    public Coordinador
    guardarCoordinador(Coordinador coordinador) {
        return this.iRepositoryCoordinador.save(coordinador);
    }
    @Override
    public void eliminarCoordinador(Long id) {
        this.iRepositoryCoordinador.deleteById(id);
    }
}