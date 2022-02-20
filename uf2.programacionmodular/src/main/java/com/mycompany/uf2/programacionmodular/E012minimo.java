
package com.mycompany.uf2.programacionmodular;


public class E012minimo {

    
    public static void main(String[] args) {
        
        E012minimo programa = new E012minimo();
        programa.inicio();
    }
    
    public void inicio(){
        int resultado = minimo(20, 20);
        System.out.println(resultado);
    }
    
    //entrada -> los dos int
    //salida -> el int menor
    
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
