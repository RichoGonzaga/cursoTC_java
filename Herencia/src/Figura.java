/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricardocruzgonzaga
 */
public class Figura{
        //atributos
    private int dimension;
    private int numLados;
    
    //constructor
    public Figura(int dimension, int numLados){
        this.dimension = dimension;
        this.numLados = numLados;
        
    }
    
    //Métodos
    public void encender(){
        System.out.println("El dispositivo está encendido");
    }
    
    public void showData(){
        System.out.println("Las dimensiones de la figura es: " + dimension +
                ".\nEl número de lados de la figura es: " + numLados);
    }
    
}
