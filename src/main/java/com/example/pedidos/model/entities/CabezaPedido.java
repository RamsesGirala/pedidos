package com.example.pedidos.model.entities;

import com.example.pedidos.model.entities.enums.EstadoPedido;
import com.example.pedidos.model.entities.enums.FormaDePago;
import com.example.pedidos.model.entities.enums.TipoDeEnvio;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class CabezaPedido extends Base{

    private LocalDate fechaPedido;
    private LocalTime horaInicio;
    private LocalTime horaEstimadaFinalizacion;
    private BigDecimal total;
    private EstadoPedido estadoPedido;
    private TipoDeEnvio tipoDeEnvio;
    private FormaDePago formaDePago;
    private int nroPedido;


    @OneToMany(mappedBy = "cabezaPedido")
    private Set<CabezaFactura> facturas = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DetalleDePedido> tiene = new HashSet<>();

}
