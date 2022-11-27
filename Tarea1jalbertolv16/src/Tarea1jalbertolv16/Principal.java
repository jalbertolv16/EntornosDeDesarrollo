package Tarea1jalbertolv16;

import java.util.Scanner;
import java.util.Random;
import java.time.*;



public class Principal {

	public static void main(String[] args) {
		 Scanner in = new Scanner (System.in);
	        int opcion = -1;
	        do {
	            mostrarMenu();
	            opcion = in.nextInt();
	            in = new Scanner(System.in);
	            
	            switch(opcion){
	                case 1:
	                    int entero1, entero2;
	                    System.out.println("Introduzca el primer número entero");
	                    entero1 = in.nextInt();
	                    System.out.println("Introduzca el segundo número entero");
	                    entero2 = in.nextInt();
	                    if(entero1 > entero2)
	                        System.out.println("El primer valor introducido es mayor que el segundo: " + entero1 + " mayor que " + entero2);
	                    else if(entero1 < entero2)
	                        System.out.println("El segundo valor introducido es mayor que el primero: " + entero2 + " mayor que " + entero1);
	                    else
	                        System.out.println("Ambos valores son iguales: " + entero1 + " igual que " + entero2);              
	                break;
	                
	                case 2:
	                    // Declaración de variables
	                    String cadena1;
	                    String cadena2;
	                    int posicion;
	                    // Recogida del primer dato de entrada
	                    System.out.println("Introduzca la cadena de caracteres");
	                    cadena1 = in.nextLine();
	                    while(cadena1.length() == 1){
	                        System.out.println("Error, la cadena debe contener al menos dos caracteres");
	                        cadena1 = in.nextLine();
	                    }
	                    // Recogida del segundo dato de entrada
	                    System.out.println("Introduzca un caracter");
	                    cadena2 = in.nextLine();
	                    while(cadena2.length() != 1){
	                        System.out.println("Error,solo debe contener un caracter");
	                        cadena2 = in.nextLine();
	                    }
	                    // Comprobación de cadenas
	                    // La función indexOf devuelve la posición de la cadena 2 en la cadena 1 y si no existe -1
	                    posicion = cadena1.indexOf(cadena2);
	                    if(posicion > -1){
	                        posicion = posicion + 1;
	                        System.out.println(cadena2 + " está en "+ cadena1 + " en la posición " + posicion);
	                    }
	                    else
	                        System.out.println(cadena2+ " no está en " + cadena1);               
	                break;    
	                
	                case 3:
	                    Random random = new Random();
	                    String vocales = "aeiou";
	                    int randomInt = random.nextInt(vocales.length());
	                    char randomChar= vocales.charAt(randomInt);
	                    System.out.println("Se ha generado la siguiente vocal aleatoria: " + randomChar);
	                break;
	                
	                case 4:
	                    LocalDate hoy = LocalDate.now();
	                    LocalTime ahora = LocalTime.now();
	                    LocalDateTime fecha = LocalDateTime.of(hoy, ahora);
	                    System.out.println("Fecha y hora actual: " + fecha);
	                break;
	            }
	            	            
	        } while (opcion != 0);
	        in.close();
	        System.out.println("Ha pulsado la opción salir. Se finaliza el programa");
	}
	
	/**
	 * Método que muestra las diferentes opciones de menú
	 */
	public static void mostrarMenu(){
        System.out.println("Pulse 0: Finalizar programa");
        System.out.println("Pulse 1: Introducir dos números enteros para saber cuál es mayor o si son iguales");
        System.out.println("Pulse 2: Cadena de caracteres mayor que uno más un caracter, saber si el caracter está en la cadena");
        System.out.println("Pulse 3: Generar una vocal aleatorio y mostrarla por pantalla");
        System.out.println("Pulse 4: Mostrar fecha y hora actual");
    }

}
