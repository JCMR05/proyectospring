package com.javaspring.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Horario {
    @Id
    @Column(name = "pk_id_horario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fecha_inicio;
    @Column(name = "fecha_fin", nullable = false)
    private LocalDate fecha_fin;
    @Column(name = "hora_inicio", nullable = false)
    private LocalTime hora_inicio;
    @Column(name = "hora_fin", nullable = false)
    private LocalTime hora_fin;

}
