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
public class VehiculoLanzadera extends Nave  implements SistemaPropulsion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipoCombustible;
    public VehiculoLanzadera(String descripcion, String creador, String nombre,
                             Integer peso, Integer empuje, Integer potencia,
                             String fechaActividad,String tipoCombustible) {
        super(descripcion, creador, nombre, peso, empuje, potencia, fechaActividad);
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public void activarPropulsion() {
        System.out.println("Activando propulsión de la nave lanzadera");

    }

    @Override
    public void desactivarPropulsion() {
        System.out.println("Desactivando propulsión de la nave lanzadera");

    }

    @Override
    public double obtenerVelocidadMaxima() {
        return 0;
    }
}
