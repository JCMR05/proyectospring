package com.javaspring.servicios;

import com.javaspring.modelos.Horario;
import com.javaspring.repositorios.IRepositorioHorario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioHorario implements IServicioHorario {

    @Autowired
    private IRepositorioHorario iRepositorioHorario;


    @Override
    public List<Horario> listaHorarios() {

        return this.iRepositorioHorario.findAll();
    }

    @Override
    public Horario buscarHorarioPorId(Long id) {
        return this.iRepositorioHorario.findById(id).orElse(null);
    }

    @Override
    public Horario guardarHorario(Horario horario) {
        return this.iRepositorioHorario.save(horario);
    }

    @Override
    public void eliminarHorario(Long id) {
        this.iRepositorioHorario.deleteById(id);
    }
}
