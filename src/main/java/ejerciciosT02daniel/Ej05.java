/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosT02daniel;

/**
 *
 * @author Dan_n
 */
public class Ej05 {
    
    public static void main(String[] args) {
        
        boolean verdadero=true, falso=false;
        double prueba=1.0;
        
       System.out.println( """
                           verdadero && verdadero  es %b
                           verdadero && falso es %b
                           falso && verdadero es %b
                           falso && falso es %b 
                           verdadero|| verdadero %b
                           verdadero|| falso %b
                           falso || verdadero %b
                           falso || falso %b """.formatted(verdadero&&verdadero,verdadero&&falso,falso&&verdadero,falso&&falso,verdadero||verdadero,verdadero||falso,falso||verdadero,falso||falso));
       
        System.out.println( "!verdadero es " + !verdadero + " y !falso es "+ !falso);
        
                              boolean test = (1==1);
		System.out.println(test);
    }
}
