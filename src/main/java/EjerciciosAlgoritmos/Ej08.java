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
public class Ej08 {
    public static void main(String[] args) {
        
        double presupuestoGinecologia,presupuestoPediatria,presupuestoTraumatologia;
        double presupuestoTotal;
        presupuestoTotal=Ej07v2.pedirNumeroJO("cual es el prespuesto total?");
        presupuestoGinecologia=presupuestoTotal*0.4;
        presupuestoPediatria=presupuestoTotal*0.3;
        presupuestoTraumatologia=presupuestoTotal*0.3;
        
        JOptionPane.showMessageDialog(null, "Presupuesto de ginecología: %.2f".formatted(presupuestoGinecologia));                                     
        JOptionPane.showMessageDialog(null, "Presupuesto de trauma: %.2f".formatted(presupuestoTraumatologia));                                     
        JOptionPane.showMessageDialog(null, "Presupuesto de Pediatría: %.2f".formatted(presupuestoPediatria));                                     
    }
}
