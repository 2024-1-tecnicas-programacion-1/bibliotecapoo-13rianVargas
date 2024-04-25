package com.mycompany.bibliotecapoo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {//Complejidad Temporal: Tiempo constante O(1)
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el título:");
        String title = sc.nextLine();
        System.out.println("Ingrese el autor:");
        String autor = sc.nextLine();
        System.out.println("Ingrese el género:");
        String gender = sc.nextLine();
        System.out.println("Ingrese el año de publicación:");
        int anio = sc.nextInt();

        Libro libro = new Libro(title, autor, anio, gender);

        libro.marcarLeido();

        System.out.println(libro.mostrarInformacion());

        if (libro.leido == true){
            System.out.println("Ya fue leido.");
        }else{
            System.out.println("No fue leido.");
        }//cierra if
    
        if (libro.esAntiguo() == true){
            System.out.println("El libro es antiguo.");
        }else{
            System.out.println("El libro no es antiguo.");
        }//cierra if

        sc.close();
    }//cierra el main
}//close class
