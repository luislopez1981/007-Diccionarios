package com.cice.diccionarios;

import java.util.Hashtable;

public class Diccionarios {
    
    public static void main(String[] args){
        
        Hashtable<String,String> diccionario = new Hashtable<>();
        
        String dentroDelCajon = diccionario.put("cajon", "calculadora");
        System.out.println(dentroDelCajon); //null
        
        dentroDelCajon = diccionario.put("cajon", "linterna");
        System.out.println(dentroDelCajon); //calculadora
        
        dentroDelCajon = diccionario.put("cajon", "estuche");
        System.out.println("habia "+ dentroDelCajon);
        System.out.println("hay " + diccionario.get("cajon"));
        
        System.out.println(diccionario.size());
        //diccionario.remove("cajon");
        //System.out.println(diccionario.size());
        System.out.println(diccionario.contains("estuchE".toLowerCase()));
        
        

        //operador ternario
        String mensaje = (1 < 2) ? "hola" : "adios";
        
        if(1 > 2){
            System.out.println(mensaje);
        } else {
            System.out.println(mensaje);
        }
        
        
    }
    
    
}
