package com.example.pedidos.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Domicilio extends Base{

    private String calle;
    private int numero;
    private int CP;

    @OneToOne
    private Localidad estaEn;

}
