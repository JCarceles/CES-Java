package principal;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);
        System.out.println("Indique el número: "); 
        int numero = lector.nextInt();
        if (numero >1){
            if (numero == 2){
                System.out.println("El número es primo");
            }else{
                int divisor=2;
                boolean primo = true;
                while (divisor < numero && primo){                    
                    if (numero%divisor==0){
                        primo = false;
                    }
                    divisor++;                
                }
                if (primo){
                    System.out.println("El número "+ numero+ " es primo");
                }else{
                     System.out.println("El número "+ numero+ " no es primo");
                }
            }
        }else{
            System.out.println("EL número no es primo");        
        }
        
    }
           
}
