package com.mycompany.bibliotecapoo;

import java.util.LinkedList;

public class Biblioteca {
    private LinkedList<Libro> libros;

    public Biblioteca(){
        this.libros = new LinkedList<>();
    }//cierra Biblioteca
    
    public void registrarLibro(Libro nuevoLibro){
        libros.add(nuevoLibro);
    }//cierra registrarLibro

    public void buscarLibro(String palabraBusqueda){
        for (Libro libro : libros) {
            if(libros.contains(palabraBusqueda)){
                mostrarLibros();
            }else{
                System.out.println("No existe el libro en la Biblioteca.");
            }//cierra if
        }//cierra for
    }//cierra buscarLibros

    public void mostrarLibros(){
        
    }//cierra mostrarLibros

    public void mostrarLibrosNoLeidos(){

    }//cierra mostrarLibrosNoLeidos
}
