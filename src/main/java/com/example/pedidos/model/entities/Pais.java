package com.example.pedidos.model.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Pais extends Base{

    private String descripcion;

}
