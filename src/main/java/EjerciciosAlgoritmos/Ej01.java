/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosAlgoritmos;

import java.util.Scanner;

/**
 *
 * @author Dan_n
 */
public class Ej01 {
    public static Scanner teclado =new Scanner(System.in);
    public static void main(String[] args) {
        
//            double gradosFarenheit;
//            
//            Scanner teclado =new Scanner(System.in);
//            System.out.println("Introduce grados centigrados");
//            int gradosCentigrados= teclado.nextInt();
//            gradosFarenheit= gradosCentigrados*1.8 +32;
//            System.out.println("Fº : " + gradosFarenheit);
//            
  String text="Introduce grados Centigrados: "; 
        int numero=pedirNumero(text);
        double gradosFarenheit=numero*1.8 + 32;
        System.out.println("Grados Farenheit: "+gradosFarenheit);
    }
    
     public static int pedirNumero( String text){
        
        String mensaje=(text.isBlank())
            ? "Introduce datos por teclado"
            :text;
         System.out.println(mensaje);
         int numero=teclado.nextInt();
               
 
        
    return numero;
        }
    
    
}
