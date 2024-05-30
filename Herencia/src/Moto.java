/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricardocruzgonzaga
 */
public class Moto extends Vehiculo{
    //atributos 
    public int cilindrada;
    
    //constructor
    public Moto(String matricula, String marca,String modelo ,int precioAlquilerPorDia, int cilindrada){
        super(matricula,marca,modelo,precioAlquilerPorDia);
        this.cilindrada = cilindrada;
    }
    
    //Metodo
    
    public int getCilindros () {
        return cilindrada;
    }    
    public void setCilindros (int c){
        this.cilindrada = c;
    }
    
}
