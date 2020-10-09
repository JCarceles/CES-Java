/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

public class SumaImpares {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indique el número");
        int numero = lector.nextInt();
        //Algoritmo que suma entre un mayor y un menor
        //Personalizamos para comenzar por el cero
        int suma = 0;
        int menor,mayor;
        if (numero > 0) {
             menor = 0;
             mayor = numero;
        } else {
             menor = numero;
             mayor = 0;
        }
        int aux = menor + 1;
        do {
            if (aux % 2 != 0) {
                suma += aux;
            }
            aux++;
        } while (aux < mayor);
        System.out.println("La suma es: " + suma);

    }

}
