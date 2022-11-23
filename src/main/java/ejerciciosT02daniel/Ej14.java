/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosT02daniel;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Dan_n
 */
public class Ej14 {
    public static void main(String[] args) {
        
      
       String texto;
       
//      int minutos,horas; añado algo
//      Scanner teclado = new Scanner(System.in);
//      System.out.println("Dime segundos");
//      int segundos = teclado.nextInt();
//                
//        horas = segundos/3600;
//       segundos = segundos - horas*3600;
//        minutos = segundos/60;
//      segundos = segundos - minutos*60;
//        
//            
//        
//   System.out.println("horas " + horas + "minutos " + minutos + "segundos " + segundos);
        

        int segundos,minutos,horas;

        texto =JOptionPane.showInputDialog(null, "introduce Segundos");
       segundos= Integer.parseInt(texto);
       
       horas = segundos/3600;
       segundos = segundos - horas*3600;
      minutos = segundos/60;
     segundos = segundos - minutos*60;
      
       
      JOptionPane.showMessageDialog(null, "%d horas %d minutos %d segundos".formatted(horas,minutos,segundos));
        
                                        }
}
