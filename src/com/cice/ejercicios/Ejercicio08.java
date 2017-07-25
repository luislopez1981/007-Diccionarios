package com.cice.ejercicios;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Ejercicio08 {

    private static Scanner sc = new Scanner(System.in);
    private static Hashtable<Integer, String> listaContactos = new Hashtable<>();
    private static int opcionElegida = 0;

    public static void main(String[] args) {
        mostrarMenu();
    }

    private static void mostrarMenu() {
        do {
            System.out.println("========= EJERCICIO 08 =========");
            System.out.println("================================");
            System.out.println("");
            System.out.println("1. Añadir un contacto");
            System.out.println("2. Eliminar un contacto");
            System.out.println("3. Mostrar los contactos");
            System.out.println("4. Salir");
            System.out.println("");
            System.out.print("Elije una opción: ");
            opcionElegida = sc.nextInt();
            System.out.println("================================");
            logicaAplicacion();
        } while (opcionElegida != 4);

    }

    private static void logicaAplicacion() {
        switch (opcionElegida) {
            case 1:
                addContacto();
                break;
            case 2:
                eliminarContacto();
                break;
            case 3:
                mostrarContactos();
                break;
            default:
                System.out.println("Hasta pronto!!");
        }
    }

    private static String eliminarContacto() {
        System.out.print("Introduce el DNI para eliminar el contacto: ");
        String eliminado = "";
        eliminado = listaContactos.remove(sc.nextInt());
        return eliminado;
    }
    
    private static void addContacto() {
        System.out.print("Introduce el DNI: ");
        int clave = sc.nextInt();
        
        System.out.print("Introduce el nombre del contacto: ");
        String nombre = sc.next();
        
        listaContactos.put(clave, nombre);
    }
    
    private static void mostrarContactos() {
        /*
        Enumeration<Integer> claves = listaContactos.keys();
        
        while(claves.hasMoreElements()){
            int clave = claves.nextElement();
            System.out.println(clave + " -> " + listaContactos.get(clave));
        }
        */
        listaContactos.forEach((a, b) -> System.out.println(a + " -> " + b));
    }

}
