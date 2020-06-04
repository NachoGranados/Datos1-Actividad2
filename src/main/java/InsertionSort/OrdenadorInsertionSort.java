package InsertionSort;

public class OrdenadorInsertionSort {
    
    public void ordenar(int []arreglo) {
        
        int aux;
        
        for (int i = 1; i < arreglo.length; i++) {
            
            aux = arreglo[i];
            
            for (int j = i - 1; j >= 0 && arreglo[j] > aux; j--) {
                
                arreglo[j + 1] = arreglo[j];
                arreglo[j] = aux;
                
            }
            
        }
                
    }
    
}
