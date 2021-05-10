package app;

import DatosOrdenadosBurbuja.OrdenarBurbuja;

import java.util.ArrayList;

public class Sistema {
    private OrdenarBurbuja ob = null;
    private Float[] datos = null;

    public Sistema() {
        super();
    }
    public void miMain() {
        
        ob = new OrdenarBurbuja();
        datos = ob.ordenar();
        

        for(int i = 0; i < ob.getMiLista().size(); i++) {
            System.out.println("=>" + ob.getMiLista().get(i));
        }

        
        for(int i = 0; i < datos.length; i++) {
            System.out.println("*" + datos[i]);
        }
    }
}
