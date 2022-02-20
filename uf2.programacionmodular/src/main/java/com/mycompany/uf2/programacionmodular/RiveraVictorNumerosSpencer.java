
package com.mycompany.uf2.programacionmodular;
import static java.lang.Math.pow;


public class RiveraVictorNumerosSpencer {

    
    public static void main(String[] args) {
        // TODO code application logic here
        RiveraVictorNumerosSpencer programa = new RiveraVictorNumerosSpencer();
        programa.inicio();
        
    }
    
    //Nivel 1
    public void inicio(){
        System.out.println("... ");
        System.out.println("Arrancando el programa...");
        System.out.println(" ");
        int spencers = 0;
        int busqueda = 0;  //Declaramos variables externas al while para su correcta ejecucion
        int digitos = 0;
        int arraySpencer[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; //array para almacenar numeros Spencer
        
        while(spencers<20){  //No terminará hasta que los 20 numeros sean encontrados y trasladados al array 
            busqueda = busqueda + 1; //por cada iteracion aumentamos el numero que será comparado con las caracteristicas Spencer
            digitos = contarDigitos(busqueda); //almacena la respuesta de la funcion 
            //int arrayNums[];
            //arrayNums = new int[digitos];
            //arrayNums = separarNums(busqueda, digitos);
            if(calcularSpencer(separarNums(busqueda, digitos), busqueda) == true){ //Ejecuta las funciones y en caso de ser true
                arraySpencer = almacenarSpencer(arraySpencer, busqueda);            // almacena el numero en la array
                spencers++;
                
            }
        }
        
        for(int i=0; i<arraySpencer.length; i++){
            System.out.println(arraySpencer[i]);  //imprime la array una vez completada
        }
        
    }
    
    //Nivel 2
    public int contarDigitos(int num){  //Cuenta los digitos de un numero
        int digit = 0;
        
        while(num > 0){
            num = num/10;
            digit ++;
        }
        
        return digit;
    }
    
    public boolean calcularSpencer(int arrayDigit[], int num){ //Recibe una array con varios numeros y 
        boolean spencer = false;                               // comprueba que sea una relacion spencer
        int digits = arrayDigit.length;                        // con el otro entero.
        int acum = 0;
        for(int i=0; i<arrayDigit.length; i++){
            acum += pow(arrayDigit[i], digits); //acumula la suma de los numeros por separado con su 
        }                                       //correspondiente multiplicacion
        if(acum == num){
            spencer = true;
        }
        
        return spencer; //devuelve un booleano respondiendo a si es o no es Spencer
    }
    
    
    
    public static int[] almacenarSpencer(int array[], int num){ //almacena los numeros confirmados como Spencer
        boolean terminar = false;                               // en la array de numeros Spencer
        
        for(int i=0; i<array.length; i++){
            
            if(array[i] == 0){
                while(!terminar){
                    array[i] = num;   //En cuanto este almacenado cierra el bucle
                    terminar = true;
                }
                
            }
            
                
        }
        return array; //devuelve el array de Spencer actualizado
        
        
        
    }
    
    //Nivel 3
    public static int[] separarNums(int num, int digit){ //Separa los digitos de un numero
        int arrayDigits[];                          // y se almacenan en un array
        arrayDigits = new int[digit];
        
        for(int i=digit; i>0; i--){
            arrayDigits[i-1] = num%10;
            num = num/10;
        }
        
        return arrayDigits; //devuelve el array de los digitos enteros separados
    }
    
    
    
}
