
package com.mycompany.uf2.programacionmodular;

import java.util.Scanner;


public class E011salida {

    
    public static void main(String[] args) {
        
        E011salida programa = new E011salida();
        programa.inicio();
        
    }
    
    public void inicio(){
        System.out.println("Escribe un numero entero: ");
        int a = leerNum();
        System.out.println("Has introducido " + a + ". (Correcto)");
        System.out.println("Introduce otro numero: ");
        a = leerNum();
        System.out.println("El nuevo numero es " + a + ". (Correcto)");
    }
    
    // metodo que lee un entero desde el teclado
    // param entrada -> nope
    //param salida -> int 
    public int leerNum(){
        Scanner read = new Scanner(System.in);
        int numLeido = 0;
        boolean leido = false;
        
        while(!leido){
            leido = read.hasNextInt();
            if(leido){
                numLeido = read.nextInt();
            } else {
                System.out.println("Este no es un num entero. Prueba otro num.");
                read.next();
            }
        }
        read.nextLine();
        //¿Que variable tiene el resultado?
        return numLeido;
    } 
}
