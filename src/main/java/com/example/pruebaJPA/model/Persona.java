package com.example.pruebaJPA.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
    }
    public Persona(Long id, String nombre, String apellido, int edad){
        this.id= id;
        this.nombre=nombre;
        this.apellido= apellido;
        this.edad= edad;
    }

}
