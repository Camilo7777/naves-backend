package com.reto.sofkanaves.controllers;

import com.reto.sofkanaves.models.Tripulada;
import com.reto.sofkanaves.models.VehiculoLanzadera;
import com.reto.sofkanaves.services.VehiculoLanzaderaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculo-lanzadera")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class VehiculoLanzaderaController {

    @Autowired
    VehiculoLanzaderaService vehiculoLanzaderaService;

    @PostMapping("/")
    public VehiculoLanzadera save(@RequestBody VehiculoLanzadera vehiculoLanzadera){
        return vehiculoLanzaderaService.save(vehiculoLanzadera);
    }

    @GetMapping("/")
    public List<VehiculoLanzadera> gatAll(){
        return vehiculoLanzaderaService.getAll();
    }
}
