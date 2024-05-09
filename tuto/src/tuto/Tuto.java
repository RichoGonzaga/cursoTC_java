/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuto;

import java.util.Scanner;

/**
 *
 * @author ricardocruzgonzaga
 */
public class Tuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ 
        int numero;
        numero = 9;    
        System.out.println("Hola");
        System.out.println("El número entero es " + numero);
        double numeroo;
        numeroo = 9.5;
        System.out.println("El número double es " + numeroo);
        char letra;
        letra = 'a';
        System.out.println("La letra es " + letra);
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa un número entero");
        int num;
        num = leer.nextInt();
        System.out.println("EL número es: " + num);
        double numdou;
        numdou = leer.nextDouble();
        System.out.println("EL número decimal es: " + numdou);
        String mensaje;
        System.out.println("Ingresa un mensaje: ");
        mensaje = leer.next();
        System.out.println("El mensaje es" + mensaje);
        
        int n1, n2, n3;
        
        System.out.println("Ingresa el primer número:");
        n1 = leer.nextInt();
        System.out.println("Ingresa el segundo número:");
        n2 = leer.nextInt();
        System.out.println("Ingresa el tercer número:");
        n3 = leer.nextInt();
        
        if(n1 > n2 && n1>n3){
            System.out.println("El primer número (" + n1 + ") es el más grande");
        } else if (n2 > n1 && n2>n3){
            System.out.println("El segundo número (" + n2 + ") es el más grande");
        } else if (n3 > n1 && n3>n2){
            System.out.println("El tercer número (" + n3 + ") es el más grande");
        } else if (n1 == 0 && n2 == 0 && n3 == 0){
            System.out.println("Los números son nulos");
        } else if (n2 == n1 && n2 == n3){
            System.out.println("Los números son iguales");
        }
       
        
                
        
        
    }
    
}
