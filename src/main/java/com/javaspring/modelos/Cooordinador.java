package com.javaspring.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cooordinador {
    @Id
    @Column(name = "pk_id_coordinador")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
    @Column(name = "apellido",length = 50, nullable = false)
    private String apellido;
    @Column(name = "correo",length = 100, unique = true, nullable = false)
    private String correo;
    @Column(name = "telefono", unique = true, nullable = false)
    private Long telefono;
}
