package com.reto.sofkanaves.repositories;

import com.reto.sofkanaves.models.NoTripulada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface NoTripuladaRepository extends JpaRepository<NoTripulada,Long> {
    @Query(value = "SELECT * FROM no_tripulada n " +
            "WHERE n.descripcion = COALESCE(:descripcion, n.descripcion) " +
            "AND n.creador = COALESCE(:creador, n.creador) " +
            "AND n.nombre = COALESCE(:nombre, n.nombre) " +
            "AND n.peso = COALESCE(:peso, n.peso) " +
            "AND n.empuje = COALESCE(:empuje, n.empuje) " +
            "AND n.potencia = COALESCE(:potencia, n.potencia) " +
            "AND n.fecha_actividad = COALESCE(:fechaActividad, n.fecha_actividad)",
            nativeQuery = true)
    List<NoTripulada> searchByAttributes(
            @Param("descripcion") String descripcion,
            @Param("creador") String creador,
            @Param("nombre") String nombre,
            @Param("peso") Integer peso,
            @Param("empuje") Integer empuje,
            @Param("potencia") Integer potencia,
            @Param("fechaActividad") String fechaActividad
    );
}
