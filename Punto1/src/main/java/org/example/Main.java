package org.example;

import clases.Empleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Empleado empleado= new Empleado();
        Scanner lea=new Scanner (System.in);
        System.out.println("digite el nombre del empleado: ");
        empleado.setNombre(lea.nextLine());
        System.out.println("Digite la identificacion del empleado: ");
        empleado.setIdentificacion(lea.nextLine());
        empleado.calcularComision();
        empleado.calcularSalario();
        System.out.println("el nombre del empleado es: " +empleado.getNombre());
        System.out.println("la identificacion del empleado es : "+ empleado.getIdentificacion());
        System.out.println("la deduccion es : $" +empleado.getDeducciones());
        System.out.println("numero de ventas : "+ empleado.getNumeroDeVentas());
        System.out.println("la comision  es de : $"+empleado.getComision());
        System.out.println("el salario neto es de : $"+empleado.getSalarioNeto());



    }
}