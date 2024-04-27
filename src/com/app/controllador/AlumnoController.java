package com.app.controllador;

import com.app.model.entity.Alumno;
import com.app.model.entity.abstracto.Persona;
import com.app.model.repositories.PersonaRepository;
import com.app.view.Console;

public class AlumnoController extends PersonaController implements IGestionUsuario,ICrearYAgregar{
    public AlumnoController(Console console, PersonaRepository personaRepository) {
        super(console, personaRepository);
    }

    public AlumnoController(Console console) {
        super(console);
        this.setPersonaRepository(new PersonaRepository());
    }

    public AlumnoController() {
        this.setPersonaRepository(new PersonaRepository());
        this.setConsole(new Console());
    }

    @Override
    public void gestion() {

        int pos;

        do{
            switch (pos = this.getConsole().menuAlumnos()) {
                case 0:
                    break;
                case 1:
                    this.crearYAgregar();
                    break;
                case 2:
                    this.printList();
                    break;
                case 3:
                    Persona aux = this.getPersonaRepository().personaXNombreYApellido(this.getConsole().ingresoNombre(),this.getConsole().ingresoApellido());
                    if(aux != null){
                        System.out.println(aux.toString());
                    }else{
                        System.out.println("No se encontro");
                    }
                    break;
                case 4:

                    Alumno auxMod =(Alumno) this.getPersonaRepository().personaXNombreYApellido(this.getConsole().ingresoNombre(),this.getConsole().ingresoApellido());
                    if(auxMod != null){
                        System.out.println(auxMod.toString());
                        //auxMod.setNombreCarrera(this.getConsole().ingresoCarrera());
                        auxMod.setPromedio(this.getConsole().ingresoPromedio());
                    }else{
                        System.out.println("No se encontro");
                    }
                    break;
                case 5:

                    if(this.getPersonaRepository().deleteElementList(
                            this.getPersonaRepository().personaXNombreYApellido(this.getConsole().ingresoNombre(),this.getConsole().ingresoApellido())
                                    .getId())
                            ==-1){
                        System.out.println("No se encontro Persona");
                    }
                    break;

                default:
                    System.out.println("No se reconocio opcion");
                    break;
            }
        } while(pos != 0);
    }

    @Override
    public void crearYAgregar() {
        this.getPersonaRepository().getListaPersona().add(new Alumno(this.getConsole().ingresoNombre(),this.getConsole().ingresoApellido(),this.getConsole().ingresoEdad(),this.getConsole().ingresoMateria()));
    }
}
