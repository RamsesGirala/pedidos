package com.example.pedidos.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class CategoriaDeProductos extends Base{

    private String nombre;

    @OneToMany
    private Set<CategoriaDeProductos> subCategorias = new HashSet<>();

    @OneToMany
    private Set<Producto> tiene = new HashSet<>();

    @ManyToMany(mappedBy = "categorias")
    private Set<Sucursal> sucursales = new HashSet<>();

}
