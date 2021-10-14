/*5. Se desea una aplicacion que solicite 2 numeros enteros y realice la operacion 
de multiplicacion por sumas sucesivas (sin uso de librerias).*/

import java.util.Scanner;

public class EjerUnoCinco {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, multip, x;

        System.out.print("Digite 2 numeros: ");
        num1 =  scan.nextInt();
        num2 =  scan.nextInt();
        x=1;
        multip=0;

        while (x<=num2){
            multip = (multip+num1);
            ++x;
        }
        
        System.out.println(num1 + " x " + num2 + " = " + multip);

        scan.close();
    }




}

