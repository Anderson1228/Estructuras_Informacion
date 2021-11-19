package co.edu.ucundinamarca.tallern;

public class NodoDeque {
    int elemento;
    NodoDeque siguiente;
    NodoDeque anterior;

    public NodoDeque(int x)
    {
        elemento=x;
        siguiente = null;
        anterior=null;
    }
}
