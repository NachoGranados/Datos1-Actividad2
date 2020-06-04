package BubbleSort;

public class MainBubbleSort {

    public static void main(String[] args) {
        
        int []arreglo = {5,9,7,6,2,1,4,3,8,10};
        
        OrdenardorBubbleSort o = new OrdenardorBubbleSort();
        
        o.ordenar(arreglo);
        
        for (int i = 0; i < arreglo.length; i++) {
            
            System.out.println(arreglo[i]);
            
        }
        
    }
    
}
