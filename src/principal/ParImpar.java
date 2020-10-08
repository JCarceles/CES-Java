/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author fcoja
 */
public class ParImpar {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);
        System.out.println("Indique el número: ");
        int numero = lector.nextInt();
        
        if (numero % 2 == 0){
            System.out.println("El número " + numero + " es par");
        }else {
            System.out.println("El número " + numero + " es impar");
        }
        
    }
    
}
