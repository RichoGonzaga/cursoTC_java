/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricardocruzgonzaga
 */
public class TelefonoMovil extends DispositivosElectronicos{
    //atributos
    private int almacenamiento;
    
    //constructor
    public TelefonoMovil(String marca, int numeroSerie, int almacenamiento){
        super(marca,numeroSerie);
        this.almacenamiento = almacenamiento;
    }
   //método
    @Override
    public void showData(){
        super.showData();
        System.out.println("El almacenamiento es de: " + almacenamiento + "GB");
    }
}
