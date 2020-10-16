package principal;

import java.util.Scanner;

/**
 *
 * @author CES
 */
public class MaximoComunDivisor {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indique el primer número");
        int numeroM = lector.nextInt();
        System.out.println("Indique el segun número");
        int  numeroN = lector.nextInt();
        int mayor, menor;
        if (numeroM > numeroN){
            mayor = numeroM;
            menor = numeroN;
        }else{
            mayor = numeroN;
            menor = numeroM;
        }
        int resto;
        do{
            resto = mayor % menor;
            if (resto==0){
                System.out.println("El MCD es: " + menor);
            }else{
                mayor = menor;
                menor = resto;
            }
        }while (resto!=0);
    }
}
