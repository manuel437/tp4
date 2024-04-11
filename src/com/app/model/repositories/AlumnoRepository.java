package com.app.model.repositories;

import com.app.model.entity.Alumno;

import java.util.ArrayList;

public class AlumnoRepository {
    private ArrayList<Alumno> listaAlumno;

    public AlumnoRepository( ) {
        this.listaAlumno = new ArrayList<>();
    }

    public ArrayList<Alumno> getListaAlumno() {
        return listaAlumno;
    }

    public void setListaAlumno(ArrayList<Alumno> listaAlumno) {
        this.listaAlumno = listaAlumno;
    }


}
