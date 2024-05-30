/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ricardocruzgonzaga
 */
public class Coche extends Vehiculo{
    
   //atributos 
    public int numeroPuertas;
    
    //constructor
    public Coche(String matricula, String marca,String modelo ,int precioAlquilerPorDia, int numeroPuertas){
        super(matricula,marca,modelo,precioAlquilerPorDia);
        this.numeroPuertas = numeroPuertas;
    }
     
    public int getNumPuertas () {
        return numeroPuertas;
    }    
    public void setNumPuertas (int numPuertas){
        this.numeroPuertas = numPuertas;
    }
    
}
