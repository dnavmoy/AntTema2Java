package EjerciciosAlgoritmos;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daniel
 */
public class Ej10 {

    public static void main(String[] args) {
        double ladoA, ladoB, ladoC;
        
        ladoA=pedirNumeroJO("Introduce lado A");
        ladoB=Ej07v2.pedirNumeroJO("introduce lado B");
        ladoC=Ej07v2.pedirNumeroJO("Introduce lado C");
        
        System.out.println("lado a "+ ladoA+ "lado b: "+ladoB+"lado c: "+ladoC);
    }
        public static double pedirNumeroJO(String texto){
         String mensaje=(texto.isBlank())
                ? "Introduce datos por teclado"
            :texto;
               
         double numero=Double.parseDouble(mensaje);
         return numero;

}
