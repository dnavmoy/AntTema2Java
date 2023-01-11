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
        JOptionPane.showMessageDialog(null, areaTotal);
    }
    public static double calcularAreaRara( double ladoH,double ladoR){
        double area1,area2,areaTotal;
        area1=(ladoH*(ladoR*2))/2;
        area2=((ladoR*ladoR)*3.16)/2;
        areaTotal=area1+area2;
        
        return areaTotal;
    }
}
