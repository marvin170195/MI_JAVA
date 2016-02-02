package pe.mdib.pedidoapp;

/**
 *
 * @author Alumno
 */
public class ClasePrincipal {

    private static double IGV = 0.18;
    public double calcularImpuesto (double importe){
        double impuesto;
        impuesto = importe*IGV;
        return impuesto;
        
    }
    
    public double calcularTotal (double importe){
        double total;
        total = importe +calcularImpuesto(importe);
        return total;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
