import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) throws IOException {

        // Crear el heap de los casos
        VectorHeap<Caso> pacientesHeap = new VectorHeap<Caso>();


        Scanner scan = new Scanner(System.in);
        // Este iterador asignara el valor de key a cada nodo del arbol

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

                Caso caso = new Caso(name, sickness, c);

                pacientesHeap.add(caso);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha podido abrir el archivo de texto");
        }

        System.out.println("PACIENTES");
        System.out.println(pacientesHeap);

        try{
            int opcion = 0;
            while (opcion != 2){
                System.out.println("Menu");
                System.out.println("1. Avanzar en la lista de pacientes");
                System.out.println("2. salir");

                opcion = scan.nextInt();

                if(opcion == 1){
                    System.out.println(pacientesHeap.remove());
                } else{
                    continue;
                }
            }
            
        } catch(Exception e){
            System.out.println("Algo ha salido mal");
        }
    }
}
