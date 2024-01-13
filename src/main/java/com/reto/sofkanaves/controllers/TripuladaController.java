package com.reto.sofkanaves.controllers;

import com.reto.sofkanaves.models.NoTripulada;
import com.reto.sofkanaves.models.Tripulada;
import com.reto.sofkanaves.services.TripuladaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tripulada")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class TripuladaController {
    @Autowired
    TripuladaService tripuladaService;
    @PostMapping("/")
    public Tripulada save(@RequestBody Tripulada tripulada){
        return tripuladaService.save(tripulada);
    }


    @GetMapping("/")
    public List<Tripulada> gatAll(){
        return tripuladaService.getAll();
    }
}
