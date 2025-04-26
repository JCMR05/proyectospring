package com.javaspring.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "coordinador")

public class Coordinador {
    @Id
    @Column(name = "pk_id_coordinador")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
    @Column(name = "apellido", length = 50, nullable = false)
    private String apellido;
    @Column(name = "correo", length = 100, nullable = false, unique = true)
    private String correo;
    @Column(name = "telefono", nullable = false, unique = true)
    private Long telefono;
}
