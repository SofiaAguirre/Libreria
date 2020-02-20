package main.java.tp5;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Inicializador {
    public static void main (String[] args) {
        Libro libros [] = new Libro[4];
        libros[0] = new Libro("CD1039",2004,"Head First Design Patterns");
        libros[1] = new Libro("CD1040",2003,"Head First Java");
        libros[2] = new Libro("CD1041",2011,"Java a fondo");
        libros[3] = new Libro("CD1042",1998,"Thinking in Java");
        int operacion;
        String caracterIngresado;
        do {
            System.out.println("//Librería Terry y Pampa// Elija la operacion que desea realizar:");
            System.out.println("1-Pedir Libro");
            System.out.println("2-Devolver Libro");
            Scanner entrada = new Scanner (System.in);
            operacion = entrada.nextInt();
            System.out.println("Ingrese el código del libro");
            Scanner entrada1 = new Scanner (System.in);
            String code = entrada1.nextLine();
            if (operacion == 1 ){
                for (int i = 0; i < libros.length; i++){
                    if (libros[i].getCodigo().equals(code)){
                        libros[i].prestar();
                    }
                }
            } else {
                for (int i = 0; i < libros.length; i++){
                    if (libros[i].getCodigo().equals(code)){
                        libros[i].devolver();
                    }
                }
            }
            System.out.println ("Ingrese 's' si desea realizar otra operacion");
            Scanner entrada2 = new Scanner (System.in);
            caracterIngresado = entrada2.nextLine();
        } while (caracterIngresado.equals("s") || caracterIngresado.equals("S"));

        for (int i = 0; i < libros.length; i++){
            System.out.println(libros[i]);
        }
    }

}
