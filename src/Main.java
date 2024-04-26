import com.app.controllador.AlumnoController;
import com.app.controllador.PersonaController;
import com.app.controllador.ProfesorController;
import com.app.model.entity.Alumno;
import com.app.model.entity.Profesor;
import com.app.model.entity.abstracto.Persona;
import com.app.model.repositories.PersonaRepository;
import com.app.view.Console;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Console consola = new Console();
        AlumnoController alumnoController = new AlumnoController(consola);
        ProfesorController profesorController = new ProfesorController(consola);
        alumnoController.getPersonaRepository().getListaPersona().add(new Alumno("pepe","lana",22,"Tec.Programacion"));
        alumnoController.getPersonaRepository().getListaPersona().add(new Alumno("merce","benz",23,"Tec.Gestion ambiental"));
        alumnoController.getPersonaRepository().getListaPersona().add(new Alumno("fort","klr",24,"Ing.Naval"));
        int opc;
        do{
            switch(opc = consola.menuPrincipal()){
                case 1:
                    profesorController.printList();
                    alumnoController.printList();
                    break;
                case 2:
                    alumnoController.gestion();
                    break;
                case 3:
                    profesorController.gestion();
                    break;
            }
        }while(opc != 0);
        consola.cerrarOperaciones();
    }



}
