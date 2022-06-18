package com.example.pruebaJPA.service;

import com.example.pruebaJPA.model.Mascota;
import com.example.pruebaJPA.model.Persona;
import com.example.pruebaJPA.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository mascoRepo;


    @Override
    public List<Mascota> getMascotas() {
        List<Mascota> listarMascotas= mascoRepo.findAll();
        return listarMascotas;
    }

    @Override
    public void saveMascota(Mascota mascota) {
        mascoRepo.save(mascota);

    }

    @Override
    public void deleteMascota(Long id_mascota) {
        mascoRepo.deleteById(id_mascota);


    }

    @Override
    public Mascota findMascota(Long id_mascota) {
        return mascoRepo.findById(id_mascota).orElse(null);
    }

    @Override
    public void editMascota(Long idOriginal, Long id_mascotaNuevo,
                            String nuevoNombre,
                            String nuevoEspecie,
                            String nuevaRaza,
                            String nuevoColor) {

        Mascota mascota = this.findMascota(idOriginal);
        mascota.setId_mascota(id_mascotaNuevo);
        mascota.setNombre(nuevoNombre);
        mascota.setEspecie(nuevoEspecie);
        mascota.setRaza(nuevaRaza);
        mascota.setColor(nuevoColor);
        this.saveMascota(mascota);
    }
}

