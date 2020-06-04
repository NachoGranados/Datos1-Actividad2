package BubbleSort;

public class OrdenardorBubbleSort {
          
    public void ordenar(int []arreglo) {
        
        int aux;
        boolean cambios;
        
        while (true) {
            
            cambios = false;
            
            for (int i = 1; i < arreglo.length; i++) {
                
                if (arreglo[i] < arreglo[i-1]) {
                    
                    aux = arreglo[i];
                    arreglo[i] = arreglo[i-1];
                    arreglo[i-1] = aux;
                    cambios = true;
                    
                }
                
            }
            
            if (cambios == false) {
                
                break;
                
            }
            
        }
        
    }
     
}
