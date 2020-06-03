/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.*;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lisseth Reinoso
 */
public class VistaElectrodomestico {

    //scanner
    private Scanner leer;
    
    //intanciar
    Television television=new Television();
    Lavadora lavadora=new Lavadora();
    
    public VistaElectrodomestico() {

        leer = new Scanner(System.in);
    }

    //Ingresar los datos

    public Television ingresarTelevision() {
       
        System.out.println("TELEVISION:");
        System.out.println("Ingrese el código:");
        int codigo = leer.nextInt();
        television.setCodigo(codigo);
        leer.nextLine();
        System.out.println("Ingrese descripción:");
        String des = leer.nextLine();
        television.setDescripcion(des);
        leer.nextLine();
        System.out.println("Ingrese el color:");
        String color = leer.nextLine();
        television.setColor(color);
        leer.nextLine();
        System.out.println("Ingrese el precio base:");
        double pb = leer.nextDouble();
        television.setPrecioBase(pb);
        System.out.println("Ingrese el consumo energético:");
        System.out.println("Mayor consumo energético:A     -hasta-    Menor consumo energético:F");
        String ce = leer.next();
        char con= ce.charAt(0);
        television.setConsumoEnergetico(con);
        System.out.println("Ingrese el peso:");
        int peso = leer.nextInt();
        television.setPeso(peso);
        System.out.println("Ingrese la resolución:");
        int re = leer.nextInt();
        television.setResolucion(re);
        System.out.println("¿Tiene puerto HDMI?");
        System.out.println("Ingrese true si lo tiene, de lo contrario ingrese false");
        boolean p = leer.nextBoolean();
        television.setPuertoHDMI(p);
        return new Television(re,p,codigo,des,pb,color,con,peso);
    }

    public Lavadora ingresarLavadora() {
        System.out.println("LAVADORA:");
        System.out.println("Ingrese el código:");
        int codigo = leer.nextInt();
        lavadora.setCodigo(codigo);
        leer.nextLine();
        System.out.println("Ingrese descripción:");
        String des = leer.nextLine();
        lavadora.setDescripcion(des);
        leer.nextLine();
        System.out.println("Ingrese el color:");
        String color = leer.nextLine();
        lavadora.setColor(color);
        leer.nextLine();
        System.out.println("Ingrese el precio base:");
        double pb = leer.nextDouble();
        lavadora.setPrecioBase(pb);
        System.out.println("Ingrese el consumo energético:");
        System.out.println("Mayor consumo energético:A     -hasta-    Menor consumo energético:F");
        String ce = leer.next();
        char con= ce.charAt(0);
        lavadora.setConsumoEnergetico(con);
        System.out.println("Ingrese el peso:");
        int peso = leer.nextInt();
        lavadora.setPeso(peso);
        System.out.println("Ingrese la carga:");
        int carga=leer.nextInt();
        lavadora.setCarga(carga);
        
         return new Lavadora(carga,codigo,des,pb,color,con,peso);
    }
    
    public void mostrarTelevisiones(List<Television> lista){
        for (Television television : lista) {
            System.out.println("DATOS: " + television.toString());
        }
    }
    
    public void mostrarLavadoras(List<Lavadora> lista){
        for (Lavadora lavadora : lista) {
            System.out.println("DATOS: " + lavadora.toString());
        }
    }
}
