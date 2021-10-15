import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[]args){
        ArrayList listaEnteros = new ArrayList();
        
        listaEnteros.add(1);
        listaEnteros.add(2);
        listaEnteros.add(3);
        listaEnteros.add(4);
        listaEnteros.add(5);


        System.out.print("Lista de 5 numeros: ");
        for (int i = 0; i < listaEnteros.size(); i++) {
            System.out.print(listaEnteros.get(i)+ " ");
        }

        listaEnteros.add(0, 0);
        listaEnteros.add(6, 6);
        
        System.out.print("\nLista de numeros luego de agregar los 2 numeros: ");

        for (int i = 0; i < listaEnteros.size(); i++) {
            System.out.print(listaEnteros.get(i) + " ");
        }
       
    }
}
