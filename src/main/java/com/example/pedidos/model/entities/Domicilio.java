package com.example.pedidos.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Domicilio extends Base{

    private String calle;
    private int numero;
    private int CP;

    @OneToOne
    private Localidad estaEn;

}
