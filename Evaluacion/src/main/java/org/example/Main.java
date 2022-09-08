package org.example;

import clases.Biblioteca;
import clases.Empleado;
import clases.Tienda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Punto 1

        /*System.out.println("Punto 1");

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

        System.out.println("El precio total de la compra es: " + total);*/

        // Punto 3

        System.out.println("Punto 3");

        Biblioteca alejandria= new Biblioteca();

        Scanner lea= new Scanner(System.in);

        int observador = 100;

        System.out.println("*****MENU*****");
        System.out.println("1. Ingresar libro");
        System.out.println("2. Consultar libro");
        System.out.println("3. Modificar ejemplar de un libro");
        System.out.println("4. Salir");

            while (observador!=4){

                System.out.println("Digite una opcion: ");
                observador=lea.nextInt();

                if (observador==1){

                    alejandria.ingresar();

                }else if (observador==2){



                }else if (observador==3){



                }else if (observador==4){

                    System.out.println("Salir");
                    break;

                }else{

                    System.out.println("Opcion invalida");

                }


            }

    }
}