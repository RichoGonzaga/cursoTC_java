/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricardocruzgonzaga
 */
public class Vehiculo {
    //atributos
    private String matricula;
    private String marca ;
    private String modelo;
    private int precioAlquilerPorDia;
    final double DESCUENTO_LARGA_DURACION = .9;
    public Vehiculo(String matricula, String marca,String modelo ,int precioAlquilerPorDia ){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.precioAlquilerPorDia = precioAlquilerPorDia;
    }    
    
    public String getMatricula () {
        return matricula;
    }    
    public void setMatricula (String matricula){
        this.matricula = matricula;
    }
    
    public String getMarca () {
        return marca;
    }    
    public void setMarca (String marca){
        this.marca = marca;
    }
    
    public String getModelo () {
        return modelo;
    }    
    public void setModelo (String modelo){
        this.modelo = modelo;
    }
    
    public int getPAPD () {
        return precioAlquilerPorDia;
    }    
    public void setPAPD (int precioAlquilerPorDia){
        this.precioAlquilerPorDia = precioAlquilerPorDia;
    }
    
    public double calcularPrecioAlquiles(int dias){
        double precio = 0;
        if(dias<7){
            precio = dias*precioAlquilerPorDia;
        } else if (dias >=7){
            precio = dias*precioAlquilerPorDia*DESCUENTO_LARGA_DURACION;
        }else if(dias <= 0){
            System.out.println("Opción no valida.");
        }
        return precio;
    }
    
}
