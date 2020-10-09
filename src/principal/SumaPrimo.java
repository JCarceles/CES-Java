package principal;

public class SumaPrimo {

    public static void main(String[] args) {
        int suma = 2;
        for (int i = 3; i < 10; i++) {
            if (primo(i)) {
                suma += i;
            }
        }
        System.out.println("La suma es : " + suma);
    }

    static boolean primo(int numero) {
        int divisor = 2;
        boolean primo = true;
        while (divisor < numero && primo) {
            if (numero % divisor == 0) {
                primo = false;
            }
            divisor++;
        }
        return primo;
    }

}
