/*4. Realizar un programa que calcule el factorial de un numero sin hacer uso de librerias*/

import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num, x, fact;
        fact = 1;
                
        System.out.print("Digite un numero: ");
        num = scan.nextLong();
        scan.close();

        for (x=1; x <= num; x++) {
            fact = fact*x;
        }    
            System.out.println("El factorial de " + num + " es " + fact);           
           
        }    
    }
    
