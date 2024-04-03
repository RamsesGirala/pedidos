package com.example.pedidos.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Producto extends Base{

    private String nombre;
    private String descripcion;

    @OneToMany
    private Set<Imagen> tiene = new HashSet<>();
}
