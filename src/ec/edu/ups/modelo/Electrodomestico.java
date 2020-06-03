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
public class Electrodomestico implements Comparable<Electrodomestico>{
    private int codigo;
    private String descripcion;
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;

    //Constructores
    public Electrodomestico() {
    }

    public Electrodomestico(int codigo) {
        this.codigo = codigo;
    }

    public Electrodomestico(int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    
    

    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double obtenerPrecioFinal(){
        char A=0;
        char B=0;
        char C=0;
        char D=0;
        char E=0;
        char F=0;
        //precio
       double precioFinal=0.00;
        
        if(consumoEnergetico==A){
            precioFinal+=100.0;
        }if(consumoEnergetico==B){
            precioFinal+=80.0;
        }if(consumoEnergetico==C){
            precioFinal+=60.0;
        }if(consumoEnergetico==D){
            precioFinal+=50.0;
        }if(consumoEnergetico==E){
            precioFinal+=30.0;
        }if(consumoEnergetico==F){
            precioFinal+=10.0;
        }
        
        //peso
        if(peso>0 && peso<20){
            precioFinal=10;
        }if(peso>20 && peso<50){
            precioFinal=50;
        }if(peso>50 && peso<80){
            precioFinal=80;
        }if(peso>80){
            precioFinal=80;
        }
        return precioFinal;
    }

    
    
    //compareTo
    @Override
    public int compareTo(Electrodomestico o) {
        
        return (int) (this.precioBase-o.precioBase);
    }
    
    @Override
    public String toString() {
        return   "codigo=" + codigo + ", descripcion=" + descripcion + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico= " + consumoEnergetico + ", peso= " + peso+" " ;
    }

    
    
    
    
    
}
