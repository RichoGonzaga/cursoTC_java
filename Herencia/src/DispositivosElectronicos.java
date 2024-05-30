/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricardocruzgonzaga
 */
public class DispositivosElectronicos {
    //atributos
    private String marca;
    private int numeroSerie;
    
    //constructor
    public DispositivosElectronicos(String marca, int numeroSerie){
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        
    }
    
    //Métodos
    public void encender(){
        System.out.println("El dispositivo está encendido");
    }
    
    public void showData(){
        System.out.println("La maraca es: " + marca +
                ".\nEl número de serie es: " + numeroSerie);
    }
    
    
}
