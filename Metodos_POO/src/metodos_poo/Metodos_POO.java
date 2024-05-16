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
public class Metodos_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        operaciones operaciones = new operaciones();
        Scanner leer = new Scanner(System.in);
        System.out.println ("Ingresa el primer numero");
        int n1 = leer.nextInt();
        System.out.println("Ingresa el segundo numero");
        int n2 = leer.nextInt();
        //operaciones.pedirnumeros();
        operaciones.sumar(n1,n2);
        operaciones.restar(n1,n2);
        operaciones.multiplicacion(n1,n2);
        operaciones.resultados();
        
    }
    
    
}
