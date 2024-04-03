package com.example.pedidos.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Sucursal extends Base{

    private String nombre;
    private int telefono;

    @OneToOne
    private Domicilio seUbicaEn;

    @ManyToMany
    @JoinTable(
            name = "sucursal_categoria",
            joinColumns = @JoinColumn(name = "sucursal_id"),
            inverseJoinColumns = @JoinColumn(name = "categoria_id"))
    private Set<CategoriaDeProductos> categorias = new HashSet<>();


}
