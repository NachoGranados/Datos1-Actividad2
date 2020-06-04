package BubbleSort;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrdenardorBubbleSortTest {
    
    public OrdenardorBubbleSortTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testOrdenar() {
        
        System.out.println("ordenar");
        
        int[] arreglo = {5,9,7,6,2,1,4,3,8,10};
        
        int[] resultado = {1,2,3,4,5,6,7,8,9,10};
        
        OrdenardorBubbleSort instance = new OrdenardorBubbleSort();
        
        instance.ordenar(arreglo);
        
        assertEquals(resultado, arreglo);
        
        fail("The test case is a prototype.");
        
    }
    
}
