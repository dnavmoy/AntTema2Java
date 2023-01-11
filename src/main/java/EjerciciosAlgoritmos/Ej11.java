/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosAlgoritmos;

import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class Ej11 {
    public static void main(String[] args) {
        
        double ladoH,ladoR,areaTotal;
        ladoH=Ej10.pedirNumeroJO("Introduce lado H");
        ladoR=Ej10.pedirNumeroJO("Introduce lado R");
        areaTotal=calcularAreaRara(ladoH, ladoR);
        JOptionPane.showMessageDialog(null,"El area es %.2f".formatted(areaTotal));
    }
    public static double calcularAreaRara( double ladoH,double ladoR){
        double area1,area2,areaTotal;
        area1=(ladoH*(ladoR*2))/2;
        double cuadradoLadoR=Math.sqrt(ladoR);
        area2=((cuadradoLadoR)*Math.PI)/2;
        areaTotal=area1+area2;
        
        
        
        return areaTotal;
    }
}
