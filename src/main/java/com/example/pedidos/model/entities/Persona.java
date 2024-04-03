package com.example.pedidos.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Persona extends Base{

    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private int DNI;
    private int CUIL;
    private String email;

    @OneToOne
    private Usuario tieneUnUsuario;
}
