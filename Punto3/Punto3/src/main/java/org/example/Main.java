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


        System.out.println("Digite el nombre del libro ");
        libro.setNombre(entradaPorTeclado.next());


        System.out.println("digita el codigo del libro ");
        libro.setCodigo(entradaPorTeclado.next());



        libro.setAutor("carlos");





        System.out.println("el nombre del libro es : "+libro.getNombre());
        System.out.println("el codgio de tu libro es : "+libro.getCodigo());
        System.out.println("el autor del libro es :"+libro.getAutor());
        System.out.println("numero de ejemplares: "+libro.getNumeroEjemplares());


    }
}