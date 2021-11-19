
package co.edu.ucundinamarca.tallern;
import java.util.Scanner;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    private static Object NodoLC;

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int elemento ; int elemento2 = 0;
        ListaLC Lista1 = new ListaLC();int opc=0;
        lista Lista2= new lista();
        do {
            System.out.println("\n 1) Ingresar documento Estudiante ");
            System.out.println("\n 2) Eliminar Estudiante");
            System.out.println("\n 3) Mostrar número de fallos del estudiante");
            System.out.println("\n 4) Mostrar fecha de fallos del estudiante ");
            System.out.println("\n 5) Salir");
            opc=teclado.nextInt();
            if (opc == 1) {
                System.out.println("\n Ingresar número de documento ");
                elemento=teclado.nextInt();
                Lista1.insertar(elemento);
                int dato;
                do {
                    System.out.println("\n Ingresar dia de fallo, ingrese 0 si no desea poner más ");
                    dato = teclado.nextInt();
                    if(dato!=0){
                    Lista2.ingresar(dato);
                    }
                }while(dato!=0);
            }
            if (opc == 2) {
                System.out.println("Porque va a eliminar el elemento, acaso le hizo algo? creo que no, relfexiona " +
                        "y sigue con este programa");
            }
            if (opc == 3) {
                if (!Lista1.estaVacia()) {
                    System.out.println("el estudiante ");
                    Lista1.mostrarLista();
                    System.out.println("tiene ");
                    Lista2.tamaño();
                    System.out.println(" fallos ");
                } else {
                    System.out.println("Lista Vacia");
                }


            }
            if (opc == 4) {
                System.out.println("las dias son ");
                Lista2.mostrar();

            }
            if (opc == 5) {
                System.out.println("Hasta  luego");
                break;
            }
        }while(opc!=5);
    }
}