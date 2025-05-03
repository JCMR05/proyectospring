package com.javaspring.controladores;

import com.javaspring.modelos.Horario;
import com.javaspring.servicios.IServicioHorario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api-horario")
@CrossOrigin(origins = "http://localhost:8080")
public class ControladorHorario {

    public static final Logger logger = LoggerFactory.getLogger(ControladorHorario.class);

    @Autowired
    private IServicioHorario servicioHorario;

    @GetMapping("/{id}")
    public ResponseEntity<Horario> obtenerPorId(@PathVariable Long id) {
        Horario horario = servicioHorario.buscarHorarioPorId(id);
        if (horario != null) {
            return ResponseEntity.ok(horario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Horario> actualizar(@PathVariable Long id, @RequestBody Horario horario) {
        Horario horarioExistente = servicioHorario.buscarHorarioPorId(id);
        if (horarioExistente != null) {
            horario.setId(id); // aseguramos que se actualice el correcto
            return ResponseEntity.ok(servicioHorario.guardarHorario(horario));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/horario")
    public List<Horario> listaHorarios(){
        List<Horario> listaDeHorario = this.servicioHorario.listaHorarios();
        logger.info("Lista de horarios obtenidos");
        listaDeHorario.forEach(horario -> logger.info(horario.toString()));
        return listaDeHorario;
    }

    @PostMapping("/horario")
    public Horario guardarHorario(@RequestBody Horario horario){
        logger.info("Horario agregado: " + horario);
        return this.servicioHorario.guardarHorario(horario);
    }
}
