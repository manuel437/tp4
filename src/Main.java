import com.app.controllador.ProfesorController;
import com.app.model.entity.Profesor;
import com.app.view.Console;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        ProfesorController pro = new ProfesorController();
        pro.cargarProfesor(new Profesor("pepe","foe",34,"mates"));
        pro.cargarProfesor(new Profesor("pepo","forty",24,"mates"));
        pro.cargarProfesor(new Profesor("pepi","foa",36,"mates"));
        pro.cargarProfesor(new Profesor("pepu","foa",36,"mates"));
        pro.printListProfesor();
        Profesor pro2 = pro.getProfesorRepository().takeList(pro.getProfesorRepository().idXNombre(pro.getConsole().ingresoNombre()));
        pro.printListProfesor();
        System.out.printf("se saco :" + pro2.toString());








    }
}