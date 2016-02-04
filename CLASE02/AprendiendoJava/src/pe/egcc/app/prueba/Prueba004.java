/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app.prueba;

import pe.egcc.app.model.Producto;

/**
 *
 * @author Alumno
 */
public class Prueba004 {
    
    
}

private static void mostrar(Producto prod) {
    System.out.println("Nombre: " + prod.getNombre());
    System.out.println("Precio: " + prod.getPrecio());
    System.out.println("Stock: " + prod.getStock());
    System.out.println("Activo: " + prod.isActivo());
  }