/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_enlazada;

import java.util.Scanner;

/**
 *
 * @author Zonia Roldan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static Lista lista = new Lista();
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu (){
        int eleccion;
        boolean exit = false;
        
        while (!exit){
        System.out.println("\n\nSelect a option, please");
        System.out.println("1. Agregar");
        System.out.println("2. Mostrar lista");
        System.out.println("3. Salir");
        eleccion = sc.nextInt();
        switch (eleccion){
            case 1: agregar();
                    break;
            case 2: lista.mostrar_lista();
                    break;
            case 3: exit = true;
        }
        }
    }
    
    public static void agregar(){
        char elemento=0;
        System.out.println("Escriba que quiere agregar");
        elemento = sc.next().charAt(elemento);
        lista.agregar_inicio(elemento);
    }
    
}
