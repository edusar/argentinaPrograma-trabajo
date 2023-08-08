package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Persona p1 = new Persona("Gaston", "Leitner");
        
        System.out.println("Hola q tal");
        System.out.println("pone tu nombre");
        String name = leer.nextLine();
        System.out.println("pone tu apellido");
        String lastname = leer.nextLine();
        Persona p3 = new Persona(name, lastname);
        
        System.out.println(p3.toString());
    }
       Persona p2 = new Persona("Jose", "Maldonado");
    }
   

