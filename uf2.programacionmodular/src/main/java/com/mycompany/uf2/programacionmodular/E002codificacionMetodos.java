/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uf2.programacionmodular;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class E002codificacionMetodos {

     //declaracion de variable global
    //recomendacion declarar aqui
    private int[] listaEnteros = new int[10];

    public static void main(String[] args) {

        // nombre de la clase + identificador!!
        //Scanner entrada = new Scanner();
        E001variableGlobal programa = new E001variableGlobal ();
        programa.inicio();
    }

    public void inicio(){
        //instrucciones del metodo principal 
        //problema general 
        leerLista();
        ordenarLista();
        imprimirLista();
    }

    //METODO CON LAS INSTRUCCIONES (BLOQUE DE CODIGO) PARA LEER UNA LISTA
    public void leerLista(){
        //instrucciones + bloque de codigos 
        System.out.println("escribe 10 enteros");
        Scanner entrada = new Scanner(System.in);
        //varible local, solo se ve hasta la siguiente }
        int indice = 0;
        while (indice < listaEnteros.length){
            if(entrada.hasNextInt()){
                listaEnteros[indice] = entrada.nextByte();
                indice++;
            } else {
                entrada.next();
            }

        }
        entrada.nextLine();

    }

    //metodo para ordenar una lista 
    public void ordenarLista(){
        //instrucciones 
        for(int i = 0; i < listaEnteros.length - 1; i++){
            for(int j = 1; j < listaEnteros.length; j++){
                //si la posicion actual tiene un valor actual que ña de la busqueda, se intercambia
                if( listaEnteros[i] > listaEnteros[j]){
                    //necesitamos una variable auxiliar para hacer el intercambio
                    int cambio = listaEnteros[i];
                    listaEnteros[i] = listaEnteros[j];
                    listaEnteros[j] = cambio;
                }
            }
        }
    }

    //metodo para imprimir una lista 
    public void imprimirLista(){
        //instrucciones
         System.out.println("El array ordenado es: [");
        for (int i = 0; i < listaEnteros.length; i++){
            System.out.println(listaEnteros[i] + " ");
        }
        System.out.println("]");
    }
    
}
