package com.mycompany.bibliotecapoo;

import java.time.LocalDate;

public class Libro {
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private String genero;
    boolean leido;

    Libro (String titulo, String autor, int anoPublicacion, String genero){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.genero = genero;
        this.leido = false;
    }//cierra Libro

    public String mostrarInformacion(){//Complejidad Temporal: Tiempo constante O(1)
        return "Título: " + titulo + ", Autor: " + autor + ", Año de publicación: " + anoPublicacion + ", Genero: " + genero;
    }//cierra mostrarInformacion

    public void marcarLeido(){//Complejidad Temporal: Tiempo constante O(1)
        leido = true;
    }//cierra marcarLeido

    public boolean esAntiguo(){//Complejidad Temporal: Tiempo constante O(1)
        return (LocalDate.now().getYear() - anoPublicacion > 50);
    }//cierra esAntiguo
    
}//cierra class
