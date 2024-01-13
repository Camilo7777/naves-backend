package com.reto.sofkanaves.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Table
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class NoTripulada extends Nave{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public NoTripulada(String descripcion, String creador, String nombre,
                       Integer peso, Integer empuje, Integer potencia,
                       String fechaActividad) {
        super(descripcion, creador, nombre, peso, empuje, potencia, fechaActividad);
    }

    @Override
    public double obtenerVelocidadMaxima() {
        return 0;
    }

}
