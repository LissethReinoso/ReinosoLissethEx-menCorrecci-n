/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Lisseth Reinoso
 */
public class Lavadora extends Electrodomestico {
    
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        super(codigo, descripcion, precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public double obtenerPrecioFinal() {
       // Electrodomestico precioFinal=new Electrodomestico();
        double precio= super.obtenerPrecioFinal();
        double preciob=super.getPrecioBase();
        double preciol=precio+preciob;
       if(carga>30){
           
           preciol+=50;
          
       }else{
          
       }
        return preciol; 
    }

    @Override
    public String toString() {
        return "Lavadora{" +super.toString()+ ", carga=" + carga + ", PrecioFinal= "+this.obtenerPrecioFinal()+'}';
    }
    
}
