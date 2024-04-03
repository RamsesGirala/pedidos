package com.example.pedidos.model.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Imagen extends Base{

    private String nombreImagen;
}
