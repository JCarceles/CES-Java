/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

public class SaludoHora {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indique la hora del día");
        int hora = lector.nextInt();
        if (hora >0 && hora <25){
            if(hora >= 6 && hora <=12){
                System.out.println("Buenos días por la mañana");
            }else if (hora >=13 && hora <=20){
                System.out.println("Buenos tarde por la tarde");
            }else{
                System.out.println("Buenos noche por la noche");
            }
        }else{
            System.out.println("Hora no válida");
        }
    }
    
}
