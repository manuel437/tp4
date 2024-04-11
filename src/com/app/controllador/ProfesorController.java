package com.app.controllador;

import com.app.model.entity.Profesor;
import com.app.model.repositories.ProfesorRepository;
import com.app.vista.ProfesorView;

public class ProfesorController {

    private ProfesorRepository profesorRepository;

    public ProfesorController() {

        this.profesorRepository = new ProfesorRepository();
    }

    public ProfesorRepository getProfesorRepository() {
        return profesorRepository;
    }



    public void cargarProfesor(Profesor prof){
        this.profesorRepository.getLista().addLast(prof);
    }

    public void printListProfesor(){
        /*
        for(Profesor p : this.profesorRepository.getLista()){
            System.out.println(this.profesorRepository.getLista().toString());
        }
        */

            System.out.println(this.profesorRepository.getLista().toString());

    }



}
