package com.app.model.entity;

import com.app.model.entity.abstracto.Persona;

public class Alumno extends Persona{
    private String legajo;
    private double promedio;
    private int cantAsignaturasCursando;
    private int cantAsignaturasAprobadas;

    public Alumno(String nombre, String apellido, int edad,String legajo,double promedio,int cantAsignaturasAprobadas,int cantAsignaturasCursando) {
        super(nombre, apellido, edad);
        this.legajo = legajo;
        this.promedio = promedio;
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
