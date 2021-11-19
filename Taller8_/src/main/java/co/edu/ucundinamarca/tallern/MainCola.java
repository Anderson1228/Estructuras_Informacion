
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

import java.util.Scanner;

/**
 * Clase Principal
 * @author handresortiz
 */
public class MainCola {
    public static void main(String[] args) {
    ColaLista listita =new ColaLista();
    Scanner teclado= new Scanner(System.in);
    int opcion=0;
       do{
        System.out.println( "\n Elija una opcion");
        System.out.println( "\n 1. Registrar servicio");
        System.out.println( "\n 2. atender servicio");
        System.out.println( "\n 3. Mostrar cola de servicios");
        System.out.println( "\n 4. Informacion Usuario");
        System.out.println( "\n 5. Usuarios Atendidos y no atendidos");
        System.out.println( "\n 6. Salir");
        opcion=teclado.nextInt();

        switch (opcion){
            case 1:
                System.out.println( "\n Ingrese numero de documento");
                int dato=teclado.nextInt();
                System.out.println( "\n Ingrese Nombre");
                String dato2=teclado.next();
                System.out.println( "\n Ingrese nombre del libro");
                String dato3=teclado.next();
                listita.insertar(dato,dato2,dato3);
                break;
            case 2:
                System.out.println( "\n Servicio atendido");
                listita.quitar();
                break;
            case 3:
               listita.mostrar();
                break;
            case 4:
                listita.mostrar2();
                break;
            case 5:
                listita.mostrar3();

        }

    }while(opcion!=6);
}
}





