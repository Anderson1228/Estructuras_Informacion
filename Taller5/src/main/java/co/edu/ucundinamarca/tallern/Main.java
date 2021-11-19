
package co.edu.ucundinamarca.tallern;
import co.edu.ucundinamarca.tallern.ListaLC;
import co.edu.ucundinamarca.tallern.NodoLC;
import java.util.Scanner;

import javax.swing.*;
import java.util.Scanner;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    private static Object NodoLC;

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int elemento = 0;
        ListaLC Lista = new ListaLC();int opc=0;
        do {
            System.out.println("\n 1) Insertar elemento en la lista circular");
            System.out.println("\n 2) Eliminar elemento en la lista circular");
            System.out.println("\n 3) Mostrar elemento en la lista circular");
            System.out.println("\n 4) Salir ");
            opc=teclado.nextInt();
            if (opc == 1) {
                Lista.insertar(elemento);
            }
            if (opc == 2) {
                System.out.println("Porque va a eliminar el elemento, acaso le hizo algo? creo que no, relfexiona " +
                        "y sigue con este programa");
            }
            if (opc == 3) {
                if (!Lista.estaVacia()) {
                    Lista.mostrarLista();
                } else {
                    System.out.println("Lista Vacia");
                }


            }
            if (opc == 4) {
                System.out.println("Aplicacion Finalizada");

            }
        }while(opc!=4);
    }
}