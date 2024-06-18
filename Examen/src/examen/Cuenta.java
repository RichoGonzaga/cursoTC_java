/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author ricardocruzgonzaga
 */
public class Cuenta {
    //Atributos
    String titular;
    double cantidad;
    
    //Constructores 
    public void Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    public void Titular(String titular){
        this.titular = titular;
    }
    
    //Métodos set, get. To String
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
    
    public double getCantidad(){
        return cantidad;
    }
    
    @Override
    public String toString(){
        return "El titular de la cuenta es: " + titular + " con el saldo de: " + cantidad + "MXN.";
    }
    
    public void ingresar(double cantidad){
        if (cantidad < 0){
            
        } else{
            this.cantidad = this.cantidad + cantidad ;
        }
    }
    
    public void retirar(double cantidad){
        if (this.cantidad - cantidad < 0){
            this.cantidad = 0;
        } else{
            this.cantidad = this.cantidad - cantidad;
        }
    }
    
}
