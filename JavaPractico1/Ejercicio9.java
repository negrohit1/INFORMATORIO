/*9. Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada.*/

import java.util.Scanner;

public class Ejercicio9 {
    
        public static void main(String[] args) {
            char carac, letra;  

                Scanner scan = new Scanner(System.in);
                System.out.print("Ingrese una cadena: ");
 
                String cadena = scan.nextLine();

                System.out.print("Ingrese una letra a buscar: ");
                letra = scan.next().charAt(0);

               
                int counter = 0;
 
                for (int i = 0; i < cadena.length(); i++) {
                        // check if the given character
                        // is a special character
                        
                        carac = cadena.charAt(i);
                
                        if (carac == letra) {
                                counter++;
                        }
                }
                System.out.println("Se encontró " + counter + " veces el caracter " + "'" + letra + "'.");
                scan.close();
        }
    }