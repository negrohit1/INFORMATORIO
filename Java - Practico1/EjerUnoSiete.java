/*7. Realizar un programa que dado un String de entrada en minusculas lo convierta por completo a mayusculas. 
Sin uso de metodos o librerias que realicen toUppercase().*/

import java.util.Scanner;

public class EjerUnoSiete {
    public static void main(String args[]) {
            String input; 
            Scanner scan = new Scanner(System.in);

            System.out.print("Ingrese una cadena en minúscula: ");
            input = scan.nextLine();
            
            System.out.println("Su cadena en minuscula es: " + input);
            char strArr[] = input.toCharArray();
            
           
            
            for (int i = 0; i < strArr.length; i++) {
            
                    if (strArr[i] >= 'a' && strArr[i] <= 'z') {
                            strArr[i] = (char) ((int) strArr[i] - 32);
                    }
            }
            System.out.print("Su cadena en mayuscula es: ");
            
            for (int i = 0; i < strArr.length; i++) {
                    System.out.print(strArr[i]);
            scan.close();
            }
    }
}

