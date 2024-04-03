package com.example.pedidos.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Provincia extends Base{

    private String descripcion;

    @OneToOne
    private Pais pertenece;

}
