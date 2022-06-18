package com.example.pruebaJPA.service;

import com.example.pruebaJPA.model.Persona;

import java.util.List;

public interface IPersonaService {
    List<Persona> getPersonas();
     void savePersona(Persona perso);
    public void deletePersona(Long id);
    public Persona findPersona(Long id);
    void editPersona(Long idOriginal, Long idNuevo,String nuevoNombre, String nuevoApellido, int nuevaEdad);

    void editPersona(Persona perso);
}
