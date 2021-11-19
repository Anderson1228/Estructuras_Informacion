package co.edu.ucundinamarca.taller4_2;

public class NODO {
    private String inicial,fin;

    public NODO(String inicial, String fin) {
        this.inicial = inicial;
        this.fin = fin;
    }

    public String getInicial() {
        return inicial;
    }

    public void setInicial(String inicial) {
        this.inicial = inicial;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }
}
