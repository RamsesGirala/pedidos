package com.example.pedidos.model.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class CabezaReceta extends Base{

    private LocalDate fecha;
    private String nombre;
    private double total;
    private int tiempoEstimadoCoccion;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DetalleCabezaReceta> tiene = new HashSet<>();

}
