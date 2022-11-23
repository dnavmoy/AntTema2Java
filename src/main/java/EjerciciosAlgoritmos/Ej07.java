/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosAlgoritmos;

/**
 *
 * @author daniel
 */
public class Ej07 {
    public static void main(String[] args) {
        double tipoConversion=Ej01.pedirNumero("cual es el tipo de conversion?");
        double cantidadEuros=Ej01.pedirNumero("Cuantos euros");
        double cantidadDolares=cantidadEuros*tipoConversion;
        
        System.out.println("El total de dolares es: %d".formatted(cantidadDolares));
       
            
    }
}
public static double pedirNumeroDouble( String text){
        
        String mensaje=(text.isBlank())
            ? "Introduce datos por teclado"
            :text;
         System.out.println(mensaje);
         double numero=teclado.nextInt();