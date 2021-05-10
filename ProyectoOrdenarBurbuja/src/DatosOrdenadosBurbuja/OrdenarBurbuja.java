package DatosOrdenadosBurbuja;

import baseDeDatos.BaseDatos;

import java.util.ArrayList;

public class OrdenarBurbuja {
    private BaseDatos bd = new BaseDatos();
    private ArrayList<Float> miLista = null;
    private Float[] datosOrdenados = null;
   
    public OrdenarBurbuja() {
        super();
    }
    
    public Float[] ordenar() {
        miLista = bd.leerMapaDesdeBaseDeDatos();
        datosOrdenados = new  Float[miLista.size()];
        //datosOrdenados = (Float[]) miLista.toArray();
        datosOrdenados = miLista.toArray(datosOrdenados);
        burbuja(datosOrdenados);
        return datosOrdenados;
    }
    
    private void burbuja(Float[] A) {         //INICIO burbuja (A: lista de elementos)
      boolean intercambiado;
      Float aux = 0.0f;
      int n = A.length;                       //  n = longitud(A)
      int i = 0;
      do {                                    //  HACER: intercambiado
          intercambiado = false;              //    intercambiado = falso
          for(i = 1; i < n; i++) {            //    PARA (ENTERO i = 1; i < n; i++)
              // si este par no está ordenado
              if(A[i-1] > A[i]) {             //      SI (A[i-1] > A[i]) ENTONCES:
                  // los intercambiamos y recordamos que algo ha cambiado 
                  aux = A[i-1];               //        ENTERO aux = A[i-1]
                  A[i-1] = A[i];              //        A[i-1] = A[i]
                  A[i] = aux;                 //        A[i] = aux
                  intercambiado = true;       //        intercambiado = verdadero
              }                               //      FIN_SI
          }                                   //    FIN_PARA
      }while(intercambiado == true);          //  MIENTRAS (intercambiado == verdadero)
    }                                         //FIN

    public ArrayList<Float> getMiLista() {
        return miLista;
    }
}
