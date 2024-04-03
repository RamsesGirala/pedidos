package com.example.pedidos.model.entities;

import com.example.pedidos.model.entities.enums.UnidadDeMedida;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class DetalleCabezaReceta extends Base{

    private int cantidad;
    private UnidadDeMedida unidadDeMedida;

    @OneToOne
    private Stock stock;


}
