/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.mdib.edutec.lib;

/**
 *
 * @author Alumno
 */
public class Promedio {
  
    public int promediar (int n1, int n2){
        int pr;
        pr = (n1+n2)/2;
        return pr;
    }
    
     public int promediar (int n1, int n2, int n3){
        int pr;
        pr = (n1+n2+n3)/3;
        return pr;
    }
     
      public int promediar (int n1, int n2, int n3, int n4){
        int pr;
        pr = (n1+n2+n3+n4)/4;
        return pr;
    }
}
