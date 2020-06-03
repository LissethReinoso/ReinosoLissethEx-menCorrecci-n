/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.*;
import java.util.List;

/**
 *
 * @author Lisseth Reinoso
 */
public interface IElectrodomesticoDAO{
    
    public void crearTelevision (Television television);
    public void crearLavadora (Lavadora lavadora);
    
    public List<Television> listarTelevision();
    public List<Lavadora> listarLavadora();
}
