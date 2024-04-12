package com.app.model.repositories;

import com.app.model.entity.Profesor;

import java.util.ArrayList;

public class ProfesorRepository {
    private ArrayList<Profesor> lista;

    public ProfesorRepository() {
        this.lista = new ArrayList<>();
    }

    public ArrayList<Profesor> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Profesor> lista) {
        this.lista = lista;
    }

    public void addList(Profesor p){
        this.lista.add(p);
    }

    public int posListaXId(String id){
        int i = 0;
        while(i <this.lista.size()){
            if(this.lista.get(i).getIdProfesor().equals(id)){
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
    public String idXNombre(String nombre){
        int i = 0;
        while(i <this.lista.size()){
            if(this.lista.get(i).getNombre().equals(nombre)){
                return this.lista.get(i).getIdProfesor();
            }
            i++;
        }
        return "null";
    }

    public Profesor takeList(String id){
        Profesor devol;
        int pos = posListaXId(id);
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
    public void deleteProfesorList(String id){
        Profesor  p = this.takeList(id);
        p = null;
    }


}
