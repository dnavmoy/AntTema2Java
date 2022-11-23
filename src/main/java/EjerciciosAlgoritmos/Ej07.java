/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosAlgoritmos;

 

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ej07 {
    
     public static Scanner teclado =new Scanner(System.in);
    public static void main(String[] args) {
        
   
        double tipoConversion=pedirNumeroDouble("cual es el tipo de conversion?");
        double cantidadEuros=pedirNumeroDouble("Cuantos euros");
        double cantidadDolares=cantidadEuros*tipoConversion;
        
        System.out.println("El total de dolares es: " + cantidadDolares);
       
            
    }

public static double pedirNumeroDouble( String text){
        
          String mensaje=(text.isBlank())
            ? "Introduce datos por teclado"
            :text;
         System.out.println(mensaje);
         double numero=teclado.nextDouble();
         return numero;
         }
}