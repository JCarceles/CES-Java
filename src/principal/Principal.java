package principal;

import java.util.Scanner;
import poligonos.Circulo;

public class Principal {

    public static void main(String[] args) {
        //Variable de tipo Circulo que sirve para almacenar un objeto
        // de tipo Circulo y poder preguntarle pos su área y su perímetro
        Circulo circulo = null;
        //Opción sirve para saber la opción del menu que ha elegido el usuario
        int opcion = 0;
        do {
            //Relleno la opción llamando al método que solicita una opción
            // al usuario.
            opcion = menu();
            switch (opcion) {

                case 1:
                    circulo = crearCirculo();
                    break;

                case 2: {
                    if (circulo != null) {
                        System.out.println("El área es: " + circulo.getArea());
                    } else {
                        System.out.println("No hay círculo creado");
                    }
                    break;
                }

                case 3:
                    if (circulo != null) {
                        System.out.println("El perímetro es: " + circulo.getPerimetro());
                    } else {
                        System.out.println("No hay círculo creado");
                    }
                    break;

            }
        } while (true);

    }

    static Circulo crearCirculo() {
        Scanner lector = new Scanner(System.in);
        double radio;
        do {
            System.out.println("Indique el radio del círculo");
            radio = lector.nextDouble();

        } while (radio < 1);
        // Cuando tengo el radio genero o instacio un objeto Circulo
        // para devolverselo a quien me ha llamado
        Circulo circulo = new Circulo(radio);
        return circulo;
    }

    static int menu() {
        Scanner lector = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1 Crear círculo");
            System.out.println("2 Ver el área");
            System.out.println("3 Ver el perimetro");
            System.out.println("4 Salir");
            opcion = lector.nextInt();
            lector.nextLine();
        } while (opcion < 1 || opcion > 4);
        lector = null;
        return opcion;
    }

}
