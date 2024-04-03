package com.example.pedidos.model.entities;

import jakarta.persistence.Entity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Usuario extends Base{

    private String auth0id;
    private String userName;
}
