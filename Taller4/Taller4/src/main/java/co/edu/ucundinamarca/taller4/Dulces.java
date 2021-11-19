package co.edu.ucundinamarca.taller4;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Dulces {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        ArrayList<String> Lista;
        Lista = new ArrayList<String>();
        Iterator<String> iterador= Lista.iterator();
        Lista.add("Chocoramo");
        Lista.add("Chocolatina");
        Lista.add("Pirulito");
        Lista.add("Gelatina");
        Lista.add("Tumix");
        Lista.add("Xtime");
        Lista.add("Trident");
        Lista.add("Alpinito");
        Lista.add("Compota");
        Lista.add("Panelitas");
        System.out.println(Lista.size());
        Impite(Lista.iterator());
        Impisinte(Lista);

    }
    public static int Impite (Iterator<String>iterador){
        int i=0;
        for (;iterador.hasNext();i++){
            System.out.println(iterador.next());

        }
        System.out.println(i);
        return i;


    }
    public static int Impisinte (ArrayList<String> Lista){
        int opc=0;
        for(int i=0;i < Lista.size();i++){
            if(Lista.get(i)=="Chocoramo") {
                opc = 1;
            }


        }
        System.out.println(opc);
        return opc;

    }
}

