
package co.edu.ucundinamarca.tallern;

import org.apache.log4j.Logger;

import java.util.ArrayList;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {


    public static void main(String[] args) {
        Main objhanoi= new Main();
        objhanoi.Hanoi(3,"A","B","C");


    }
    public  void Hanoi(int n, String origen,  String auxiliar, String destino){
        if(n==1)
            System.out.println("mover disco de " +n+" " + origen + " a " + destino);
        else{
            Hanoi(n-1, origen, destino, auxiliar);
            System.out.println("mover disco de "+n+" "+ origen + " a " + destino);
            Hanoi(n-1, auxiliar, origen, destino);
        }
    }
}
