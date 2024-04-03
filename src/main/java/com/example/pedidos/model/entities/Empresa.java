package com.example.pedidos.model.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Empresa extends Base{

    private String razonSocial;
    private String nombre;
    @OneToMany
    private Set<Sucursal> posee = new HashSet<>();
}
