import java.util.*;
import java.util.PriorityQueue;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws IOException {

        // Crear el heap de los casos
        VectorHeap<Caso> pacientesHeap = new VectorHeap<Caso>();

        PriorityQueue<Caso> pacientePQ = new PriorityQueue<Caso>();


        Scanner scan = new Scanner(System.in);
        
        // opcion para elgir cual se usara
        int option = 0;
        System.out.println("Elige la implementacion");
        System.out.println("1. VectorHeap");
        System.out.println("2. PriorityQueue");

        option = scan.nextInt();

        if(option == 1){
            System.out.println("Has elegido VectorHeap");
            // llenar el arbol con el documento de texto
            try {
                FileReader f = new FileReader(
                        "pacientes.txt");
                BufferedReader r = new BufferedReader(f);

                String cadena;

                
                while ((cadena = r.readLine()) != null) {
                    String[] info = cadena.split(", ");

                    String name = info[0];
                    String sickness = info[1];
                    String c = info[2];

                    // Instanciar el caso de cada paciente y meterlo al Vector
                    Caso caso = new Caso(name, sickness, c);

                    pacientesHeap.add(caso);
                }
            } catch (FileNotFoundException e) {
                System.out.println("No se ha podido abrir el archivo de texto");
            }

            System.out.println("PACIENTES");
            System.out.println(pacientesHeap);

            try{
                // Menu para interactuar con el vector
                int opcion = 0;
                while (opcion != 2){
                    System.out.println("Menu");
                    System.out.println("1. Avanzar en la lista de pacientes");
                    System.out.println("2. salir");

                    opcion = scan.nextInt();

                    // Si el vector esta vacio, no se removeran mas valores
                    // En caso contrario, eliminara y mostrar el eliminado
                    if(opcion == 1){
                        if(pacientesHeap.isEmpty() == true){
                            opcion = 2;
                            System.out.println("No hay mas pacientes!");
                        } else{
                            System.out.println(pacientesHeap.remove());
                        }
                    } else{
                        // Opcion de salir
                        continue;
                    }
                }
                
            } catch(Exception e){
                System.out.println("Algo ha salido mal");
            }

        } else{ //Priorityqueue
            System.out.println("Has elegido Priority Queue");
            // llenar el PQ con los datos del documento
            try {
                FileReader f = new FileReader(
                        "pacientes.txt");
                BufferedReader r = new BufferedReader(f);

                String cadena;

                
                while ((cadena = r.readLine()) != null) {
                    String[] info = cadena.split(", ");

                    String name = info[0];
                    String sickness = info[1];
                    String c = info[2];

                    Caso caso = new Caso(name, sickness, c);

                    // Instanciar y agregar caso
                    pacientePQ.add(caso);
                }
            } catch (FileNotFoundException e) {
                System.out.println("No se ha podido abrir el archivo de texto");
            }

            System.out.println("PACIENTES");
            System.out.println(pacientePQ);

            try{
                int opcion = 0;
                
                while (opcion != 2){
                    System.out.println("Menu");
                    System.out.println("1. Avanzar en la lista de pacientes");
                    System.out.println("2. salir");

                    opcion = scan.nextInt();

                    // Si el vector esta vacio, no se removeran mas valores
                    // En caso contrario, eliminara y mostrar el eliminado
                    if(opcion == 1){
                        if(pacientePQ.isEmpty() == true){
                            opcion = 2;
                            System.out.println("No hay mas pacientes!");
                        } else{
                            System.out.println(pacientePQ.remove());
                        }
                    } else{
                        // Salir
                        continue;
                    }
                }
                
            } catch(Exception e){
                System.out.println("Algo ha salido mal");
            }
        }

        scan.close();
    }
}
