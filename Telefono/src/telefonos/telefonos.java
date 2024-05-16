/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefonos;

import javax.swing.JOptionPane;

/**
 *
 * @author ricardocruzgonzaga
 */
public class telefonos {
    //Atributos
    String marca;
    String modelo;
    String color;
    int capacidad;
    
    //Métodos
    //Uso de JOptionPane
   public void obtener_marca(){
       marca = JOptionPane.showInputDialog(null, "¿Cuál es la marca del telefono?");    
   }
   
   public void obtener_modelo(){
       modelo = JOptionPane.showInputDialog(null, "¿Cuál es el modelo del telefono?");
   }
   
   public void obtener_color(){
       color = JOptionPane.showInputDialog(null, "¿Cuál es el color del telefono?");
   }
   
   public void ontener_capacidad(){
       capacidad = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál es la capacidad de tu telefono?"));
   }
   public void mostar_datos(){
       JOptionPane.showInputDialog(null, "Datos del telefono. \nMarca: " + marca + ".\nModelo: " + modelo + ".\nCapacidad: "+ capacidad + " GB.\nColor: " + color);
   } 
}
