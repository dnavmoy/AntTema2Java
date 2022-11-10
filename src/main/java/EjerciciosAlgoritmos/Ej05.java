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
public class Ej05 {
    public static void main(String[] args) {
        
        int numeroHoras=pedirNumero("Cuantas horas imparte cada profesor");
        int numeroGrupos=pedirNumero("Cuantos grupos hay");
        double numeroProfesores=numeroProfesores(numeroHoras,numeroGrupos);
        double sobraExtra=sobrante(numeroProfesores, numeroHoras,numeroGrupos);
       numeroProfesores=Math.ceil(numeroProfesores);
        System.out.println("El total de profesores es :%f y sobran %f horas".formatted(numeroProfesores,sobraExtra));
        
  
        
    }
    
    public static double numeroProfesores(int numerohoras,int numeroGrupos){
            
        double totalHoras= numeroGrupos*30;
        double totalProfesores=(totalHoras/numerohoras);
             
                
        
        return totalProfesores;
        
    }
    public static double sobrante(double numeroProfesores,double numeroHoras,double numeroGrupos){
        
        
        //double horasExtras=(numeroProfesores%1)*numeroHoras;
        numeroProfesores=Math.floor(numeroProfesores);
       double sobraExtra=(numeroGrupos*30)-(numeroProfesores*numeroHoras);
       
        return sobraExtra;
    }
}
