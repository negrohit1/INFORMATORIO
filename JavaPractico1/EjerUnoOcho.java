/*8. Crear un aplicacion que solicite de entrada los datos de una persona en este orden: 
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Direccion} - {Edad}- {Nombre y Apellido}
*/

import java.util.Scanner;

public class EjerUnoOcho {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nomApell, direc, ciudad, edad;
        

        System.out.print("Ingrese Nombre y Apellido: ");
        nomApell = scan.nextLine();

        System.out.print("Ingrese Edad: ");
        edad = scan.nextLine();
        
        System.out.print("Ingrese Direccion: ");
        direc = scan.nextLine();

        System.out.print("Ingrese Ciudad: ");
        ciudad = scan.nextLine();
        

        System.out.print(ciudad + " - " + direc + " - " + edad + " - " + nomApell);
        scan.close(); 
    }

}