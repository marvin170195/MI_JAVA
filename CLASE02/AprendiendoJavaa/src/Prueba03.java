
import java.util.Arrays;
import java.util.stream.IntStream;


public class Prueba03 {
    
    
    public static void main(String[] args) {
        int [] notas = {18,15,6,7,12,14,16};
        
        
        
        System.out.println("CANTIDAD: " + Arrays.stream(notas).count());
        System.out.println("MAYOR: " +Arrays.stream(notas).max());
        System.out.println("MENOR: " + Arrays.stream(notas).min());
        System.out.println("PROMEDIO: " +Arrays.stream(notas).average());
        
        
    }
    
}
