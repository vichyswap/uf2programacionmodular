
package com.mycompany.uf2.programacionmodular;


public class E023registrarNotas {

    
    public static void main(String[] args) {
        // TODO code application logic here
        E023registrarNotas programa = new E023registrarNotas();
        programa.inicio();
        
    }
    
    public void inicio(){
        double[] notas = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
        
        E022calculoArray calculador = new E022calculoArray(); //Llama al E022, pilla sus funciones
        
        System.out.println("Maximo: ");
        double maximo = calculador.calcularMaximo(notas);
        System.out.println(maximo);
        
        System.out.println("Minimo: ");
        System.out.println(calculador.calcularMinimo(notas));
        
        System.out.println("Media: ");
        System.out.println(calculador.calcularMedia(notas));
    }
    
}
