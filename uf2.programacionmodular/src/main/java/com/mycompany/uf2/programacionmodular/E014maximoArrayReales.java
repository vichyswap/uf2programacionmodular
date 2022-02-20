
package com.mycompany.uf2.programacionmodular;


public class E014maximoArrayReales {

    
    public static void main(String[] args) {
        
        E014maximoArrayReales programa = new E014maximoArrayReales();
        programa.inicio();
    }
    
    public void inicio(){
        double[]valores = {4.5, 7.8, 9.5,-1.1, 2.1, 1.4, 0};
        double resultado = maximo(valores);
        System.out.println("El maximo es " + resultado + ". ");
    }
    
    //entrada -> array
    //salida -> double maximo
    
    public double maximo(double[]x){
        
        //a contiene el valor a tratar
        double max = x[0];
        for (int i=1; i<x.length; i++){
            if(x[i] > max){
                max = x[i];
            }
        }
        return max; //contiene el resultado
    }
    
}

