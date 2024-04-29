package com.mycompany.bibliotecapoo;

import java.time.LocalDate;

public class Libro {
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private String genero;
    private boolean leido;

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
    
    public String getTitulo(){//Complejidad Temporal: Tiempo constante O(1)
        return titulo;
    }//cierra getTitulo

    public String getAutor(){//Complejidad Temporal: Tiempo constante O(1)
        return autor;
    }//cierra getAutor

    public int getAnoPublicacion(){//Complejidad Temporal: Tiempo constante O(1)
        return anoPublicacion;
    }//cierra getAnoPublicacion

    public String getGenero(){//Complejidad Temporal: Tiempo constante O(1)
        return genero;
    }//cierra getGenero

    public boolean getLeido(){//Complejidad Temporal: Tiempo constante O(1)
        return leido;
    }//cierra getLeido

}//cierra class