
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricardocruzgonzaga
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        //System.out.println("--- Clase padre ----");
        //Figura figura = new Figura(2,4);
        //figura.showData();
        //System.out.println("--- CLASE HIJA ----");
        //Cuadruado sq = new Cuadruado(2,4,0);
        //sq.calArea();
        //sq.showData();
        Vehiculo v1 = new Vehiculo("A123BC","BMW","X5",2500);
        Vehiculo v2 = new Vehiculo("123ZXC","Harley Davidson","SPORTSTER S",1200);
        Coche c1 = new Coche(v1.getMatricula(),v1.getMarca(),v1.getModelo(),v1.getPAPD(),5);
        Moto m1 = new Moto(v2.getMatricula(),v2.getMarca(),v2.getModelo(),v2.getPAPD(),8);
        //Menu
        System.out.println("¿Qué tipo de vehiculo deseas rentar?");
        System.out.println("1) Automovil");
        System.out.println("2) Motocicleta");
        op = leer.nextInt();
        switch(op){
            case 1:
                System.out.println("Automoviles disponibles");
                System.out.println("1) "+ c1.getMarca()+ " " + c1.getModelo());
                op = leer.nextInt();
                switch(op){
                    case 1:
                        System.out.println("¿Cuántos días quiere alquilarlo?");
                        int dias = leer.nextInt();
                        System.out.println("El costo total seía de: " + c1.calcularPrecioAlquiles(dias));
                        break;
                    default:
                        System.out.println("Opción no valida");    
                }
                break;
            case 2:
                System.out.println("Motocicletas disponibles");
                System.out.println("1) "+ m1.getMarca()+ " " + m1.getModelo());
                op = leer.nextInt();
                switch(op){
                    case 1:
                        System.out.println("¿Cuántos días quiere alquilarlo?");
                        int dias = leer.nextInt();
                        System.out.println("El costo total seía de: " + m1.calcularPrecioAlquiles(dias));
                        break;
                    default:
                        System.out.println("Opción no valida");    
                }
                break;
     
            default:
                System.out.println("Opción no valida");    
        }
        
        
    }
    
}
