/*Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!”
Input (Entrada):
Obi Wan Kenobi

Output (Salida):
HOLA Obi Wan Kenobi*/

import java.util.*;

public class EjercUnoUno {
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String nombre;

        System.out.print("Digite su nombre: ");
        String nombre = scan.nextLine();

        System.out.println("HOLA " + nombre + " !!!");
        scan.close();

    }    

}




