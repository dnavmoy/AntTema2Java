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
public class Ej03 {
    public static void main(String[] args) {
        
        double nota1=pedirNumero("Introduce 1 numero");
        double nota2=pedirNumero("Introduce segundo numero");
        double nota3=pedirNumero("Introduce tercer numero");
        
        double notaMedia=notaMedia(nota1,nota2,nota3);
        
        System.out.println("La nota media es: " + notaMedia);
    }
    
    public static double notaMedia(double nota1,double nota2, double nota3){
        double notaMedia=(nota1+nota2+nota3)/3;
        return notaMedia;
                   
    }
}
