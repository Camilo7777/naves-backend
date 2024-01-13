package com.reto.sofkanaves.controllers;

import com.reto.sofkanaves.models.NoTripulada;
import com.reto.sofkanaves.models.VehiculoLanzadera;
import com.reto.sofkanaves.services.NoTripuladaService;
import com.reto.sofkanaves.services.VehiculoLanzaderaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/no-tripulada")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class NoTripuladaController {
    @Autowired
    NoTripuladaService noTripuladaService;
    @PostMapping("/")
    public NoTripulada save(@RequestBody NoTripulada noTripulada){
        return noTripuladaService.save(noTripulada);
    }

    @GetMapping("/filtros")
    public List<NoTripulada> filtrarNoTripulada(@RequestBody NoTripulada noTripulada) {
        return noTripuladaService.filtrarNoTripulada(noTripulada);
    }

    @GetMapping("/")
    public List<NoTripulada> gatAll(){

        return noTripuladaService.getAll();
    }
}
