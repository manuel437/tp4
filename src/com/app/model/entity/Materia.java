package com.app.model.entity;

import com.app.controllador.AlumnoController;

import java.util.UUID;

public class Materia {
    private String nombreMat;

    private int cupoMax;
    private String idProfesor;
    private String idMateria;
    private AlumnoController alumnos;

    public Materia(String nom,int cantidad,String idProf) {
        this.nombreMat = nom;
        this.idProfesor = idProf;
        this.idMateria = "materia" + UUID.randomUUID().toString();

        this.cupoMax = cantidad;
        this.alumnos = new AlumnoController();
    }

    public String getNombreMat() {
        return nombreMat;
    }

    public String getIdMateria() {
        return idMateria;
    }

    public int getCupoMax() {
        return cupoMax;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public AlumnoController getAlumnos() {
        return alumnos;
    }

    public void setNombreMat(String nombreMat) {
        this.nombreMat = nombreMat;
    }

    public void setCupoMax(int cupoMax) {
        this.cupoMax = cupoMax;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public void setAlumnos(AlumnoController alumnos) {
        this.alumnos = alumnos;
    }

    public int cantAlumnos(){
        return this.getAlumnos().getAlumnoRepository().getListaAlumno().size();
    }





    @Override
    public String toString(){
        return "|Materia: " + getNombreMat() +"|Cupo: " + this.cantAlumnos() + "/" + getCupoMax() + "|";
    }
}
