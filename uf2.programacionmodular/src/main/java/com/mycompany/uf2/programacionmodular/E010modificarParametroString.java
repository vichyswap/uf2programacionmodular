/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uf2.programacionmodular;

/**
 *
 * @author Alumno
 */
public class E010modificarParametroString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        E010modificarParametroString programa = new E010modificarParametroString();
        programa.inicio();
        
    }
    
    public void inicio(){
        String name = "klk";
        
        System.out.println("Antes de invocar al metodo name = " + name);
        modificarparametroString(name);
        System.out.println("Despues name = " + name);
    }
    
    public void modificarparametroString(String a){
        a = "primoo";
        System.out.println("Se ha modificado el valor a " + a);
    }
    
    //String es la excepcion, a pesar de ser Compuesto(varios chars)
    // Se necesita el return para que funcione
    
}
