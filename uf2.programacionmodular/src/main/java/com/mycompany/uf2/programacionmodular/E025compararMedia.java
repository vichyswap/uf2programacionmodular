
package com.mycompany.uf2.programacionmodular;


public class E025compararMedia {

    
    public static void main(String[] args) {
        // TODO code application logic here
        E025compararMedia programa = new E025compararMedia();
        programa.inicio();
        
    }
    
    public void inicio(){
        E022calculoArray calculador = new E022calculoArray();
        double[]temp = {20.0, 21.5, 19.0, 18.5, 17.5, 19.0, 22.25, 21.75};
        double[] notas = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
        
        double media1 = calculador.calcularMedia(temp);
        double media2 = calculador.calcularMedia(notas);
        
        if(media1 > media2){
            System.out.println("El array con media mas alta es temp y tiene un valor de: " + media1);
        }else{
            System.out.println("El array con media mas alta es notas y tiene un valor de: " + media2); 
                   
        }
    }
    
}
