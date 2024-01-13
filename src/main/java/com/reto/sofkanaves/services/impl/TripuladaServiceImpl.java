package com.reto.sofkanaves.services.impl;

import com.reto.sofkanaves.models.Tripulada;
import com.reto.sofkanaves.models.VehiculoLanzadera;
import com.reto.sofkanaves.repositories.TripuladaRepository;
import com.reto.sofkanaves.repositories.VehiculoLanzaderaRepository;
import com.reto.sofkanaves.services.TripuladaService;
import com.reto.sofkanaves.services.VehiculoLanzaderaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripuladaServiceImpl implements TripuladaService {

    @Autowired
    TripuladaRepository tripuladaRepository;
    @Override
    public Tripulada save(Tripulada tripulada) {
        return tripuladaRepository.save(tripulada);
    }

    @Override
    public List<Tripulada> getAll() {
        return tripuladaRepository.findAll();
    }
}
