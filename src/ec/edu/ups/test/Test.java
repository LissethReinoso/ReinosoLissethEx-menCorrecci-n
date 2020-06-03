/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorElectrodomestico;
import ec.edu.ups.dao.ElectrodomesticoDAO;
import ec.edu.ups.modelo.*;

import ec.edu.ups.vista.VistaElectrodomestico;

/**
 *
 * @author Lisseth Reinoso
 */
public class Test {

    public static void main(String[] args) {

        VistaElectrodomestico vista = new VistaElectrodomestico();
        ElectrodomesticoDAO dao = new ElectrodomesticoDAO();
        Electrodomestico modelo = new Electrodomestico();
        ControladorElectrodomestico conte = new ControladorElectrodomestico(vista, modelo, dao);

        //TELEVISORES
        conte.registrarTelevision();
        conte.registrarTelevision();
        conte.registrarTelevision();

        //LAVADORAS
        conte.registrarLavadora();
        conte.registrarLavadora();
        conte.registrarLavadora();

        conte.verLavadoras();
        conte.verTelevisores();
        

    }
}
