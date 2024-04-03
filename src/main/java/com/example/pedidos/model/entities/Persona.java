package com.example.pedidos.model.entities;

import jakarta.persistence.OneToOne;

import java.time.LocalDate;

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
