package com.reto.sofkanaves.services.impl;

import com.reto.sofkanaves.models.NoTripulada;
import com.reto.sofkanaves.models.VehiculoLanzadera;
import com.reto.sofkanaves.repositories.NoTripuladaRepository;
import com.reto.sofkanaves.repositories.VehiculoLanzaderaRepository;
import com.reto.sofkanaves.services.NoTripuladaService;
import com.reto.sofkanaves.services.VehiculoLanzaderaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoTripuladaServiceImpl implements NoTripuladaService {

    @Autowired
    NoTripuladaRepository noTripuladaRepository;
    @Override
    public NoTripulada save(NoTripulada noTripulada) {

        return noTripuladaRepository.save(noTripulada);
    }

    @Override
    public List<NoTripulada> getAll() {
        return noTripuladaRepository.findAll();
    }

    @Override
    public List<NoTripulada> filtrarNoTripulada(NoTripulada noTripulada) {
        return noTripuladaRepository.searchByAttributes(
                noTripulada.getDescripcion(),
                noTripulada.getCreador(),
                noTripulada.getNombre(),
                noTripulada.getPeso(),
                noTripulada.getEmpuje(),
                noTripulada.getPotencia(),
                noTripulada.getFechaActividad()
        );
    }
}
