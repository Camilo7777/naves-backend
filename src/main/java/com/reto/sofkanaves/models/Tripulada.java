package com.reto.sofkanaves.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public  class Tripulada extends Nave{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numeroTripulantes;
    public Tripulada(String descripcion, String creador, String nombre,
                     Integer peso, Integer empuje, Integer potencia,
                     String fechaActividad,int numeroTripulantes) {
        super(descripcion, creador, nombre, peso, empuje, potencia, fechaActividad);
        this.numeroTripulantes = numeroTripulantes;
    }

    @Override
    public double obtenerVelocidadMaxima() {
        return 0;
    }

}
