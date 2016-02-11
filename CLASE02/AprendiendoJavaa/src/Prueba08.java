
import java.util.HashMap;
import java.util.Map;

//EJEMPLO DE MAP
public class Prueba08 {
    
    
    
    public static void main(String[] args) {
        Map<String,Object> datos = new HashMap<>();
        
        datos.put("001", "Marvin Iberico");
        datos.put("002", "Andrea");
        datos.put("003", "Mathi");
        datos.put("004", "Mama");
        datos.put("005", "Teddy");
        
        for (String key : datos.keySet()){
            System.out.println(key + " ----- " +datos.get(key));
            
        }
        
        System.out.println("-----------------------------");;
        datos.put("002","Karla Torres");
        
        for (String key : datos.keySet()){
            System.out.println(key + " ----- " +datos.get(key));
        }
    }
}
