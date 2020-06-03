/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.*;

import ec.edu.ups.vista.VistaElectrodomestico;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lisseth Reinoso
 */
public class ControladorElectrodomestico {
    //objeto vista
    private VistaElectrodomestico vista;
    //objeto de modelo
    private Electrodomestico modelo;
    //objeto de dao
    private IElectrodomesticoDAO dao;
    
    private Television television;
    private Lavadora lavadora;
    
    //Contructor

    

    public ControladorElectrodomestico(VistaElectrodomestico vista, Electrodomestico modelo, IElectrodomesticoDAO dao) {
        this.vista = vista;
        this.modelo = modelo;
        this.dao = dao;
    }
    
    
   //llamar al dao para llamar a television
    
    public  void registrarTelevision(){
        modelo=vista.ingresarTelevision();
        dao.crearTelevision((Television)modelo);
       
    }

    //llamar al dao para llamar a lavadora
    public  void registrarLavadora(){
        modelo=vista.ingresarLavadora();
        dao.crearLavadora((Lavadora)modelo);
    }
    
    
     public void verTelevisores() {
        List<Television> lista;
        lista = dao.listarTelevision();
        vista.mostrarTelevisiones(lista);//televisores
    }
    
    public void verLavadoras() {
        List<Lavadora> lista;
        lista = dao.listarLavadora();
        vista.mostrarLavadoras(lista);
    }
}
