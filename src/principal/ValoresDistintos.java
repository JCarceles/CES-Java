package principal;

import java.util.Scanner;

public class ValoresDistintos {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        // declaración de las variables a usar en la recogida datos
        int valor1, valor2, valor3;
        //Inicializo las variables
        System.out.println("Indique el primer valor");
        valor1 = lector.nextInt();
        do {
            System.out.println("Indique el segundo valor");
            valor2 = lector.nextInt();
        } while (valor1==valor2);
        do {
            System.out.println("Indique el tercer valor");
            valor3 = lector.nextInt();
        } while (valor3==valor2 || valor3==valor1);
        
        //Ordenar los tres valores
        int mayor, menor;
        if (valor1 > valor2 && valor1 > valor3){
            mayor = valor1;
            if (valor2>valor3){
                menor = valor3;
            }else{
                menor = valor2;
            }        
        }else if (valor2 >valor1 && valor2 > valor3){
            mayor = valor2;
             if (valor1>valor3){
                menor = valor3;
            }else{
                menor = valor1;
            }
        }else{
            mayor = valor3;
             if (valor1>valor2){
                menor = valor2;
            }else{
                menor = valor1;
            }
        
        }
        System.out.println("El mayor es: "+ mayor
                            + " y el menor es " + menor);
    }
}
