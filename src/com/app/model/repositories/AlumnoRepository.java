package com.app.model.repositories;

import com.app.model.entity.Alumno;
import com.app.model.entity.Materia;
import com.app.model.entity.Profesor;

import java.util.ArrayList;

public class AlumnoRepository {

    private ArrayList<Alumno> lista;

    public AlumnoRepository( ) {
        this.lista = new ArrayList<>();
    }

    public ArrayList<Alumno> getListaAlumno() {
        return lista;
    }

    public void setListaAlumno(ArrayList<Alumno> listaAlumno) {
        this.lista = listaAlumno;
    }

    public int posListaXLegajo(String id){
        int i = 0;
        while(i <this.lista.size()){
            if(this.lista.get(i).getLegajo().equals(id)){
                return i;
            }
            i++;
        }
        return -1;
    }
    public int posListaXNombreYApellido(String nombre,String apellido){
        int i = 0;
        while(i <this.lista.size()){
            if(this.lista.get(i).getNombre().equals(nombre) && this.lista.get(i).getApellido().equals(apellido)){
                return i;
            }
            i++;
        }
        return -1;
    }


    public Alumno takeList(String legajo){
        Alumno devol;
        int pos = posListaXLegajo(legajo);
        if(pos != -1){
            devol = this.lista.get(pos);
            for(int y = pos;y<this.lista.size()-1;y++){
                this.lista.set(y,this.lista.get(y+1));
            }
            this.lista.remove(this.lista.size()-1);
            return devol;
        }else{
            return null;
        }
    }
    public void deleteProfesorList(String legajo){
        int pos = this.posListaXLegajo(legajo);
        if(pos != -1){
            this.getListaAlumno().remove(pos);
        }

    }

}
