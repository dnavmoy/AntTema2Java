/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosAlgoritmos;

import javax.swing.JOptionPane;

/**
 *
 * @author Dan_n
 */
public class Ej07v2 {
    public static void main(String[] args) {
        
        double tipoConversion,cantidadEuros,cantidadDolares;
       // String texto;
//        texto=JOptionPane.showInputDialog("introduce tipo conversion");
//        tipoConversion=Double.parseDouble(texto);
        tipoConversion=pedirNumeroJO("Introduce tipo conversion");
        cantidadEuros=pedirNumeroJO("introduce Euros");
       //texto=JOptionPane.showInputDialog("Introduce Euros");
       // cantidadEuros=Double.parseDouble(texto);
        cantidadDolares=cantidadEuros*tipoConversion;
        JOptionPane.showMessageDialog(null, "en dolares son "+cantidadDolares);
        
    }
    
    public static double pedirNumeroJO(String texto){
        
        String mensaje=JOptionPane.showInputDialog(texto);
        //JOptionPane.showMessageDialog(null, mensaje);
         double numero=Double.parseDouble(mensaje);
         return numero;
        
    }
    }
}
