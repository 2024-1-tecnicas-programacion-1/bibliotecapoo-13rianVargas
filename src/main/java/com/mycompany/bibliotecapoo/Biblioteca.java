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

    public Libro buscarLibro(String palabraBusqueda){
        for (Libro libro : libros) {
            if(libro.getTitulo().equals(palabraBusqueda) || libro.getAutor().equals(palabraBusqueda) || libro.getGenero().equals(palabraBusqueda) || String.valueOf(libro.getAnoPublicacion()).equals(palabraBusqueda)){
                return libro;
            }//cierra if
        }//cierra for
        return null;
    }//cierra buscarLibros

    public void mostrarLibros(){
        for (Libro libro : libros) {
            System.out.println(libro);
        }//cierra for
    }//cierra mostrarLibros

    public void mostrarLibrosNoLeidos(){
        for (Libro libro : libros) {
            if(Boolean.valueOf(libro.getLeido()).equals(false)){
                System.out.println(libro);
            }//cierra for
        }//cierra for
    }//cierra mostrarLibrosNoLeidos
    
}//cierra class
