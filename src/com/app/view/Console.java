package com.app.view;

import com.app.controllador.PersonaController;
import com.app.model.entity.abstracto.Persona;

import java.util.Scanner;
public class Console {
    private Scanner scanner;

    public Console() {
        this.scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void cerrarOperaciones(){
        this.scanner.close();
    }

    public String ingresoNombre(){
        System.out.println("Ingrese nombre");
        return scanner.nextLine();
    }
    public String ingresoApellido(){
        System.out.println("Ingrese apellido");
        return scanner.nextLine();
    }
    public int ingresoEdad(){
        System.out.println("Ingrese edad");
        int aux = scanner.nextInt();
        this.getScanner().nextLine();
        return aux;
    }
    public int ingresoCantidadAsignaturasAprobadas(){
        System.out.println("Ingrese cantidad de asignaturas aprobadas");
        int aux = scanner.nextInt();
        this.getScanner().nextLine();
        return aux;
    }
    public int ingresoCantidadAsignaturasCursando(){
        System.out.println("Ingrese cantidad de asignaturas cursando");
        int aux = scanner.nextInt();
        this.getScanner().nextLine();
        return aux;
    }
    public int ingresoHorasTrabajadas(){
        System.out.println("Ingrese cantidad de horas trabajadas");
        int aux = scanner.nextInt();
        this.getScanner().nextLine();
        return aux;
    }
    public double ingresoPromedio(){
        System.out.println("Ingrese promedio");
        double aux = scanner.nextDouble();
        this.getScanner().nextLine();
        return aux;
    }
    public String ingresoMateria(){
        System.out.println("Ingrese materia");
        return scanner.nextLine();
    }
    public int ingresoInt(){
        int aux = scanner.nextInt();
        this.getScanner().nextLine();
        return aux;
    }
    public String ingresoCarrera(){
        System.out.println("Ingrese carrera a seguir");
        return scanner.nextLine();
    }
    public int menuProf(){
        System.out.println("Menu");
        System.out.println("1- Agregar profesor");
        System.out.println("2- Mostrar profesor/es");
        System.out.println("3- Buscar profesor ");
        System.out.println("4- Modificar horas trabajadas");
        System.out.println("5- Eliminar profesor");
        System.out.println("0- Salir");
        return this.ingresoInt();
    }
    public int menuAlumnos(){
        System.out.println("Menu");
        System.out.println("1- Agregar alumno");
        System.out.println("2- Mostrar alumno/s");
        System.out.println("3- Buscar alumno ");
        System.out.println("4- Modificar promedio");
        System.out.println("5- Eliminar alumno");
        System.out.println("0- Salir");
        return this.ingresoInt();
    }
    public int menuPrincipal(){
        System.out.println("Menu");
        System.out.println("1- Mostrar personas");
        System.out.println("2- Gestionar estudiantes");
        System.out.println("3- Gestionar profesores");
        System.out.println("0- Salir");
        return this.ingresoInt();
    }




}
