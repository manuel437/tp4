package com.app.model.entity;

import com.app.model.entity.abstracto.Persona;

public class Profesor extends Persona {
    private String materia;
    private String idProfesor;

    public Profesor(String nombre, String apellido, int edad,String materia,String idProfesor) {
        super(nombre,apellido,edad);
        this.idProfesor = idProfesor;
        this.materia = materia;

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
        return "Id " + getIdProfesor() +
                "\nProfesor " + getNombre() + " " + getApellido() +
                "\nEdad " + getEdad() + " Materia " +getMateria() + "\n\n";
    }


}
