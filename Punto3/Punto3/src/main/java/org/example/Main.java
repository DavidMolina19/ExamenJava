package org.example;

import clases.Libro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //crear un objeto para escribir por teclado

        Scanner entradaPorTeclado=  new Scanner(System.in);



        // crear un objeto libro
        Libro libro = new Libro();

        // agregar una cantidad de libros






        System.out.println("digite el numero de ejemplares ");
        libro.setNumeroEjemplares(entradaPorTeclado.nextInt());
        System.out.println(libro.getNumeroEjemplares());

        System.out.println("Digite el nombre del libro ");
        libro.setNombre(entradaPorTeclado.nextLine());
        System.out.println(libro.getNombre());

        System.out.println("digita el codigo del libro ");
        libro.setCodigo(entradaPorTeclado.nextLine());

        System.out.println("el auto del libro es: ");
        libro.setAutor("carlos");
        System.out.println(libro.getAutor());







    }
}