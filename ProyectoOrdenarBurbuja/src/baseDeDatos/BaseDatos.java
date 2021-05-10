package baseDeDatos;

import java.util.ArrayList;

public class BaseDatos {
    private ArrayList<Float> listaNumeros =  new ArrayList<Float>();
   // private ArrayList<Float> listaNumeros =  null;
    public BaseDatos() {
        super();
    }                
    public ArrayList<Float> leerMapaDesdeBaseDeDatos() {
        //leer desde una base de datos: Oracle, MySql, SQL. otras ...
        //listaNumeros = new ArrayList<Float>();
        listaNumeros.add(2.0f);
        listaNumeros.add(3.0f);
        listaNumeros.add(4.0f);
        listaNumeros.add(5.0f);
        listaNumeros.add(1.0f);
        return listaNumeros;
    }
}
