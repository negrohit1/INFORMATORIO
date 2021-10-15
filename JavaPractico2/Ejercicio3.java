import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[]args){
       
        ArrayList barajaFran = new ArrayList();
        barajaFran.add("A");
        barajaFran.add("2");
        barajaFran.add("3");
        barajaFran.add("4");
        barajaFran.add("5");
        barajaFran.add("6");
        barajaFran.add("7");
        barajaFran.add("8");
        barajaFran.add("9");
        barajaFran.add("10");
        barajaFran.add("J");
        barajaFran.add("Q");
        barajaFran.add("K");
        

        System.out.println("Impresion en orden:");
        
        for (int i = 0; i <barajaFran.size() ; i++) {
            System.out.print(barajaFran.get(i) + " ");
        }
                
        System.out.println("\n\nImpresion en orden inverso:");
        Collections.reverse(barajaFran);
        for (int i = 0; i <barajaFran.size() ; i++) {
            System.out.print(barajaFran.get(i) + " ");
        }
        
        System.out.print("\n\nImpresion mezclada:\n");
        Collections.shuffle(barajaFran);
        for (int i = 0; i <barajaFran.size() ; i++) {
            System.out.print(barajaFran.get(i) + " ");
        }
       
    }
}