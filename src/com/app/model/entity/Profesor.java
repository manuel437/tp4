package com.app.model.entity;

import com.app.model.entity.abstracto.Persona;

import java.util.UUID;

public class Profesor extends Persona {
    private String materia;
    private String idProfesor;

    public Profesor(String nombre, String apellido, int edad) {
        super(nombre,apellido,edad);
        this.idProfesor = "prof" + UUID.randomUUID().toString();
    }

    public String getMateria() {
        return materia;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    @Override
    public String toString(){
        return
                "Profesor " + getNombre() + " " + getApellido() +
                "\nEdad " + getEdad() + "\n\n";
    }


}
