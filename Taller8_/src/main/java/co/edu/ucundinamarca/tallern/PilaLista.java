package co.edu.ucundinamarca.tallern;

import javax.swing.*;

public class PilaLista {
    private NodoPila cima;
    int tamaño=0;

    public PilaLista()
    {
        cima = null;
    }

    // operaciones

    public boolean pilaVacia() {

        if(cima==null)
        {
            return true;
        }else
        {
            return false;
        }

    }



    public void insertar(String  elemento)
    {
        NodoPila nuevo;
        nuevo = new NodoPila(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamaño++;
    }


    public String  quitar()
    {
        if (pilaVacia())
        {
            return "-1";
        }

        String  aux = cima.elemento;
        cima = cima.siguiente;
        tamaño--;
        return aux;

    }



    public void limpiarPila() {
        NodoPila t;
        while (!pilaVacia()) {
            t = cima;
            cima = cima.siguiente;
            t.siguiente = null;
        }
    }
    public void imcima(){
        System.out.println(cima);
    }
    public void imtamaño(){
        System.out.println(tamaño);
    }
    public void probar(){
        if(cima!=null){
            System.out.println("Si hay elementos en la pila");

        }else{
            System.out.println("No hay elementos en la pila");
        }
    }
    public void elementosLista(){
        String x="";
        NodoPila actual = new NodoPila(x);
        actual = cima;
        do {
            if (actual != null) {
                System.out.println(actual.elemento);
                actual = actual.siguiente;
            } else {
                actual = cima;
            }
        } while (actual != cima);
    }
}
