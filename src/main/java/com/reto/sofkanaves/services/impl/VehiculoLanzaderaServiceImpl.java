package com.reto.sofkanaves.services.impl;

import com.reto.sofkanaves.models.VehiculoLanzadera;
import com.reto.sofkanaves.repositories.VehiculoLanzaderaRepository;
import com.reto.sofkanaves.services.VehiculoLanzaderaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoLanzaderaServiceImpl implements VehiculoLanzaderaService {

    @Autowired
    VehiculoLanzaderaRepository vehiculoLanzaderaRepository;
    @Override
    public VehiculoLanzadera save(VehiculoLanzadera vehiculoLanzadera) {
        return vehiculoLanzaderaRepository.save(vehiculoLanzadera);
    }

    @Override
    public List<VehiculoLanzadera> getAll() {
        return vehiculoLanzaderaRepository.findAll();
    }
}
