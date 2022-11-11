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
public class Ej05v2 {
    public static void main(String[] args) {
        int horasProfesor,gruposProfesores;
        horasProfesor=pedirNumero("cuantas horas da cada profesor?");
        gruposProfesores=pedirNumero("¿Cuantos grupos hay");
        double totalProfesores=totalProfesoras(horasProfesor,gruposProfesores);
        boolean decimales=tieneDecimales(totalProfesores);
         double horasExtras=(1-(totalProfesores%1))*horasProfesor;
         //double horasExtras=(totalProfesores%1)*100/horasProfesor;
            if (decimales) {
                totalProfesores=totalProfesores-(totalProfesores%1);
                totalProfesores++;
            
                  System.out.println("""
                           El total de profesores es : %.0f
                           El total de horas extras son %.0f """.formatted(totalProfesores,horasExtras));
                  
        } 
       
           
      
        
    }

    
        public static double totalProfesoras(double horasProfesor, double grupos){
        double totalProfesores=(grupos*30)/(double)horasProfesor;
        
        return totalProfesores;
    }
    
    
    
    public static boolean tieneDecimales(double numero){
        return (numero%1!=0);
    }
    
}
