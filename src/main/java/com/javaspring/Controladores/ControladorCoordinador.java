package com.javaspring.Controladores;

import com.javaspring.Entities.Coordinador;
import com.javaspring.Service.ServiceCoordinador;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api-coordinador")
@CrossOrigin(origins = "http://carlosbd-1.czuaiwsyyua2.us-west-1.rds.amazonaws.com:4200/")

public class ControladorCoordinador {
    public static final Logger logger = LoggerFactory.getLogger(ControladorCoordinador.class);

    @Autowired
    private ServiceCoordinador serviceCoordinador;


    @GetMapping("/coordinador")
    public List<Coordinador> listaDeCoordinadores(){
        List<Coordinador> listaDeCoordinadores = this.serviceCoordinador.obtenerCoordinadores();
        logger.info("Lista de coordinadores obtenidos");
        listaDeCoordinadores.forEach(coordinador -> logger.info(coordinador.toString()));
        return listaDeCoordinadores;
    }

    @PostMapping("/coordinador")
    @ResponseStatus(HttpStatus.CREATED)
    public Coordinador guardarCoordinador(@RequestBody Coordinador coordinador){
        logger.info("Coordinador agregado: " + coordinador);
        return this.serviceCoordinador.guardarCoordinador(coordinador);
    }
}
