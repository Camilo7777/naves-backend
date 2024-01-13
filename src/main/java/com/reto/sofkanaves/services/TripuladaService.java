package com.reto.sofkanaves.services;

import com.reto.sofkanaves.models.Tripulada;

import java.util.List;

public interface TripuladaService {
    Tripulada save(Tripulada tripulada);

    List<Tripulada> getAll();
}
