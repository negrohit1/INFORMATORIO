/*2. Realizar un programa que solicite por consola 2 numeros enteros. 
Para luego imprimir el resultado de la suma, resta, multiplicacion, division 
y modulo (resto de la division) de ambos numeros.*/


import java.util.Scanner;

public class Ejercicio2 {
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, suma, resta, mult, div, modulo;
                
        System.out.print("Digite 2 numeros enteros: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        
        suma = num1+num2;
        resta = num1-num2;
        mult = num1*num2;
        div = num1/num2;
        modulo = num1%num2;

        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " * " + num2 + " = " + mult);
        System.out.println(num1 + " / " + num2 + " = " + div);
        System.out.println(num1 + " % " + num2 + " = " + modulo);
        
        scan.close();
    }    
}