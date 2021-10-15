/*6. Se desea una aplicacion que solicite 2 numeros enteros y realice la operacion de 
potencia (sin uso de librerias) */ 

import java.util.Scanner;

public class EjerUnoSeis {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x, y, potencia, aux;

        System.out.print("Digite 2 numeros enteros: ");
        x = scan.nextInt();
        y = scan.nextInt();
        aux = 1;
        potencia=1;

        while (aux <= y){
            potencia = (potencia * x); 
            ++aux;
        }
        System.out.println(x + " elevado a " + y + " = " + potencia);
        scan.close();
    }

}
