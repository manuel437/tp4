package com.app.view;

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
    public String ingresoMateria(){
        System.out.println("Ingrese materia");
        return scanner.nextLine();
    }
    public int ingresoInt(){
        int aux = scanner.nextInt();
        this.getScanner().nextLine();
        return aux;
    }
    public int menuProf(){
        System.out.println("Menu");
        System.out.println("1- Agregar profesor");
        System.out.println("2- Mostrar profesor");
        System.out.println("3- Buscar profesor ");
        System.out.println("4- Modificar profesor");
        System.out.println("5- Eliminar profesor");
        System.out.println("0- Salir");
        return this.ingresoInt();
    }
    public int menuEst(){
        System.out.println("Menu");
        System.out.println("1- Agregar alumno");
        System.out.println("2- Mostrar alumno");
        System.out.println("3- Buscar alumno ");
        System.out.println("4- Modificar alumno");
        System.out.println("5- Eliminar alumno");
        System.out.println("0- Salir");
        return this.ingresoInt();
    }




}
