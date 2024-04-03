package com.example.pedidos.model.entities;

import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Promocion extends Base{

    private String descripcion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private double descuento;
    private double precio;
}
