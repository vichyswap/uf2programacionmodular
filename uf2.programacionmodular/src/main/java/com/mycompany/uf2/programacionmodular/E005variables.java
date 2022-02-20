
package com.mycompany.uf2.programacionmodular;

public class E005variables {

    public static void main(String[] args) {
       int contador = 1;
       //reasignar el valor de la variable contador:
       //contador = duplicar_valor(contador);
       //asi se modifica el valor de la variable principal
        System.out.println(duplicar_valor(contador));
    }

    //si hay parametros de salida, cambiaremos void por int
    public static int duplicar_valor(int valor){
        valor = valor * 2;
        //devolver la vaiable con un parametro de salida
        return valor;
    }
}