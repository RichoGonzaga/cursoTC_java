/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_poo;

import java.util.Scanner;

/**
 *
 * @author ricardocruzgonzaga
 */
public class operaciones {
    //atributos o caracteristicas
    //int numero1;
    //int numero2;
    int suma;
    int resta;
    int multiplicacion;
    //metodos o funciones
    //public void pedirnumeros(){
    //  Scanner leer = new Scanner(System.in);
    //  System.out.println ("Ingresa el primer numero");
    //  numero1 = leer.nextInt();
    //  System.out.println("Ingresa el segundo numero");
    //  numero2 = leer.nextInt();
    //}
    
    public void sumar(int numero1, int numero2){
        suma = numero1 + numero2;
    }
    public void restar(int numero1, int numero2){
        resta = numero1 - numero2;
    }
    public void multiplicacion(int numero1, int numero2){
        multiplicacion = numero1 * numero2;
    }    
    public void resultados(){
        System.out.println("La suma es "+ suma);
        System.out.println("La resta es "+ resta);
        System.out.println("La multiplicacion es "+ multiplicacion);
    
    }
}
