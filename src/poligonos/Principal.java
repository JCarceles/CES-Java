/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligonos;

import java.util.Scanner;

/**
 *
 * @author CES
 */
public class Principal {

    public static void main(String[] args) {
        // leo los datos usando el objeto lector de tipo Scanner
        Scanner lector = new Scanner(System.in);
        System.out.println("Indique el lado 1");
        double lado1 = lector.nextDouble();
        System.out.println("Indique el lado 2");
        double lado2 = lector.nextDouble();
        // Creo un rectángulo dándole los valores de los lados
        Rectangulo miRectangulo = new Rectangulo(lado1, lado2);
        //Uso el objeto miRectangulo para que me calcule su área
        // y su perímetro
        double area = miRectangulo.getArea();
        double perimetro = miRectangulo.getPerimetro();
        //Imprimo los valores
        System.out.println("El área es: " + area);
        System.out.println("El perímetro es: " + perimetro);

        System.out.println("Indique el lado 1");
        double ladoTriangulo1 = lector.nextDouble();
        System.out.println("Indique el lado 2");
        double ladoTriangulo2 = lector.nextDouble();
        System.out.println("Indique el lado 2");
        double ladoTriangulo3 = lector.nextDouble();

        Triangulo miTriangulo = new Triangulo(ladoTriangulo1,
                 ladoTriangulo2,
                 ladoTriangulo3);
        
        System.out.println("El area del triángulo es: " + miTriangulo.getArea());
        System.out.println("El  perímetro del triángulo es: " + miTriangulo.getArea());
    }

}
