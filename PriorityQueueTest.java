import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;    
    
public class PriorityQueueTest {        
    @Test
    public void testAdd() {
        String name = "Prueba";
        String sickness = "Gripe";
        String c = "A";


        VectorHeap<Caso> pacientesHeap = new VectorHeap<Caso>();

        // Instanciar el caso de cada paciente y meterlo al Vector
        Caso caso = new Caso(name, sickness, c);

        pacientesHeap.add(caso);

        // Resultado actual
        String actual = pacientesHeap.getFirst().getNombre();

        // Resultado esperado
        String esperado = "Prueba";

        assertEquals(esperado, actual);
    }

    @Test
    public void testRemove() {
        String name = "Prueba";
        String sickness = "Gripe";
        String c = "A";


        VectorHeap<Caso> pacientesHeap = new VectorHeap<Caso>();

        // Instanciar el caso de cada paciente y meterlo al Vector
        Caso caso = new Caso(name, sickness, c);

        pacientesHeap.add(caso);

        // Resultado actual
        String actual = pacientesHeap.remove().getNombre();

        // Resultado esperado
        String esperado = "Prueba";

        assertEquals(esperado, actual);
    }
}
