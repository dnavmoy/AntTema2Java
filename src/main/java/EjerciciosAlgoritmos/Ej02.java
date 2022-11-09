/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosAlgoritmos;

import static EjerciciosAlgoritmos.Ej01.pedirNumero;
import java.util.Scanner;

/**
 *
 * @author Dan_n
 */
public class Ej02 {
    public static void main(String[] args) {
        
        //Scanner teclado =new Scanner(System.in);
        //System.out.println("Introduce Radio de Circunferencia:");
       //double radio=teclado.nextInt();
       
        final double PI=Math.PI;
        double radio=pedirNumero("Introduce Radio de Circunferencia:");
         //double longitud=radio*2*PI;
        // double area=Math.pow(radio,2)*PI;
         //double volumen=Math.pow(radio,3)*PI*4/3;
         double longitud=longitudCircunferencia(radio);
         double area=areaCircunferencia(radio);
         double volumen=volumenCircunferencia(radio);
         
         
        System.out.println("""
                           La longitud de la circunferencia es %f
                           El area de la circunferencia es %f
                           El volumen de la esfera es %f
                           """.formatted(longitud,area,volumen));
                
                }
    public static double longitudCircunferencia(double radio){
         final double PI=Math.PI; 
        double longitud=radio*2*PI;
        return longitud;
    }
    
    public static double areaCircunferencia(double radio){
             final double PI=Math.PI; 
             double area= Math.pow(radio,2)*PI;
            return area;
        
    }
    public static double volumenCircunferencia(double radio){
        final double PI=Math.PI;
        double volumen=Math.pow(radio,3)*PI*4/3;
        return volumen;
    }
}
