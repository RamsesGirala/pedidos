package com.example.pedidos.model.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Stock extends Base{

    private String descripcion;
    private int stock;
    private int stockMinimo;
    private int stockMaximo;
    private double precio;

}
