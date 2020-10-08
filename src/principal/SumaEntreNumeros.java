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
public class SumaEntreNumeros {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Indique el primer número: ");
        int numero1 = lector.nextInt();
        System.out.println("Indique el segundo número: ");
        int numero2 = lector.nextInt();
        int mayor,menor;
        if (numero1 == numero2){
            System.out.println("No hay números que sumar");
        }else{
            // ordeno los números para ir desde el menor al mayor
            if (numero1<numero2){
                mayor = numero2;
                menor = numero1;
            }else{
                mayor = numero1;
                menor = numero2;
            }
            ////////////////////////////////////////////
            int suma=0;
            int aux = menor+1;
            do{
                suma += aux;
                aux++;
            }while(aux < mayor);
            System.out.println("La suma es: " + suma);
        }
        
        
    }
    
}
