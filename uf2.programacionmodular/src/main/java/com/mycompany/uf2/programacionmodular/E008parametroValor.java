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
public class E008parametroValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        E008parametroValor programa = new E008parametroValor();
        programa.inicio();
        
    }
    
    public void inicio(){
        int i = 10;
        System.out.println("Antes de invocar al metodo i = " + i);
        modificar(i);
        System.out.println("Despues i = " + i);
    }
    
    public void modificar(int x){
        x = 0;
        System.out.println("Se ha modificado el valor a " + x);
    }
    
    //No se modifica porq no tiene return !!!!!!
}
