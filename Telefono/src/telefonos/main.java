/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefonos;

/**
 *
 * @author ricardocruzgonzaga
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        telefonos tel1 = new telefonos();
        
        tel1.obtener_marca();
        tel1.obtener_modelo();
        tel1.obtener_color();
        tel1.ontener_capacidad();
        tel1.mostar_datos();
    }
    
}
