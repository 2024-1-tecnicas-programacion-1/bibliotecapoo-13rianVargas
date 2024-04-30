package com.mycompany.bibliotecapoo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {//Complejidad Temporal: Tiempo constante O(1)
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige tu opción:");
        System.out.println("(1) Ingresar libro");
        System.out.println("(2) Mostrar todos los libros");
        System.out.println("(3) Buscar libro");
        System.out.println("(4) Mostrar libros leidos:");
        System.out.println("(5) Mostrar libros no leidos:");

        String menu = sc.nextLine();

        switch (menu){
            case "1":
                Libro libro = new Libro(String title, String autor, int anio, String gender);
                break;

            case "2":
                Biblioteca.mostrarLibros();
                break;

            case "3":
                System.out.println("Ingrese su palabra de busqueda:");
                String word = sc.nextLine();
                Biblioteca.buscarLibro(word);
                break;

            case "4":
                Biblioteca.mostrarLibros();
                break;

            case "5":
                Biblioteca.mostrarLibrosNoLeidos();
                break;

            default:
                System.out.println("No ingresó una opción.");
                break;
        }//cierra switch

        System.out.println("Ingrese el título:");
        String title = sc.nextLine();
        System.out.println("Ingrese el autor:");
        String autor = sc.nextLine();
        System.out.println("Ingrese el género:");
        String gender = sc.nextLine();
        System.out.println("Ingrese el año de publicación:");
        int anio = sc.nextInt();

        sc.close();
    }//cierra el main
}//close class
