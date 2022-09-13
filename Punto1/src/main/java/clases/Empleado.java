package clases;

import java.util.Scanner;

public class Empleado {


    private String nombre;
    private  String identificacion;
    private int numeroDeVentas;
    private double comision;
    private final int SALARIOMENSUAL= 3500000;
    private double deducciones;

    private double salarioNeto;

    public Empleado() {
    }

    public Empleado(String nombre, String identificacion, int numeroDeVentas, double comision, double deducciones, double salarioNeto) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.numeroDeVentas = numeroDeVentas;
        this.comision = comision;
        this.deducciones = deducciones;
        this.salarioNeto = salarioNeto;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getNumeroDeVentas() {
        return numeroDeVentas;
    }

    public void setNumeroDeVentas(int numeroDeVentas) {
        this.numeroDeVentas = numeroDeVentas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public int getSALARIOMENSUAL() {
        return SALARIOMENSUAL;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    public double calcularComision(){
        Scanner lea= new Scanner(System.in);
        System.out.println("Digite las deducciones del empleado: ");
        this.deducciones=lea.nextDouble();
        System.out.println("Digite la cantidad de ventas: ");
        this.numeroDeVentas=lea.nextInt();

        if (this.numeroDeVentas>0){

            return  this.comision=this.numeroDeVentas*(1500000 - (this.deducciones*0.5));


        } else{
            return this.comision=0;
        }




    }


    public double calcularSalario(){


       return this.salarioNeto= this.SALARIOMENSUAL+this.comision-this.deducciones;



    }
}
