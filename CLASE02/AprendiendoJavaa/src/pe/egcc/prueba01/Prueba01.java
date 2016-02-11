package pe.egcc.prueba01;

import pe.egcc.service.MateService;

public class Prueba01 {
    
    public static void main(String[] args) {
        
        MateService v_m = new MateService();
        
        IDemo3 v_n = v_m;
        IDemo4 v_p = v_m;
        IDemo2 v_q = v_m;
        
       
    }
    
}
