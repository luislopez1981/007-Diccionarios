/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.ejercicios;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author NYL
 */
public class Ejercicio08mio {
    private static int opcion = 0;
    private static int dni;
    private static String nombre;
    private static Hashtable<Integer,String> contactos = new Hashtable<>();
     
    public static void main (String [] args){
        mostrarMenu();
     }
    
    private static void mostrarMenu (){
        System.out.println("BIENVENIDO AL PROGRAMA DE CONTACTOS");
        System.out.println("===================================");
        
        
         do {
            
            Scanner sc = new Scanner (System.in);
            System.out.println("");
            System.out.println("1) AÑADIR CONTACTO");
            System.out.println("2) ELIMINAR CONTACTO");
            System.out.println("3) MOSTRAR CONTACTOS");
            System.out.println("4) SALIR");
            System.out.println("");
            System.out.print("ELIJA SU OPCIÓN: ");
            opcion = sc.nextInt();
            System.out.println("");
            
            logica();
           
         } while (opcion != 4);
        System.out.println("HASTA PRONTO...");   
        }
    static void logica (){
        Scanner sc = new Scanner (System.in);
        
        switch (opcion) {
                case 1:
                    añadirContacto();
                    break;
                case 2:
                    eliminarContacto();
                    break;
                case 3:
                    mostrarContactos();
                    break;
                case 4:
                   break;    
                default:
                    System.out.println("");
                    System.out.println("OPCION INCORRECTA...");
                    System.out.println("");
            }
        
    }
    static void añadirContacto() {
        Scanner sc = new Scanner (System.in);
        System.out.println("");
        System.out.println("===================");
        System.out.print("Introduzca DNI: ");
        dni = sc.nextInt();
        System.out.println("");
        System.out.print("Introduzca NOMBRE: ");
        nombre = sc.next();
        contactos.put(dni, nombre);
        System.out.println("===================");

    }
    static void eliminarContacto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("===================");
        System.out.print("Introduzca DNI A ELIMINAR: ");
        dni = sc.nextInt();
        contactos.remove(dni);
        System.out.println("===================");
        System.out.println("");
    }
    static void mostrarContactos (){
        Enumeration<Integer> claves = contactos.keys();
        while (claves.hasMoreElements()) {
            int clave = claves.nextElement();
            System.out.println("****");
            System.out.println("DNI: " + clave);
            System.out.println("NOMBRE: " + contactos.get(clave));
            System.out.println("****");
        }
    }
}
