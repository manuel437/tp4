package com.app.controllador;

import com.app.model.entity.abstracto.Persona;
import com.app.model.repositories.PersonaRepository;
import com.app.view.Console;

abstract public class PersonaController {
    private PersonaRepository personaRepository;
    private Console console;

    public PersonaController(Console console) {
        this.console = console;
        this.personaRepository = new PersonaRepository();
    }

    public PersonaController( ) {
        this.console = new Console();
        this.personaRepository = new PersonaRepository();
    }

    public Console getConsole() {
        return console;
    }

    public PersonaRepository getPersonaRepository() {
        return personaRepository;
    }

    public void setConsole(Console console) {
        this.console = console;
    }

    public void setPersonaRepository(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public void printList(){
        System.out.println(this.personaRepository.getListaPersona().toString());
    }




    /*
    public void menuGestion( ) {
        int pos;
        do{
            switch (pos = this.getConsole().menuPrincipal()) {
                case 1:
                    System.out.println(this.getPersonaRepository().getListaPersona().toString());
                    break;
                case 2:
                    Persona aux = this.personaXNombreYApellido(this.getConsole().ingresoNombre(),this.getConsole().ingresoApellido());
                    if(aux != null){
                        System.out.println(aux.toString());
                    }else{
                        System.out.println("No se encontro");
                    }
                case 3:
                    this.menuGestionAlumnos();
                    break;
                case 4:
                    this.menuGestionProfesores();
                    break;


                default:
                    System.out.println("No se reconocio opcion");
                    break;
            }
        } while(pos != 0);
    }

*/
}








