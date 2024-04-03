package com.example.pedidos.model.entities;

import jakarta.persistence.Entity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Pais extends Base{

    private String descripcion;

}
