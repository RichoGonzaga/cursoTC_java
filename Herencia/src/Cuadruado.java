/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author ricardocruzgonzaga
 */
public class Cuadruado extends Figura{
    //atributos
    private int area;
    
    //constructor
    public Cuadruado(int dimension, int numLados, int area){
        super(dimension,numLados);
        this.area = area;
    }
   //método
    public void calArea(){
         Scanner leer = new Scanner(System.in);
         System.out.println("¿Cuáanto mide un lado?");
         int lado = leer.nextInt();
         area = lado*lado;
        
    }
    @Override
    public void showData(){
        super.showData();
        System.out.println("El area del cuadrado es: " + area + "u^2");
    }
}
