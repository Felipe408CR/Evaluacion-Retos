package clases;

import java.util.Scanner;

public class Biblioteca {

    private String nombreLibro;
    private String codigo;
    private int numeroPaginas;
    private int numeroEjemplares;
    private String autor;

    public Biblioteca() {
    }

    public Biblioteca(String nombreLibro, String codigo, int numeroPaginas, int numeroEjemplares, String autor) {
        this.nombreLibro = nombreLibro;
        this.codigo = codigo;
        this.numeroPaginas = numeroPaginas;
        this.numeroEjemplares = numeroEjemplares;
        this.autor = autor;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
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

    public int ingresar(){

        Scanner leaTeclado= new Scanner(System.in);

        System.out.println("Ingrese nombre del libro: ");
        this.nombreLibro=leaTeclado.nextLine();

        System.out.println("Ingresar codigo del libro: ");
        this.codigo=leaTeclado.nextLine();

        System.out.println("Ingrese el numero de paginas: ");
        this.numeroPaginas=leaTeclado.nextInt();


        System.out.println("Ingrese el numero de ejemplares: ");
        this.numeroEjemplares=leaTeclado.nextInt();

        System.out.println("Ingrese el autor: ");
        this.autor=leaTeclado.next();

        return 0;

    }



}
