/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author CES
 */
public class NumeroElevado {

    public static void main(String[] args) {
        // Inicializamos las variables
        Scanner lector = new Scanner(System.in);
        int numero, exponente;
        //Pedimos el primer numero
        System.out.println("Indique el número");
        numero = lector.nextInt();
        // Pedimos el exponente hasta que sea mayor que 0
        do {
            System.out.println("Indique el exponente");
            exponente = lector.nextInt();
        } while (exponente <= 0);
        //Usamos un acumulador para las operaciones
        int valor=1;
        // realizamos un bucle tantas vece como exponente
        //cada vez multiplicamos el número por sí mismo
        for (int i = 1; i < exponente+1; i++) {
            valor*=numero;
        }
        System.out.println("El resultado es: " + valor);
    
    }

}
