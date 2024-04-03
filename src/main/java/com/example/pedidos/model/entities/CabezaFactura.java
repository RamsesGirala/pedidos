package com.example.pedidos.model.entities;

import com.example.pedidos.model.entities.enums.EstadoPedido;
import com.example.pedidos.model.entities.enums.FormaDePago;
import com.example.pedidos.model.entities.enums.TipoDeEnvio;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
public class CabezaFactura extends Base{

    private LocalDate fechaPedido;
    private LocalTime horaInicio;
    private LocalTime horaEstimadaFinalizacion;
    private BigDecimal total;
    private EstadoPedido estadoPedido;
    private TipoDeEnvio tipoDeEnvio;
    private FormaDePago formaDePago;
    private int nroFactura;

    @ManyToOne
    @JoinColumn(name = "cabeza_pedido_id")
    private CabezaPedido cabezaPedido;
}
