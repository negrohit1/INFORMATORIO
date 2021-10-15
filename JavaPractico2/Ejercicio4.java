import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[]args){
    
        ArrayList estudiantes = new ArrayList();
                
                estudiantes.add("Lucas");
                estudiantes.add("Maria");
                estudiantes.add("Pedro");
                estudiantes.add("Laura");
                estudiantes.add("Juan");
                estudiantes.add("Dario");
                estudiantes.add("Alejandra");
                estudiantes.add("Ana");
                estudiantes.add("Francisco");
                estudiantes.add("Fernando");
                estudiantes.add("Monica");
                estudiantes.add("Eric");
        
               
                System.out.println("Curso 1: ");
                ArrayList curso1 = new ArrayList();
                
                for (int i = 0; i < 4; i++) {
                    curso1.add(i);
                    System.out.println(estudiantes.get(i)+ " ");
                }
               
                System.out.println("\n\nCurso 2: ");
                ArrayList curso2 = new ArrayList();
                for (int i = 4; i < 8; i++) {
                    curso2.add(i);
                    System.out.println(estudiantes.get(i)+ " ");
                }
                
                System.out.println("\n\nCurso 3: ");
                ArrayList curso3 = new ArrayList();
                for (int i = 8; i < 12; i++) {
                    curso3.add(i);
                    System.out.println(estudiantes.get(i)+ " ");
                }
                
           }
     }
        
        
        