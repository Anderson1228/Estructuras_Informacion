package co.edu.ucundinamarca.tallern;

import java.util.ArrayList;

public class DequeLista {
    protected NodoDeque primero;
    protected NodoDeque fin;

    int tamaño = 0;


    public DequeLista() {
        primero = fin = null;
        tamaño=0;

    }


    public void insertarfirst(int elemento) {
        NodoDeque a;
        a = new NodoDeque(elemento);
        if (colaVacia()) {
            primero = a;
        }if (primero != null) {
            primero.anterior = a;
        }
        else if (fin != null) {
                primero = a;
            }
        tamaño++;
        }




    public void insertarfin(int x) {
        NodoDeque a;
        a = new NodoDeque(x);
        if (colaVacia()) {
            fin = a;
        }if (fin != null){
            fin.siguiente = a;
        }
        else if (primero != null) {
            fin = a;
        }
        tamaño++;
    }

    public int quitarfirst() {
        int aux;

        if (!colaVacia()) {
            aux = primero.elemento;
            primero.anterior = null;


        } else {
            return -1;
        }
        tamaño--;
        return aux;
    }

    public int quitarfin() {
        int aux;

        if (!colaVacia()) {
            aux = fin.elemento;
            fin.siguiente = null;


        } else {
            return -1;
        }
        tamaño--;
        return aux;
    }


    public boolean colaVacia() {
        if (tamaño == 0) {
            return true;
        } else {
            return false;
        }
    }


    public void mostrar3() {
        System.out.println(  tamaño);

    }

    public void mostrar() {
        int x=0;
        NodoDeque actual = new NodoDeque(x);
        actual = primero.anterior;
        do {
            if (actual != null) {
                System.out.println(actual.elemento);
                actual = actual.siguiente;
            } else {
                actual = primero;
                System.out.println(actual.elemento);
                actual=fin;
                do{
                if(actual!=null){
                    System.out.println(actual.elemento);
                    actual=actual.siguiente;
                }else{
                    actual=fin;


                }

                }while (actual!=fin);

            }
        } while (actual != fin);


    }
}

