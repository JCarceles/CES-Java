package principal;

import java.util.Scanner;

public class GestionContactos {
    
    public static void main(String[] args) {
        //Leoi el nombre del contacto que voy a crear
        Scanner lector = new Scanner(System.in);
        System.out.println("Indique el nombre del contacto:");
        String n = lector.nextLine();
        System.out.println("Indique los apellidos del contacto:");
        String a = lector.nextLine();
        System.out.println("Indique la edad del contacto:");
        int e = lector.nextInt();
                lector.nextLine();
        System.out.println("Indique el email del contacto:");
        String em = lector.nextLine();
        System.out.println("Indique el telefono del contacto:");
        String t = lector.nextLine();               
        //Creo un contacto y le doy su nombre
        Contacto contacto1 = new Contacto(n,a,e,em,t);
        contacto1.imprimeDatos();
        //Creo otro contacto y le doy su nombre
        Contacto contacto2 = new Contacto();
        contacto2.setNombre("Juana");
        contacto2.imprimeDatos();
    }
    
}
