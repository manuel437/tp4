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




    public String cargaxTecladoNombre(){
        System.out.println("Ingrese nombre");
        return scanner.nextLine();
    }
    public String cargaxTecladoApellido(){
        System.out.println("Ingrese apellido");
        return scanner.nextLine();
    }
    public int cargaxTecladoEdad(){
        System.out.println("Ingrese edad");
        int aux = scanner.nextInt();
        this.getScanner().close();
        return aux;
    }

}
