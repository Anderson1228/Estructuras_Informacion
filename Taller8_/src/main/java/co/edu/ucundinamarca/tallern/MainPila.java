
package co.edu.ucundinamarca.tallern;

import java.util.Scanner;

/**
 * Clase Principal
 * @author handresortiz
 */
public class MainPila {
    public static void main(String[] args) {
    PilaLista listita =new PilaLista();
    Scanner teclado= new Scanner(System.in);
    int opcion=0;
       do{
        System.out.println( "\n Elija una opcion");
        System.out.println( "\n 1. Insertar un objeto en la pila");
        System.out.println( "\n 2. Recuperar objeto de la pila");
        System.out.println( "\n 3. Obtener el objeto de la cima");
        System.out.println( "\n 4. ¿Hay objetos en la pila?");
        System.out.println( "\n 5. tamaño pila");
        System.out.println( "\n 6. Elementos de la pila");
        System.out.println( "\n 7. Salir");
        opcion=teclado.nextInt();

        switch (opcion){
            case 1:
                System.out.println( "\n Ingrese dato");
                String dato=teclado.next();
                listita.insertar(dato);

                break;
            case 2:
                System.out.println(listita.quitar());
                break;
            case 3:
                listita.imcima();
                break;
            case 4:
                listita.probar();
                break;
            case 5:
                listita.imtamaño();
                break;
            case 6:
                listita.elementosLista();
                break;


        }

    }while(opcion!=7);
}
}





