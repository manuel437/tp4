package com.app.model.entity;

import com.app.model.entity.abstracto.Persona;

import java.util.UUID;

public class Alumno extends Persona{
    private String legajo;
    private double promedio;
    private int cantAsignaturasCursando;
    private int cantAsignaturasAprobadas;

    public Alumno(String nombre, String apellido, int edad,int cantAsignaturasAprobadas,int cantAsignaturasCursando) {
        super(nombre, apellido, edad);
        this.legajo = UUID.randomUUID().toString();
        this.promedio = 0;
        this.cantAsignaturasAprobadas = cantAsignaturasAprobadas;
        this.cantAsignaturasCursando = cantAsignaturasCursando;

    }

    public String getLegajo() {
        return legajo;
    }

    public double getPromedio() {
        return promedio;
    }

    public int getCantAsignaturasCursando() {
        return cantAsignaturasCursando;
    }

    public int getCantAsignaturasAprobadas() {
        return cantAsignaturasAprobadas;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void setCantAsignaturasCursando(int cantAsignaturasCursando) {
        this.cantAsignaturasCursando = cantAsignaturasCursando;
    }

    public void setCantAsignaturasAprobadas(int cantAsignaturasAprobadas) {
        this.cantAsignaturasAprobadas = cantAsignaturasAprobadas;
    }
    @Override
    public String toString(){
        return"|N°Legajo " + getLegajo() + "\n|Alumno " + getNombre() + getApellido() + "\n|Edad " + getEdad()  ;
    }

}
