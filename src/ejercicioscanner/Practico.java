/*
 Determinar la edad y género.

Realizar un programa en Java que tome dos lecturas por teclado. En una lectura, el usuario deberá escribir su género (masculino o femenino) y en la siguiente lectura, su edad.

En base a los datos registrados, el programa deberá determinar que si la edad es mayor o igual a 18, se enviará un mensaje por pantalla que diga: "Eres mayor de edad", de lo contrario, se dirá: "Eres menor de edad".

También, si el usuario escribe "masculino", se debe desplegar por pantalla un mensaje que diga: "Eres un hombre", si escribe "femenino", desplegara "Eres una mujer".

Al final, dependiendo los datos que el usuario ingrese, deberá imprimirse una leyenda similar a la siguiente:

Hola, eres un hombre de 18 años. Eres mayor de edad.
 */
package ejercicioscanner;

import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 *
 * @author jose.zapatagom
 */
public class Practico {
    
    
    public static void main(String [] args){
     
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Hola, cuál es tu género?");
        //nextLine se utiliza cuando intentamos leer cadenas de caracteres desde el teclado.
        String genero = sc.nextLine();
        
        System.out.println("¿Cuál es tu edad?");
        int edad = sc.nextInt();

        //ahora debes poner el código necesario para realizar el ejercicio
        
      
        
    }
    
    
    
    
}
