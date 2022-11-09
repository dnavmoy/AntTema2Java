/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosAlgoritmos;
import static EjerciciosAlgoritmos.Ej01.pedirNumero;
/**
 *
 * @author Dan_n
 */
public class Ej04 {
    public static void main(String[] args) {
        final double PF=1.25;
        final double PKM=0.08;
        double recorrido=pedirNumero("cuantos kilometros vas a recorrer?:");
        
        double precioTotal=precioUber(PF,PKM,recorrido);
        
        System.out.println("El presupuesto para tu trayecto es de %.2f Euros".formatted(precioTotal));
        
        
    }
    public static double precioUber(double precioFijo,double precioKm,double kmRecorridos){
        double precioTotal= precioFijo+(precioKm*kmRecorridos);
        return precioTotal;
    }
}
