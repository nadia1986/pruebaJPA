package com.example.pruebaJPA.controller;

import com.example.pruebaJPA.model.Persona;
import com.example.pruebaJPA.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    private IPersonaService personaServi;

    @GetMapping("/personas/listar")
    public List<Persona> listarPersonas(){

     return personaServi.getPersonas();
    }
    @PostMapping("/persona/crear")
    public String crearPersona(@RequestBody Persona perso){
        personaServi.savePersona(perso);
        return "Los datos fueron almacenados Correctamente";
    }
    @DeleteMapping("/persona/borrar/{id}")
    public String borrarPersona(@PathVariable Long id){
        personaServi.deletePersona(id);
        return "La persona fue eliminada de la base de datos";
    }

    @PutMapping("/persona/editar/{id_original}")
    public Persona editarPersona(@PathVariable Long id_original,
                                 @RequestParam (required = false, name="id") Long idNuevo,
                                 @RequestParam (required = false, name="nombre") String nuevoNombre,
                                 @RequestParam (required = false, name="apellido") String nuevoApellido,
                                 @RequestParam (required = false, name="edad") int  nuevaEdad
                                 ){
        personaServi.editPersona(id_original,idNuevo,nuevoNombre,nuevoApellido,nuevaEdad);
        Persona perso= personaServi.findPersona(idNuevo);
        return perso;

    }
}

