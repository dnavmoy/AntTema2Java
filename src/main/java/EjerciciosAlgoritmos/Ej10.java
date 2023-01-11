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
        double ladoA, ladoB, ladoC, area;
        
        ladoA=pedirNumeroJO("Introduce lado A");
        ladoB=pedirNumeroJO("introduce lado B");
        ladoC=pedirNumeroJO("Introduce lado C");
        area=calcularArea(ladoA,ladoB,ladoC);
        JOptionPane.showMessageDialog(null,area);
        
        
    }
      public static double pedirNumeroJO(String texto){
        String mensaje=JOptionPane.showInputDialog(texto);
        
         double numero=Double.parseDouble(mensaje);
         return numero;
      }
      
      public static double calcularArea(double ladoA, double ladoB, double ladoC){
          double areaTotal,area1,area2;
          area1=ladoB*ladoC;
          area2=(ladoB*(ladoA-ladoC))/2;
          areaTotal=area1+area2;
          return areaTotal;
      }
}
