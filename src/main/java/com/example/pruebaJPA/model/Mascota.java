package com.example.pruebaJPA.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@Entity
public class Mascota {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id_mascota;
    private String nombre;
    private String especie;
    private String raza;
    private String color;

    public Mascota() {
    }
    public Mascota(Long id_mascota, String nombre, String especie, String raza, String color){
        this.id_mascota= id_mascota;
        this.nombre= nombre;
        this.especie= especie;
        this.raza= raza;
        this.color=color;

    }
}
