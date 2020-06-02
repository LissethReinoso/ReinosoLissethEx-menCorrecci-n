/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.vista.VistaElectrodomestico;

/**
 *
 * @author Lisseth Reinoso
 */
public class Test {
    
    public static void main(String[]  args){
        
        VistaElectrodomestico vista=new VistaElectrodomestico();
       
        //Televisores
        System.out.println("Televisiones:");
        vista.ingresarTelevision();
        vista.ingresarTelevision();
        vista.ingresarTelevision();
        System.out.println("Lavadoras:");
        vista.ingresarLavadora();
        vista.ingresarLavadora();
        vista.ingresarLavadora();
        
    }
}
