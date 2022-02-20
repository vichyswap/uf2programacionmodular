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
public class E006parametros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        E006parametros programa = new E006parametros();
        programa.inicio();
    }
    
    public void inicio(){
        
        //invocacion con literales
        mostrarMax(4, 10);
        
        //invocacion con variables
        int i=0;
        int j= -3;
        mostrarMax(i, j);
        
        
    }
    
    public void mostrarMax(int a, int b){
        System.out.println("El maximo entre " + a + " y " + b + " es: ");
        if(a<b){
            System.out.println(b);
        } else if(b<a){
            System.out.println(a);
        } else {
            System.out.println("Son iguales. ");
        }
    }
}
