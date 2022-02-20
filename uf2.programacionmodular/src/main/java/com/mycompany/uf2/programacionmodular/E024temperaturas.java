
package com.mycompany.uf2.programacionmodular;


public class E024temperaturas {

    
    public static void main(String[] args) {
        // TODO code application logic here
        E024temperaturas programa = new E024temperaturas();
        programa.inicio();
        
    }
    
    public void inicio(){
        double[]temp = {20.0, 21.5, 19.0, 18.5, 17.5, 19.0, 22.25, 21.75};
        //identificador para invocar a los metodos de otra clase
        E022calculoArray calculador = new E022calculoArray();
        double max = calculador.calcularMaximo(temp);
        double min = calculador.calcularMinimo(temp);
        double diferencia = max-min;
        System.out.println(max);
        System.out.println(min);
        System.out.println("La diferencia maxima de temperaturas es " + diferencia );
    }
    
    
}
