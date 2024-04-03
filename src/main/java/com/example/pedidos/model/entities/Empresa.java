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
public class Empresa extends Base{

    private String razonSocial;
    private String nombre;
    @OneToMany
    private Set<Sucursal> posee = new HashSet<>();
}
