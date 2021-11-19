
package co.edu.ucundinamarca.tallern;

import java.util.Scanner;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Maindeque {
    public static void main(String[] args) {
    DequeLista listita =new DequeLista();
    Scanner teclado= new Scanner(System.in);
    int opcion=0;
       do{
        System.out.println( "\n Elija una opcion");
        System.out.println( "\n 1. Insertar inicio");
        System.out.println( "\n 2. Insetar final");
        System.out.println( "\n 3. Eliminar incio");
        System.out.println( "\n 4. Eliminar final");
        System.out.println( "\n 5. tamaño lista");
        System.out.println( "\n 6. Mostral elementos de la lista");
        opcion=teclado.nextInt();

        switch (opcion){
            case 1:
                System.out.println( "\n Inserte dato");
                int dato=teclado.nextInt();
                listita.insertarfirst(dato);
                break;
            case 2:
                System.out.println( "\n Inserte dato");
                int dato1=teclado.nextInt();
                listita.insertarfin(dato1);
                break;
            case 3:
               listita.quitarfirst();
                break;
            case 4:
                listita.quitarfin();
                break;
            case 5:
                listita.mostrar3();
                break;
            case 6:
                listita.mostrar();

        }

    }while(opcion!=7);
}
}





