package com.app.controllador;

import com.app.model.repositories.AlumnoRepository;
import com.app.view.Console;

public class AlumnoController {
    private AlumnoRepository alumnoRepository;
    private Console console;

    public AlumnoController() {
        this.alumnoRepository =new AlumnoRepository();
        this.console = new Console();
    }

    public AlumnoRepository getAlumnoRepository() {
        return alumnoRepository;
    }

    public Console getConsole() {
        return console;
    }

    public void setAlumnoRepository(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    public void setConsole(Console console) {
        this.console = console;
    }
}
