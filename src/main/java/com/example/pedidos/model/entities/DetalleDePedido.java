package com.example.pedidos.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class DetalleDePedido extends Base{

    private int cantidad;
    private double precio;
    private double subTotal;
    private String requerimientosDelPedido;

    @OneToOne
    private Elaborado articuloElaborado;
    @OneToOne
    private NoElaborado articulo;
}
