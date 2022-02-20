package com.mycompany.uf2.programacionmodular;

import java.util.ArrayList;
import java.util.Scanner;

public class RiveraVictor {
    long numero = 0L;

    public static void main(String[] args) {
        
        RiveraVictor programa = new RiveraVictor();
        programa.inicio(); //ejecuta funcion inicio()
        
    }

    //primer nivel
    public void inicio() {
        
        recibirNum(); //recibe input del numero y valida
        if(comprobarPrimo(numero)){ //si el numero es primos se informa
            System.out.println("El numero: " + numero + " es primo. ");
        } else { //sino, calculamos sus factores primos invocando la funcion
            System.out.println(factoresPrimos(numero)); 
        }
    }

    //Segundo nivel
    public long recibirNum() {
        boolean validnum = false;
        
        
        while (!validnum) { //ejecuta hasta que el numero sea valido, int
            System.out.println("Introduce un numero Natural: (Mayor o igual a dos)");
            Scanner read = new Scanner(System.in);
            if (read.hasNextLong()) { //comprueba que sea int
                numero = read.nextLong(); //asigna valor int a la variable
                if(numero >= 2){
                    System.out.println("Numero valido.");
                    validnum = true; //num valido 
                }
            } else {
                read.hasNextLine(); //limpia el bufer y pide otra vez el numero
                System.out.println("Numero no valido, prueba otra vez:");
            }
        }
        return numero;

    }
    
    public ArrayList<Long> factoresPrimos(long num){
        
        ArrayList<Long> factoresprimos = new ArrayList<>();
        for (long i = 1L; i <= num; i++) {
            if ((num % i) == 0L) { //comprueba el resto del modulo. En caso de ser 0, el numero es factor, no tiene porq ser factor primo
                //i es factor de num
                if(comprobarPrimo(i)){
                    factoresprimos.add(i); //ejecutamos la funcion para averiguar cuales de sus factores son primos.
                }                          //crea una lista con todos sus factores primos
            }
        }
        
        return factoresprimos;
    }
    
    //tercer nivel
    public boolean comprobarPrimo(long num) {
        boolean esprimo = true;

        for (long i = 1L; i <= num; i++) {
            if ((num % i) == 0L) {
                //i es factor de num
                if (i != 1L && i != num) { // en caso contrario sera primo
                    esprimo = false;
                }
            }
        }

        return esprimo;
    }

}
