package com.example.pedidos.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Producto extends Base{

    private String nombre;
    private String descripcion;

    @OneToMany
    private Set<Imagen> tiene = new HashSet<>();
}
