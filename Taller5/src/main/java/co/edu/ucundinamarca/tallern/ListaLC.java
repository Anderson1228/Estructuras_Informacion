package co.edu.ucundinamarca.tallern;

import javax.swing.*;

public class ListaLC {
    NodoLC ultimo;
    public ListaLC(){
        ultimo=null;
    }
    public boolean estaVacia(){
        return ultimo==null;
    }
    public ListaLC insertar(int elemento){
        NodoLC nuevo= new NodoLC(elemento);
        if(ultimo!=null){
            nuevo.siguiente=ultimo.siguiente;
            ultimo.siguiente=nuevo;

        }
        ultimo=nuevo;
        return this;
    }
    public void mostrarLista(){
        NodoLC auxiliar = ultimo.siguiente;
        String Cadena="";
        do{
            Cadena=Cadena +"["+auxiliar.dato+"]->";
            auxiliar=auxiliar.siguiente;
        }while (auxiliar!=ultimo.siguiente);
        JOptionPane.showMessageDialog(null,Cadena,"Mostrando " +
                "la lista circular",JOptionPane.INFORMATION_MESSAGE);
    }
}
