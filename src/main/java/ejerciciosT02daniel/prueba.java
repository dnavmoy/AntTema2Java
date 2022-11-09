/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosT02daniel;

import java.util.Scanner;

/**
 *
 * @author Dan_n
 */
public class prueba {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un numero");
        int numero = teclado.nextInt();
        System.out.println(numero);
        teclado.nextLine();
        System.out.println("Dame otro numero");
        int num2= teclado.nextInt();
        
        System.out.println("sale algo?");
    }
}
