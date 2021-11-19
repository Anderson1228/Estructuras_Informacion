package co.edu.ucundinamarca.tallern;

import java.util.ArrayList;

public class ColaLista {
    protected NodoCola frente;
    protected NodoCola fin;
    protected NodoCola lmayor;
    int tamaño = 0;
    ArrayList atendidos = new ArrayList();
    int contaux = 0, lm = 0;


    public ColaLista() {
        frente = fin = null;
        ArrayList atendidos = new ArrayList();
    }


    public void insertar(int documento, String nombre, String libro) {
        NodoCola a;
        a = new NodoCola(documento, nombre, libro);
        String may = "";
        if (colaVacia()) {
            frente = a;
        } else {
            fin.siguiente = a;
        }
        if (a.Libro.length() > may.length()) {
            may = a.Libro;
            lmayor = a;
        }
        fin = a;
        tamaño++;
    }

    public int quitar() {
        int aux;
        String aux2, aux3;
        String a;


        if (!colaVacia()) {
            aux = frente.documento;
            aux2 = frente.Nombre;
            aux3 = frente.Libro;
            contaux = contaux + 1;
            frente = frente.siguiente;
            a = "La persona " + aux2 + " con número de documento " + aux + " adquirio el libro " + aux3 + " Ya fue atendida";
            atendidos.add(a);
            if (frente.Libro.length() < lm) {
                lm = contaux;
            }

        } else {
            return -1;
        }
        tamaño--;
        return aux;
    }


    public void borrarCola() {
        while (frente != null) {
            frente = frente.siguiente;
        }

    }


    public boolean colaVacia() {
        if (frente == null) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrar() {
        int documento = 0, ncola = 1;
        String nombre = "";
        String libro = "";
        NodoCola actual = new NodoCola(documento, nombre, libro);
        actual = frente;
        System.out.println("Lista actual");
        do {
            if (actual != null) {
                System.out.println("Turno n°" + ncola++ + ". " + actual.Nombre + " con número de documento " +
                        actual.documento + " adquirio el libro " + actual.Libro);
                actual = actual.siguiente;
            } else {
                actual = frente;
            }
        } while (actual != frente);
        System.out.println("Lista de atendidos");
        for (int i = 0; i < atendidos.size(); i++) {
            System.out.println(atendidos.get(i));

        }

    }

    public void mostrar2() {
        int documento = 0, ncola = 1;
        String nombre = "";
        String libro = "";
        NodoCola actual = new NodoCola(documento, nombre, libro);
        actual = lmayor;
        System.out.println("Lista actual");
        System.out.println("La persona con el libro mayor es " + actual.Nombre + " cedula " + actual.documento + " libro "
                + actual.Libro);

        System.out.println("Lista de atendidos");
            System.out.println(atendidos.get(lm));

        }
    public void mostrar3() {
        System.out.println("Turnos por atender "+tamaño);
        System.out.println("Turnos atendidos "+atendidos.size());
    }


    }

