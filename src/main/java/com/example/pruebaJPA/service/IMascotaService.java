package com.example.pruebaJPA.service;

import com.example.pruebaJPA.model.Mascota;
import com.example.pruebaJPA.model.Persona;

import java.util.List;

public interface IMascotaService {

    List<Mascota> getMascotas();
    void saveMascota(Mascota mascota);
    public void deleteMascota(Long id_mascota);
    public Mascota findMascota(Long id_mascota);
    void editMascota(Long idOriginal, Long id_mascotaNuevo,
                     String nuevoNombre,
                     String nuevoEspecie,
                     String  nuevaRaza,
                     String nuevoColor);
}
