/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author fcoja
 */
public class PulgadasPies {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Indique el número en centímetros: ");
        double centimetros = lector.nextDouble();
        double pulgadas = centimetros / 2.54;
        double pies = pulgadas /12;
        DecimalFormat dec = new DecimalFormat("0.00");
        
        System.out.println(
                "La medida de "+ dec.format(centimetros) 
              + " centímetros es igual a " + dec.format(pulgadas) 
              + " en pulgadas y " + dec.format(pies) + " en pies");
    }

}
