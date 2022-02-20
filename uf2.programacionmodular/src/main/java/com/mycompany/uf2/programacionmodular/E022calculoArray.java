
package com.mycompany.uf2.programacionmodular;


public class E022calculoArray {
    
    
    public double calcularMaximo(double[]array){
        double max = array[0];
        for(int i=1; i<array.length; i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        return max;
    }
    
    public double calcularMinimo(double []array){
        double min = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        
        return min;
    }
    
    public double calcularMedia(double []array){
        double suma = 0;
        for(int i=0; i<array.length; i++){
            suma += array[i];
        }
        double media = (suma/array.length);
        return media;
    }
    
}
