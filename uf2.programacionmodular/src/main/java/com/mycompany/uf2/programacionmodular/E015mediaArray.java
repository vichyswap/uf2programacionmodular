
package com.mycompany.uf2.programacionmodular;


public class E015mediaArray {

    
    public static void main(String[] args) {
        E015mediaArray programa = new E015mediaArray();
        programa.inicio();
      
    }
    
    public void inicio(){
        double[]valores = {4.5, 7.8, 9.5,-1.1, 2.1, 1.4, 0};
        double resultado = mediaArray(valores);
        System.out.println("La media es " + resultado + ". ");
    }
    
    public double mediaArray(double []x){
        double media = x[0];
        double acum = 0;
        for(int i = 0; i<x.length; i++){
            acum = acum + x[i];
        }
        media = (acum/x.length);
        return media;
    }
}
