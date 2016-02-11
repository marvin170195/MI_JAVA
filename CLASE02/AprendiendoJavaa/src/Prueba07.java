
import java.util.ArrayList;
import java.util.List;


public class Prueba07 {
    
    
    //LISTA TIPIFICADA  
    
    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>();
        
        lista.add("Marvin Iberico");
        lista.add("Mathi");
        lista.add("Teddy");
        lista.add("");
        
        for (String nombre : lista){
            System.out.println(nombre);
        }
        
    }
    

}
