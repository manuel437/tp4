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


}
