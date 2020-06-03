/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Lisseth Reinoso
 */
public class ElectrodomesticoDAO implements IElectrodomesticoDAO {

    //SortedSet
    private SortedSet<Electrodomestico> lista = new TreeSet<>();

    private List<Television> listaTele;
    private List<Lavadora> listaLava;
    
    public ElectrodomesticoDAO(){
        listaTele =new ArrayList<>();
        listaLava=new ArrayList<>();
    }
    
    @Override
    public void crearTelevision(Television television) {
        lista.add(television);

    }

    @Override
    public void crearLavadora(Lavadora lavadora) {
        lista.add(lavadora);
    }

    @Override
    public List<Television> listarTelevision() {

        Iterator<Electrodomestico> it = lista.iterator();

        while (it.hasNext()) {
            Electrodomestico tele = it.next();
            if (tele instanceof Television) {
                Television television = (Television) tele;
                listaTele.add(television);
            }
        }

        //comparator
        //  Comparator<Electrodomestico> pf2=(Comparator<Electrodomestico>) new Television();
        //  Comparator<Electrodomestico> pf3=(Comparator<Electrodomestico>) new Television();
        //    SortedSet<Electrodomestico> lor=new TreeSet<Electrodomestico>(pf1);
        return listaTele;
    }

    @Override
    public List<Lavadora> listarLavadora() {

        //comparator
        //Comparator<Electrodomestico> pf1 = (Comparator<Electrodomestico>) new Lavadora();
        //Comparator<Electrodomestico> pf2 = (Comparator<Electrodomestico>) new Lavadora();
        //Comparator<Electrodomestico> pf3 = (Comparator<Electrodomestico>) new Lavadora();
        // SortedSet<Electrodomestico> lor = new TreeSet<Electrodomestico>(pf1);
        Iterator<Electrodomestico> it = lista.iterator();

        while (it.hasNext()) {
            Electrodomestico lava = it.next();
            if (lava instanceof Lavadora) {
                Lavadora lavadora = (Lavadora) lava;
                listaLava.add(lavadora);
            }
        }
        return listaLava;
    }
}
