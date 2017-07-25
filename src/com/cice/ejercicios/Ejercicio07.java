//1º mostar el menu
//2º solicitar al usuario que elija una opcion. Si es 6 debemos salir de la ejecución.
//3º ejecutar la opcion elegida
//4º volver a mostar el menu... repetir n veces siempre que la opcion 6 no sea la elegida
package com.cice.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Formador
 */
public class Ejercicio07 {

    //variables de la clase
    static ArrayList<Double> precios = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int opcion = 0;
    
    public static void main(String... args) {

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            opcionElegida(opcion);
        } while (opcion != 6);

    }

    private static void mostrarMenu() {
        System.out.println("Menu de aplicación Ejercicio 07 ========");
        System.out.println("========================================");
        System.out.println("");
        System.out.println("1.- Nuevo precio");
        System.out.println("2.- Precio máximo");
        System.out.println("3.- Precio mínimo");
        System.out.println("4.- Precio Medio");
        System.out.println("5.- Mostrar precios");
        System.out.println("6.- Salir");
        System.out.println("");
        System.out.println("========================================");

        System.out.print("Tu opción es: ");
    }

    private static void opcionElegida(int opcion) {
        switch (opcion) {
            case 1:
                System.out.print("Introduce el nuevo precio: ");
                addPrecio(sc.nextDouble());
                break;
            case 2:
                System.out.println("El precio máximo almacenado es: " + calcularMaximo());
                break;
            case 3:
                System.out.println("El precio mínimo almacenado es: " + calcularMinimo());
                break;
            case 4:
                System.out.println("El precio medio es: " + calcularPrecioMedio());
                break;
            case 5:
                System.out.println("Lista: " + precios.toString());
                break;
            case 6:
                System.out.println("Hasta la próxima");
                break;
            default:
                System.out.println("Opcion no valida...");

        }
    }

    private static boolean addPrecio(double precio) {
        boolean resultado;

        resultado = precios.add(precio);

        return resultado;
    }

    private static double calcularMaximo() {
        double maximo = 0;

        for (Double precio : precios) {
            maximo = Math.max(maximo, precio);
        }

        return maximo;
    }

    private static double calcularMinimo() {
        double minimo = Double.MAX_VALUE;

        for (Double precio : precios) {
            minimo = Math.min(minimo, precio);
        }

        return minimo;
    }

    private static double calcularPrecioMedio() {
        double precioMedio = 0;

        for (Double precio : precios) {
            precioMedio += precio;
        }

        return precioMedio / precios.size();
    }

}
