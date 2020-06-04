package SelectionSort;

public class OrdenadorSelectionSort {
    
    public void ordenar(int arreglo[]) {
        
        int indiceMenor;
        int aux;
        
        for (int i = 0; i < arreglo.length; i++) {
            
            indiceMenor = i;
            
            for (int j = i + 1; j < arreglo.length; j++) {
                
                if (arreglo[j] < arreglo[indiceMenor]) {
                    
                    indiceMenor = j;
                    
                }
                
            }
            
            aux = arreglo[indiceMenor];
            arreglo[indiceMenor] = arreglo[i];
            arreglo[i] = aux;
                        
        }
        
    }
            
}
