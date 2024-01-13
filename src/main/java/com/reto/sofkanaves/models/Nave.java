package com.reto.sofkanaves.models;

import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Nave {
    private String descripcion;
    private String creador;
    private String nombre;
    private Integer peso;
    private Integer empuje;
    private Integer potencia;
    private String fechaActividad;


    public abstract double obtenerVelocidadMaxima();

}
