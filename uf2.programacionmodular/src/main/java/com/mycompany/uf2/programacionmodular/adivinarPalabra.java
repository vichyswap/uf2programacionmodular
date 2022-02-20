/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uf2.programacionmodular;

import java.util.Scanner;

public class adivinarPalabra {

    //declarar constante como variable glo, por
    public final static String ABC = "abcdefghijklmnopqrstuvwxyz";
    public final static String CORRECTO = "O";
    public final static String POS_INCORRECTA = "X";
    public final static String INCORRECTA = "_";


    public static void main(String[] args) {
        // TODO code application logic here
        adivinarPalabra programa = new adivinarPalabra();
        programa.inicio();
    }

    public void inicio(){

    }

    //primer niverl des. 
    //entrada -> no
    //salida -> String palabra 5 letras
    public void generarPalabraSec(){
        String palabra = "";
        for(int i = 0; i<5; i++){
            palabra += generarLetra();
        }
    }
    
    //entrada -> no
    //salida -> String, palabra intento
    public String preguntarRespuesta(){
        Scanner read = new Scanner(System.in);
        
        boolean ok = false;
        String intento = "";
        do{
            System.out.println("Intenta adivinar la palabra secreta(5Letras): ");
            intento = read.next();
            //intento = intento.toLowerCase();
            read.nextLine();
            ok = comprobarRespuesta(intento); 
        }while(!ok);
        
        return intento;
    }
    
    public boolean comprobarRespuesta(String x){
        boolean ok = false;
        if(x.length() == 5){
            int letrasvalidas = 0;
            for(int i=0; i<x.length(); i++){
                char c = x.charAt(i);
                //buscarla en ABC
                //indexOf
                if(0 <= ABC.indexOf(c) &&  ABC.indexOf(c)<= 24){
                    //no es correcto
                    letrasvalidas += 1;
                }
            }
            if(letrasvalidas == 5){
                ok = true;
            }
        }
        return ok;
        
    }

    public void analizarRespuesta(){

    }

    //segundo nivel des.
        
    //entrada -> no
    //salida -> char

    public char generarLetra(){
        //nanoTime() devuelve un valor temporal en segundos
        long nano = System.nanoTime();
        //traducir nano a entero
        //utilizando modulo -> entre 1-26 mod26
        int index = (int)(nano % ABC.length());
        //encontrar la letra negativa
        return ABC.charAt(index);
    }

    public void montarPalabra(){

    }
    
    //entrada -> String
    //salida -> String
    public String generarPista(String respuesta, String secreto){
        String pista = "";
        //recorrer la palabra secreta y la respuesta
        for(int i = 0; i < secreto.length(); i++){
            //necesito los dos carac para comparar (secre respuesta)
            char charSecreto = secreto.charAt(i);
            char charRespuesta = respuesta.charAt(i);
            if(charSecreto == charRespuesta){
                pista += CORRECTO;
            } else if(secreto.indexOf(charRespuesta) != -1){
                pista += POS_INCORRECTA;
            } else{
                pista += INCORRECTA;
            }

        }
        return pista;

    }

    public void darRespuesta(){

    }
}
