/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosT02daniel;

/**
 *
 * @author Dan_n
 */
public class Ej02 {
    public static void main(String[] args) {
        int a=1, b=2,c=3;
        double d=4.5, e=5.7, f=6.9;
        System.out.print(a+"\t");
        System.out.print(b+"\t");
        System.out.println(c);
        System.out.print(d+"\t");
        System.out.print(e+"\t");
        System.out.println(f);
        
        int g=b;
        b=c;
        c=a;
        a=g;
        
        System.out.print(a+"\t");
        System.out.print(b+"\t");
        System.out.println(c);
        
    }
}
