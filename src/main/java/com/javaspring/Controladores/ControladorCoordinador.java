package com.javaspring.controladores;

import com.javaspring.modelos.Cooordinador;
import com.javaspring.servicios.ServicioCoordinador;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api-coordinador")
@CrossOrigin(origins = "http://localhost:8080")
public class ControladorCoordinador {

    public static final Logger logger = LoggerFactory.getLogger(ControladorCoordinador.class);

    @Autowired
    private ServicioCoordinador servicioCoordinador;


    @GetMapping("/coordinador")
    public List<Cooordinador> listarCoordinador(){
        List<Cooordinador> listaDeCoordinadores = this.servicioCoordinador.listaCoordinadores();
        logger.info("Lista de coordinadores obtenidos");
        listaDeCoordinadores.forEach(coordinador -> logger.info(coordinador.toString()));
        return listaDeCoordinadores;
    }

    @PostMapping("/coordinador")
    public Cooordinador guardarCoordinador(@RequestBody Cooordinador coordinador){
        logger.info("Coordinador agregado: " + coordinador);
        return this.servicioCoordinador.guardarCoordinador(coordinador);
    }
}
