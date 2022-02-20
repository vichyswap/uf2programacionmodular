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
public class E009parametroArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        E009parametroArray programa = new E009parametroArray();
        programa.inicio();
        
    }
    
    public void inicio(){
        int []i = {1, 2, 3, 4, 5};
        
        System.out.println("Antes de invocar al metodo i = " + i[3]);
        modificarArray(i);
        System.out.println("Despues i = " + i[3]);
    }
    
    public void modificarArray(int a[]){
        a[3] = 0;
        System.out.println("Se ha modificado el valor a " + a[3]);
    }
    
}
