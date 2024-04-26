package com.app.controllador;

import com.app.model.entity.Profesor;
import com.app.model.entity.abstracto.Persona;
import com.app.view.Console;

public class ProfesorController extends PersonaController implements IGestionUsuario,ICrearYAgregar {
    public ProfesorController() {
    }

    public ProfesorController(Console console) {
        super(console);
    }

    @Override
    public void gestion() {

            int pos;

            do{
                switch (pos = this.getConsole().menuProf()) {
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

                        Profesor auxMod =(Profesor) this.getPersonaRepository().personaXNombreYApellido(this.getConsole().ingresoNombre(),this.getConsole().ingresoApellido());
                        if(auxMod != null){
                            System.out.println(auxMod.toString());
                            auxMod.setHorasTrabajadas(this.getConsole().ingresoHorasTrabajadas());
                        }else{
                            System.out.println("No se encontro");
                        }
                        break;
                    case 5:

                        if(this.getPersonaRepository().deleteElementList(this.getPersonaRepository().personaXNombreYApellido(this.getConsole().ingresoNombre(),this.getConsole().ingresoApellido()).getId()) == -1){
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
        this.getPersonaRepository().getListaPersona().add(new Profesor(this.getConsole().ingresoNombre(),this.getConsole().ingresoApellido(),this.getConsole().ingresoEdad(),this.getConsole().ingresoHorasTrabajadas()));
    }


}
