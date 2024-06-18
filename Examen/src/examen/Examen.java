/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author ricardocruzgonzaga
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // TODO code application logic here
        //Ejercicio 2
         String nombre = "Ricardo C. Gonzaga";
         System.out.println("Bienvenido " + nombre);
        
        //Ejercicio 3
        int n;
        int contador = 0;
        do{
            System.out.println("Ingresa un número, por favor:");
            System.out.println("(El programa terminara cuando se ingrese el -1)");
            n = leer.nextInt();
            contador++;
        }while(n != -1);
        System.out.println("El  número total de números ingresados es: " + (contador - 1));
    }
    
}
