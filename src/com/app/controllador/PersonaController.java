package com.app.controllador;

import com.app.model.entity.abstracto.Persona;
import com.app.model.repositories.PersonaRepository;
import com.app.view.Console;

abstract public class PersonaController {
    private PersonaRepository personaRepository;
    private Console console;

    public PersonaController(Console console,PersonaRepository personaRepository) {
        this.console = console;
        this.personaRepository = personaRepository;
    }

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





}








