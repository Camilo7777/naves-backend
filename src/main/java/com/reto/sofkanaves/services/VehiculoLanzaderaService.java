package com.reto.sofkanaves.services;

import com.reto.sofkanaves.models.VehiculoLanzadera;

import java.util.List;

public interface VehiculoLanzaderaService {

    VehiculoLanzadera save(VehiculoLanzadera vehiculoLanzadera);

    List<VehiculoLanzadera> getAll();
}
