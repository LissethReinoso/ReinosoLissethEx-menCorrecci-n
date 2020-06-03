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
public class Television extends Electrodomestico{
    
    private int resolucion;
    private boolean puertoHDMI;

    //constructores
    public Television() {
    }

    public Television(int codigo) {
        super(codigo);
    }

    public Television(int resolucion, boolean puertoHDMI, int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        super(codigo, descripcion, precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.puertoHDMI = puertoHDMI;
    }
    
    

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    @Override
    public double obtenerPrecioFinal() {
        
        double preciot=super.obtenerPrecioFinal();
        double preciob=super.getPrecioBase();
        //resolucion
        preciot+=preciob;
        if(resolucion>40){
            preciot=preciot*30/100;
        }
        
        //si tiene puerto HDMI
        if(puertoHDMI==true){
            preciot+=50;
        }
        return preciot; 
    }

    @Override
    public String toString() {
        return "Television{" +super.toString()+ ", resolucion=" + resolucion + ", puertoHDMI=" + puertoHDMI + ", Precio final= "+this.obtenerPrecioFinal()+'}';
    }
    
    
    
    
    
    
    
    
    
}
