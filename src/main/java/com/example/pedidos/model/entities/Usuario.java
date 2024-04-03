package com.example.pedidos.model.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Usuario extends Base{

    private String auth0id;
    private String userName;
}
