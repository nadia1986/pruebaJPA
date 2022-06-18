package com.example.pruebaJPA.service;

import com.example.pruebaJPA.model.Persona;
import com.example.pruebaJPA.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    private IPersonaRepository persoRepo;

    @Override
    public List<Persona> getPersonas() {
       List <Persona> listaPersonas= persoRepo.findAll();
       return listaPersonas;
    }

    @Override
    public void savePersona( Persona perso) {
        persoRepo.save(perso);

    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);

    }

    @Override
    public Persona findPersona(Long id) {
        Persona persoEncontrada= persoRepo.findById(id).orElse(null);
        return persoEncontrada;
    }

    @Override
    public void editPersona(Long idOriginal, Long idNuevo, String nuevoNombre, String nuevoApellido, int nuevaEdad) {
        Persona perso=this.findPersona(idOriginal);
        perso.setId(idNuevo);
        perso.setNombre(nuevoNombre);
        perso.setApellido(nuevoApellido);
        perso.setEdad(nuevaEdad);
        this.persoRepo.save(perso);
    }

    @Override
    public void editPersona(Persona perso) {

        this.savePersona(perso);
    }
}
