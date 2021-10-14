/*3. Confeccionar un programa que dadpublic un numero entero como dato de entrada imprima 
la secuencia de numeros (incrementados de 1) de la siguiente forma:*/


import java.util.Scanner;

public class EjerUnoTres {
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, x, y;
                
        System.out.print("Digite un numero: ");
        num = scan.nextInt();
               
        for (x=1; x <= num; x++) {
            for (y=1; y<x; y++){
                System.out.print(y);
            }
            System.out.println(x);
        }    
    }    
}