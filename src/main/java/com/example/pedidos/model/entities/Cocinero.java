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
public class Cocinero extends Persona{

    @OneToMany
    private Set<CabezaReceta> hace = new HashSet<>();
}
