package clases;

import java.util.Scanner;

public class Biblioteca {

   private String nombre;
   private String codigo;
   private int numeroPagina;
   private int numeroEjemplares;
   private String autor;

    public Biblioteca() {
    }

    public Biblioteca(String nombre, String codigo, int numeroPagina, int numeroEjemplares, String autor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.numeroPagina = numeroPagina;
        this.numeroEjemplares = numeroEjemplares;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }



}