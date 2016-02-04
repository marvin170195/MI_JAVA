/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagoapp.pagoapp.prueba;

import pagoapp.pagoapp.service.PagoService;
import pe.egcc.pagoapp.dto.PagoDto;

/**
 *
 * @author Alumno
 */
public class Prueba01 {
    public static void main(String[] args) {
        //dato
        PagoDto dto = new PagoDto();
        dto.setHorasDia(6);
        dto.setDias(20);
        dto.setPagoHora(140.0);
        //proceso
        PagoService service = new PagoService();
        service.procesar(dto);
        
        //reporte
        System.out.println("Ingresos: " + dto.getIngresos());
        System.out.println("Renta: " + dto.getRenta());
        System.out.println("Neto: " + dto.getNeto());
        
    }
}
