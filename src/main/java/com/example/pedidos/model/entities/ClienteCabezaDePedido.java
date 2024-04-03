package com.example.pedidos.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class ClienteCabezaDePedido extends Base{

    private boolean anulado;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "cabezaPedido_id")
    private CabezaPedido cabezaPedido;
}
