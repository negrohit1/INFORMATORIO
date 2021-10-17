import java.util.ArrayList;
import java.util.List;

    
    public class Ejercicio_5 {
    
        public static void main(String[] args){
            List<Integer> array1HorasTrabaj = new ArrayList<>();
            List<Integer> array2ValorXhora = new ArrayList<>();
            List<Integer> totales = new ArrayList<>();
            

            array1HorasTrabaj.add(6);
            array1HorasTrabaj.add(7);
            array1HorasTrabaj.add(8);
            array1HorasTrabaj.add(4);
            array1HorasTrabaj.add(5);
            array2ValorXhora.add(350);
            array2ValorXhora.add(345);
            array2ValorXhora.add(550);
            array2ValorXhora.add(600);
            array2ValorXhora.add(320);
            
            int totalHs = 0;
            for (int i = 0; i < array1HorasTrabaj.size(); i++) {
                int x  = array1HorasTrabaj.get(i) * array2ValorXhora.get(i);
                totales.add(x);
                System.out.print(x + " ");
                totalHs = totalHs + x;
            }
            //int totalHs = 0;
            //for (Integer total: totales) {
                //totalHs += hs;
    
            
            //System.out.println(totales);
            System.out.println("\nTotal Final: $ " + totalHs);
        }
    }
    


