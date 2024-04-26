package com.app.model.repositories;

import com.app.model.entity.abstracto.Persona;

import java.util.ArrayList;

public class PersonaRepository {
    private ArrayList<Persona> lista;

    public PersonaRepository( ) {
        this.lista = new ArrayList<>();
    }

    public ArrayList<Persona> getListaPersona() {
        return lista;
    }

    public void setListaPersona(ArrayList<Persona> listaPersona) {
        this.lista = listaPersona;
    }

    public void addList(Persona p){
        this.lista.add(p);
    }


    public int posListaXId(String id){
        int i = 0;
        while(i <this.lista.size()){
            if(this.lista.get(i).getId().equals(id)){
                return i;
            }
            i++;
        }
        return -1;
    }
    public int posListaXNombreYApellido(String nombre,String apellido){
        int i = 0;
        while(i <this.lista.size()){
            if(this.lista.get(i).getNombre().equalsIgnoreCase(nombre) && this.lista.get(i).getApellido().equalsIgnoreCase(apellido)){
                return i;
            }
            i++;
        }
        return -1;
    }

    public Persona personaXNombreYApellido(String nombre,String apellido){

        int pos = posListaXNombreYApellido(nombre,apellido);
        if(pos != -1){
            return this.lista.get(pos);
        }else{
            return null;
        }

    }


    public Persona takeElementList(String id){
        Persona devol;
        int pos = posListaXId(id);
        if(pos != -1){
            devol = this.lista.get(pos);
            for(int y = pos;y<this.lista.size()-1;y++){
                this.lista.set(y,this.lista.get(y+1));
            }
            this.lista.removeLast();
            return devol;
        }else{
            return null;
        }
    }
    public int deleteElementList(String id){
        int pos = this.posListaXId(id);
        if(pos != -1) {
            this.getListaPersona().remove(pos);
        }
        return pos;
    }


}
