package com.app.model.entity;

import com.app.model.entity.abstracto.Persona;

import java.util.UUID;

public class Alumno extends Persona{

    private double promedio;
    private int cantAsignaturasCursando;
    private int cantAsignaturasAprobadas;
    private String nombreCarrera;


    public Alumno(String nombre, String apellido, int edad,String nombreCarrera) {
        super(nombre, apellido, edad);
        this.promedio = 0;
        this.nombreCarrera = nombreCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
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



    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void setCantAsignaturasCursando(int cantAsignaturasCursando) {
        this.cantAsignaturasCursando = cantAsignaturasCursando;
    }

    public void setCantAsignaturasAprobadas(int cantAsignaturasAprobadas) {
        this.cantAsignaturasAprobadas = cantAsignaturasAprobadas;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    @Override
    /*
    public String toString(){
        return "\n|cantAprovadas" + getCantAsignaturasAprobadas() + "\n";
    }
    */


    public String toString(){
        return"\n|Alumno " + getNombre() +" "+ getApellido() + " |Edad " + getEdad() + " |Carrera " + getNombreCarrera() + " |Promedio " + getPromedio() + " |CantAsignaturasAprobadas " + getCantAsignaturasAprobadas() +"\n";
    }

}
