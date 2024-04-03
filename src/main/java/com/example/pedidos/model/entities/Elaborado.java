package com.example.pedidos.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Elaborado extends Producto{

    @OneToOne
    private CabezaReceta tieneReceta;
}
