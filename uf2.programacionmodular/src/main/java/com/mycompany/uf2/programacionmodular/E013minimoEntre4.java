
package com.mycompany.uf2.programacionmodular;


public class E013minimoEntre4 {

    
    public static void main(String[] args) {
        
        E013minimoEntre4 programa = new E013minimoEntre4();
        programa.inicio();
    }
    
    public void inicio(){
        int primerPar = minimo(20, 30);
        int segundoPar = minimo(4,87);
        int resultado = minimo(primerPar, segundoPar);
        System.out.println(resultado);
    }
    
    public int minimo(int a, int b){
        int min = 0;
        if(a<b){
            min = a;
        } else if (b<a) {
            min = b;
        } else {
            System.out.println("Son los dos iguales. " + a + " = " + b + ". ");
            min = a;
        }
        return min;
    }
}
