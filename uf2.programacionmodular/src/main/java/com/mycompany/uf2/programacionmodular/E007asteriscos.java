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
public class E007asteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        E007asteriscos programa = new E007asteriscos();
        programa.inicio();
        
    }
    
    public void inicio(){
        int tortilla = 5;
        asteriscos(tortilla);
        asteriscos(10);
        asteriscos(0);
        asteriscos(15);
    }
    
    public void asteriscos(int n){
        for(int i=0; i<n; i++){
            System.out.println("*");
        }
        System.out.println("");
    }
}
