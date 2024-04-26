package com.app.model.entity;

import com.app.model.entity.abstracto.Persona;

public class Profesor extends Persona {
    private int horasTrabajadas;

    public Profesor(String nombre, String apellido, int edad) {
        super(nombre,apellido,edad);

        this.horasTrabajadas = 0;
    }
    public Profesor(String nombre, String apellido, int edad,int horasTra) {
        super(nombre,apellido,edad);

        this.horasTrabajadas = horasTra;
    }


    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    @Override
    public String toString(){
        return"\n|Profesor " + getNombre() + " " + getApellido() + " |Edad " + getEdad()  + "|Horas trabajadas " + getHorasTrabajadas() + "\n";
    }
}
