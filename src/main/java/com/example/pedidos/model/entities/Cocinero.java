package com.example.pedidos.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Cocinero extends Persona{

    @OneToMany
    private Set<CabezaReceta> hace = new HashSet<>();
}
