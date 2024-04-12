package com.app.model.repositories;

import com.app.model.entity.Materia;
import com.app.model.entity.Profesor;

import java.util.ArrayList;

public class MateriaRepository {
    private ArrayList<Materia> lista;

    public MateriaRepository() {
        this.lista = new ArrayList<>();
    }

    public ArrayList<Materia> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Materia> lista) {
        this.lista = lista;
    }

    public void addList(Materia m){
        this.lista.add(m);
    }

    public int posListaXId(String id){
        int i = 0;
        while(i <this.lista.size()){
            if(this.lista.get(i).getIdMateria().equals(id)){
                return i;
            }
            i++;
        }
        return -1;
    }

    public Materia takeList(String id){
        int pos = posListaXId(id);
        if(pos != -1){
            Materia devol = this.lista.get(pos);
            for(int y = pos;y<this.lista.size()-1;y++){
                this.lista.set(y,this.lista.get(y+1));
            }
            this.lista.removeLast();
            return devol;
        }else{
            return null;
        }
    }
    public void deleteMateriaList(String id){
        int pos = this.posListaXId(id);
        if(pos != -1){
            this.getLista().remove(pos);
        }

    }

}
