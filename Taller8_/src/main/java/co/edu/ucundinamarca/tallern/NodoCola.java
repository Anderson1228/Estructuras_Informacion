package co.edu.ucundinamarca.tallern;

public class NodoCola {
    int documento;
    String Nombre;
    String Libro;
    NodoCola siguiente;

    public NodoCola(int d, String n, String l)
    {
        documento = d;
        Nombre=n;
        Libro=l;
        siguiente = null;
    }
}
