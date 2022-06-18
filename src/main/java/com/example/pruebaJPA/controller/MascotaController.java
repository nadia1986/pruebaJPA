package com.example.pruebaJPA.controller;

import com.example.pruebaJPA.model.Mascota;
import com.example.pruebaJPA.model.Persona;
import com.example.pruebaJPA.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {
    @Autowired
    private IMascotaService mascotaServi;

    @PostMapping("/mascota/crear")
    public String agregarMascota(@RequestBody Mascota mascota){
        mascotaServi.saveMascota(mascota);
        return "Los datos fueron almacenados Correctamente. Mascota agregada";
    }

}
