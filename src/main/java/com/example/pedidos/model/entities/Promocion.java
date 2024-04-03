package com.example.pedidos.model.entities;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Promocion extends Base{

    private String descripcion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private double descuento;
    private double precio;
}
