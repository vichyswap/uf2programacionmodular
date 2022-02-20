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
public class temperaturas {

    //declaracion de constantes
    private static final int SEMANAS = 52;

    //declaracion de variables globales
    Scanner entrada = new Scanner(System.in);
    //indice array temperaturas
    private int numTemperaturas = 0; //indice de array
    private float[] temperaturas = new float[SEMANAS * 7];
    private int dia = 1;
    private int mes = 1;
    private boolean salir = false;
    private boolean fin = false;

    public static void main(String[] args) {
        temperaturas programa = new temperaturas();
        programa.inicio();
    }

    //nuevo metodo "principal", resolucion de problemas general 
    public void inicio() {
        while(!fin){
            mostrarMenu();
            tratarOpcion();
        }
    }

    //primer nivel de descomposicion 
    public void mostrarMenu() {
        System.out.println("\nRegistro de temperaturas: ");
        System.out.println("[RT] Registro de temperaturas semanales");
        System.out.println("[MD] Consultar la media");
        System.out.println("[DF] Consultar la diferencia térmica");
        System.out.println("[FIN] Salir");
        System.out.println("Escribe una de las opciones: ");

    }

    public void tratarOpcion() {
        
        String menuexe = entrada.nextLine().toUpperCase();
        do {
            
            
            if(menuexe.equals("RT")){
                registroTemperaturaSemanal();
                entrada.nextLine();
                salir = true;
            } else if (menuexe.equals("MD")){
                mostrarMedia();
                entrada.nextLine();
                salir = true;
            } else if (menuexe.equals("DF")){
                mostrarDiferencia();
                entrada.nextLine();
                salir = true;
            } else if (menuexe.equals("FIN")){
                finalizarPrograma();
                salir = true;
            }
            
        }while(!salir);
    }

    //segundo nivel de descomposicion 
    public void registroTemperaturaSemanal() {
        
        //comprobar que en el array caben 7 registros
        if((numTemperaturas + 7) >= (temperaturas.length)){
            System.out.println("No queda espacio para otra semana de temperaturas");
        } else {
            leerTemperaturasTeclado();
            actualizarFecha();
            
        }
        inicio();
    }

    public void mostrarMedia() {
        if(numTemperaturas > 0){
            System.out.println("\nHasta hoy ");
            mostrarFecha();
            System.out.println(" la media ha sido de ");
            calcularMedia();
            System.out.println(" grados.");
        } else {
            System.out.println("No hay temperaturas registradas.");
        }
        inicio();
    }

    public void mostrarDiferencia() {
        
        if(numTemperaturas > 0){
            System.out.println("\nHasta hoy ");
            mostrarFecha();
            System.out.println(" la diferencia termica ha sido ");
            calcularDiferencia();
            System.out.println(" grados.");
        } else {
            System.out.println("No hay temperaturas registradas.");
        }
        inicio();
    }

    public void finalizarPrograma() {
        fin = true;
        
    }

    //tercer nivel de descomposicion 
    public void leerTemperaturasTeclado() {
        System.out.println("Escribe las temperaturas de esta semana");
        //contador de temperaturas leidas > 7
        int numLeidas = 0;
        while (numLeidas < 7) {
            if (entrada.hasNextFloat()) {
                temperaturas[numTemperaturas] = entrada.nextFloat();
                numLeidas++;
                numTemperaturas++;
            } else {
                entrada.next();
            }
        }
        entrada.nextLine();
    }

    public void actualizarFecha() {
        //¿cuantos dias tiene este mes?

        int diasMesActual = 0;
        if (mes == 2) {
            diasMesActual = 28;
        } else if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
            diasMesActual = 30;
        } else {
            diasMesActual = 31;
        }
        dia += 7;
        //cambio de mes 
        if (dia > diasMesActual) {
            dia = dia - diasMesActual;
            mes++;
            //cambio de año
            if (mes > 12) {
                mes = 1;
            }

        }

    }

    public void mostrarFecha() {
        System.out.println(dia + " de ");
        switch (mes) {
            case 1:
                System.out.println("enero");
                break;
            case 2:
                System.out.println("febrero");
                break;
            case 3:
                System.out.println("marzo");
                break;
            case 4:
                System.out.println("abril");
                break;

            case 5:
                System.out.println("mayo");
                break;
            case 6:
                System.out.println("juni");
                break;
            case 7:
                System.out.println("julio");
                break;
            case 8:
                System.out.println("agosto");
                break;
            case 9:
                System.out.println("septiembre");
                break;
            case 10:
                System.out.println("octubre");
                break;
            case 11:
                System.out.println("noviembre");
                break;
            case 12:
                System.out.println("dicimbre");
                break;
        }

    }

    public void calcularMedia() {
        float acumulador = 0;
        //para todos los indices hasta el indice actual 
        for (int i = 0; i < numTemperaturas; i++) {
            //sumatorio de temperaturas existentes 
            acumulador = acumulador + temperaturas[i];
        }
        System.out.println(acumulador / numTemperaturas);
    }

    public void calcularDiferencia() {
        float max = temperaturas[0];
        float min = temperaturas[0];
        for (int i = 0; i < numTemperaturas; i++) {
            if (temperaturas[i] < min) {
                min = temperaturas[i];
            }
            if (temperaturas[i] > max) {
                max = temperaturas[i];
            }
        }System.out.println(max - min);
    }
    
}
