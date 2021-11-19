package co.edu.ucundinamarca.taller4_2;

public class ListaSimple {
    private Nodo cabeza;
    private int longitud=0;
    private class Nodo{
        public NODO NODO;
        public Nodo siguiente=null;

        public Nodo(NODO NODO){
            this.NODO = NODO;


        }

    }
    public void insertarPrincipio(NODO NODO){
        Nodo nodo = new Nodo(NODO);
        nodo.siguiente=cabeza;
        cabeza=nodo;
        longitud++;
    }
    public void insertarfinal(NODO NODO){
        Nodo nodo= new Nodo(NODO);
        if(cabeza==null) {
            cabeza = nodo;

        }else {
            Nodo puntero= cabeza;
            while (puntero.siguiente!=null){
                puntero=puntero.siguiente;
            }
            puntero.siguiente=nodo;
        }
        longitud++;
    }
    public void insertardespues(int n, NODO NODO){
        Nodo nodo= new Nodo(NODO);
        if(cabeza==null) {
            cabeza = nodo;
        }else {
            Nodo puntero= cabeza;
            int contador=0;
            while(contador< n&& puntero.siguiente!=null){
                puntero=puntero.siguiente;
                contador++;
            }
            nodo.siguiente=puntero.siguiente;
            puntero.siguiente=nodo;

        }
        longitud++;
    }
    public NODO obtener (int n){
        if(cabeza==null){
            return null;
        }else {
            Nodo puntero= cabeza;
            int contador=0;
            while(contador< n&& puntero.siguiente!=null) {
                puntero = puntero.siguiente;
                contador++;
            }
            if(contador!=n){
                return null;
            }else {
                return puntero.NODO;
            }
        }
    }
    public int contar(){
        return longitud;
    }
    public boolean estaVacia(){
        return cabeza==null;
    }
    public void eliminarPrincipio(){
        Nodo primer = cabeza;
        cabeza= cabeza.siguiente;
        primer.siguiente= null;
        longitud--;
    }
    public void eliminarUltimo(){
        if(cabeza!=null){
            if(cabeza.siguiente==null){
                cabeza=null;
            }else {
                Nodo puntero = cabeza;
                while (puntero.siguiente.siguiente != null) {
                    puntero = puntero.siguiente;
                }
                puntero.siguiente = null;
            }
        }
    }
    public void eliminarLibro(int n) {
        if (cabeza != null) {
            if (n==0) {
                Nodo primer = cabeza;
                cabeza= cabeza.siguiente;
                primer.siguiente= null;
                longitud--;
            }else if (n< longitud){
                Nodo puntero = cabeza;
                int contador = 0;
                while (contador < (n - 1)) {
                    puntero = puntero.siguiente;
                    contador++;
                }
                Nodo temp = puntero.siguiente;
                puntero.siguiente = temp.siguiente;
                temp.siguiente = null;
                longitud--;
            }

        }
    }
}
