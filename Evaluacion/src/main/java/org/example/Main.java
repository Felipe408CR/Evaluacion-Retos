package org.example;

import clases.Biblioteca;
import clases.Empleado;
import clases.Tienda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Punto 1

        System.out.println("Punto 1");

        Empleado empleado= new Empleado();
        empleado.setSalario(3500000);
        empleado.setValorComision(1500000);
        empleado.setDeducciones(0.05);

        Scanner entradaPorTeclado = new Scanner(System.in);

        System.out.println("Digite su identificacion: ");
        String identi=entradaPorTeclado.nextLine();
        empleado.setIdentificacion(identi);

        System.out.println("Digite su nombre: ");
        String nombre=entradaPorTeclado.nextLine();
        empleado.setNombre(nombre);

        int salario=empleado.getSalario();
        System.out.println("Salario mensual: " + salario);

        int valorComision= empleado.getValorComision();
        System.out.println("Valor de comision mensual: " + valorComision);

        double deducciones= empleado.getDeducciones();
        System.out.println("Valor deducciones: "+ deducciones);

        System.out.println("Digite su numero de ventas mensuales: ");
        int ventasMensuales=entradaPorTeclado.nextInt();
        empleado.setNumeroVentasMensuales(ventasMensuales);

        double totalSalario= empleado.calcularSalario();
        System.out.println("El salario total de "+ nombre + "es " + totalSalario);


        // Punto 2

        System.out.println("Punto 2");

        Tienda carrefour= new Tienda();

        double total = carrefour.calcularProducto();

        System.out.println("El precio total de la compra es: " + total);

        // Punto 3

        System.out.println("Punto 3");

        // Crear un objeto para escribir por teclado

        Scanner entradaTeclado= new Scanner(System.in);

        // Crear un objeto de tipo libro

        Biblioteca biblioteca = new Biblioteca();

        // Agregar una cantidad de libros

        System.out.println("Digite el nombre del libro: ");
        biblioteca.setNombre(entradaTeclado.nextLine());
        System.out.println(biblioteca.getNombre());

        System.out.println("Digite el codigo del libro: ");
        biblioteca.setCodigo(entradaTeclado.nextLine());
        System.out.println(biblioteca.getCodigo());

        System.out.println("Digite el nombre del autor: ");
        biblioteca.setAutor(entradaTeclado.nextLine());
        System.out.println(biblioteca.getAutor());

        System.out.println("Digite el numero de ejemplares: ");
        biblioteca.setNumeroEjemplares(entradaTeclado.nextInt());
        System.out.println(biblioteca.getNumeroEjemplares());

        System.out.println("Digite un nuevo numero de ejemplares: ");
        biblioteca.setNumeroEjemplares(entradaTeclado.nextInt());
        System.out.println(biblioteca.getNumeroEjemplares());

    }
}