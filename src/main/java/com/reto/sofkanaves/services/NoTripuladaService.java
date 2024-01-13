package com.reto.sofkanaves.services;

import com.reto.sofkanaves.models.NoTripulada;

import java.util.List;

public interface NoTripuladaService {
    NoTripulada save(NoTripulada noTripulada);

    List<NoTripulada> getAll();

   List<NoTripulada> filtrarNoTripulada(NoTripulada noTripulada);
}
