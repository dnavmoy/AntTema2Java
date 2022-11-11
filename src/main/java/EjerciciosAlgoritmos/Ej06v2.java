/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosAlgoritmos;

/**
 *
 * @author danielnavarro
 */
public class Ej06v2 {
    public static void main(String[] args) {
        double numeroPrimero,numeroSegundo,numeroTercero;
        
        numeroPrimero=Ej01.pedirNumero("cual es la cantidad la primera persona");
        numeroSegundo=Ej01.pedirNumero("cual es la cantidad del segundo?");
        numeroTercero=Ej01.pedirNumero("Cual es la tercera cantidad?");
        
        double totalInversion=numeroPrimero+numeroSegundo+numeroTercero;
       double  porcentajePrimero=(numeroPrimero/totalInversion)*100;
       double  porcentajeSegundo=(numeroSegundo/totalInversion)*100;
       double  porcentajeTercero=(numeroTercero/totalInversion)*100;
       
        System.out.println("""
                           El total de la inversion es: %f
                           El primer inversion pone un %f del total
                           El segundo inversor pone un %f del total
                           El tercer inverson pone un %f del total
                           """.formatted(totalInversion,porcentajePrimero,porcentajeSegundo,porcentajeTercero));
       
    }
}
