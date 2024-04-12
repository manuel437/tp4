package com.app.controllador;

import com.app.model.entity.Profesor;
import com.app.model.repositories.ProfesorRepository;
import com.app.view.Console;

public class ProfesorController {

    private ProfesorRepository profesorRepository;
    private Console console;

    public ProfesorController() {
        this.console = new Console();
        this.profesorRepository = new ProfesorRepository();
    }

    public ProfesorRepository getProfesorRepository() {
        return profesorRepository;
    }

    public Console getConsole() {return console;}


    public void createAndAdd(){
       this.profesorRepository.addList(new Profesor(this.console.ingresoNombre(),this.console.ingresoApellido(),this.console.ingresoEdad(),this.console.ingresoMateria()));
    }

    public void cargarProfesor(Profesor prof){
        this.profesorRepository.getLista().addLast(prof);
    }

    public void printListProfesor(){
        System.out.println(this.profesorRepository.getLista().toString());
    }
    public void borrarProfesor(){
        this.profesorRepository.getLista().remove(this.profesorRepository.posListaXNombreYApellido(this.console.ingresoNombre(),this.console.ingresoApellido()));
    }

    public void modProfesor(){
        int pos = this.profesorRepository.posListaXNombreYApellido(this.console.ingresoNombre(),this.console.ingresoApellido());
        System.out.println("Ingrese opcion");
        if(pos != 0){
            switch(this.console.ingresoInt()){
                case 1:
                    break;
                default:
                    System.out.println("No se reconocio opcion");
                    break;
            }
        }
    }






    public void menuProfesor(){
        int opc;
        do{

            switch(opc=this.console.menuProf()){
                case 0:
                    System.out.println("Cerrando");
                    break;
                case 1:
                    this.createAndAdd();
                    break;
                case 2:
                    this.printListProfesor();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    this.borrarProfesor();
                    break;
                default:
                    System.out.println("Opcion no valida, reintente");
                    break;


            }
            System.out.print("\n");


        }while(opc != 0);
    }


}
