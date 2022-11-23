/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosAlgoritmos;

/**
 *
 * @author Dan_n
 */
public class Ej09 {
    public static void main(String[] args) {
        double precioArticulo,precioConIva;
        final double IVA=(21/100);
        System.out.println("el iva es: " + IVA);
        precioArticulo=Ej07.pedirNumeroDouble("cuanto cuesta el articulo?: ");
        
        precioConIva=precioArticulo*(1+IVA);
        System.out.println("precio con iva es:" + precioConIva);
    }
}
