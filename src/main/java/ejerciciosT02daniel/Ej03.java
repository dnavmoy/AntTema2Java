/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosT02daniel;

import javax.swing.JOptionPane;

/**
 *
 * @author Dan_n
 */
public class Ej03 {
    public static void main(String[] args) {
        int a=10, b=5, i=0;
        double c=71.3, d=4.8;
      
        
        
        int aSumab =a+b;
        int aRestab= a-b;
        int aMultiplicacionb= a*b;
        int aDivisionb = a/b;
        double cSumad=c+d;
        double cRestad = c-d;
        double cMultiplicaciond =c*d;
        double cDivisiond = c/d;
        
     
        System.out.println(aSumab);
        System.out.println(aRestab);
        System.out.println(aMultiplicacionb);
        System.out.println(aDivisionb);
        System.out.println(cSumad);
        System.out.println(cRestad);
        System.out.println(cMultiplicaciond);
        System.out.println(cDivisiond);
        
    
        System.out.println("""
                           suma = %d
                           resta = %d
                           multiplicacion = %d
                           division = %d
                           
                           suma double = %.2f
                           resta double = %.2f
                           multiplicacion double = %.2f
                           division double = %.2f
                           """.formatted(aSumab, aRestab, aMultiplicacionb, aDivisionb,
                           cSumad, cRestad, cMultiplicaciond, cDivisiond));
                           
        System.out.println("""
                               a x 3= %d
                               b - 1= %d
                               a / b= %d
                               c + d=%f
                               """.formatted(a*=3, b-1,a/b,c+d));
        
        System.out.println("""
                           valor de i %d
                           valor de i ++%d
                           valor de ++ i %d
                           """.formatted(i,i++,++i));
        
     
        
    }
}
