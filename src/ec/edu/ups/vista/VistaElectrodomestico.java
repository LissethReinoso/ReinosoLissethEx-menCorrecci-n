/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.*;
import java.awt.BorderLayout;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lisseth Reinoso
 */
public class VistaElectrodomestico {

    //scanner
    private Scanner leer;

    public VistaElectrodomestico() {

        leer = new Scanner(System.in);
    }

    //Ingresar los datos
    public Electrodomestico ingresarElectrodomestico() {
        System.out.println("Ingrese el código:");
        int codigo = leer.nextInt();
        System.out.println("Ingrese descripción:");
        String des = leer.nextLine();
        leer.nextLine();
        System.out.println("Ingrese el precio base:");
        double pb = leer.nextDouble();
        System.out.println("Ingrese el color:");
        String color = leer.nextLine();
        leer.nextLine();
        System.out.println("Ingrese el consumo energético:");
        String ce = leer.next();
        System.out.println("Ingrese el peso:");
        int peso = leer.nextInt();
        return new Electrodomestico(codigo);
    }

    public Television ingresarTelevision() {
        
        System.out.println("Ingrese el código:");
        int codigo = leer.nextInt();
        System.out.println("Ingrese descripción:");
        String des = leer.nextLine();
        leer.nextLine();
        System.out.println("Ingrese el precio base:");
        double pb = leer.nextDouble();
        System.out.println("Ingrese el color:");
        String color = leer.nextLine();
        leer.nextLine();
        System.out.println("Ingrese el consumo energético:");
        String ce = leer.next();
        System.out.println("Ingrese el peso:");
        int peso = leer.nextInt();
        System.out.println("Ingrese la resolución:");
        int re = leer.nextInt();
        System.out.println("¿Tiene puerto HDMI?");
        boolean p = leer.nextBoolean();
        return new Television();
    }

    public Lavadora ingresarLavadora() {
        System.out.println("Ingrese el código:");
        int codigo = leer.nextInt();
        System.out.println("Ingrese descripción:");
        String des = leer.nextLine();
        leer.nextLine();
        System.out.println("Ingrese el precio base:");
        double pb = leer.nextDouble();
        System.out.println("Ingrese el color:");
        String color = leer.nextLine();
        leer.nextLine();
        System.out.println("Ingrese el consumo energético:");
        String ce = leer.next();
        System.out.println("Ingrese el peso:");
        int peso = leer.nextInt();
         return new Lavadora();
    }
    
    public void mostrarTelevisiones(List<Television> televisiones){
        for (Television television : televisiones) {
            System.out.println("DATOS: " + televisiones);
        }
    }

}
