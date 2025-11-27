package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        //Paso 1 simular cliente para pedir datos
        Scanner leer = new Scanner(System.in);
        System.out.print("Digita el nombre del empleado: ");
        String nombres = leer.nextLine();

        System.out.print("Digite el documento del empleado: ");
        String documento = leer.nextLine();

        System.out.print("Digite la direccion del empleado: ");
        String direccion = leer.nextLine();

        System.out.print("Digite el correo del empleado: ");
        String correo = leer.nextLine();

        System.out.print("Digite el numero de la cuenta del empleado: ");
        String cuenta = leer.nextLine();

        System.out.print("Digite el salario del empleado: ");
        Double salarioMensual = leer.nextDouble();

        System.out.print("Valor hora extra: ");
        Double valorHorasExtra = leer.nextDouble();

        System.out.print("Cantidad horas extra: ");
        Integer cantidadHorasExtra = leer.nextInt();

        //LLAMANDO A LAS FUNCIONES

        //LLAMANDO A CALCULAR CESANTIAS

        Double cesantias=calcularCesantias(salarioMensual,360);

        //LLAMANDO A CALCULAR INTERESES DE LAS CESANTIAS

        Double interesesCesantias=calcularInteresesCesantias(salarioMensual);
        

        Double primaServicios=calcularPrimaServicios(salarioMensual,360);


        Double vacaciones=calcularVacaciones(salarioMensual);

        //SALIDA

        System.out.println("Cesantias: $" +cesantias);
        System.out.println("Intereses Cesantias :$" +interesesCesantias);
        System.out.println("Prima De Servicios: $" +primaServicios);
        System.out.println("Vacaciones: $" + vacaciones);

        Double totalLiquidacion=cesantias+interesesCesantias+primaServicios+vacaciones;
        System.out.println("\nTotal: "+totalLiquidacion);

    }

    //Fabrica de funciones, fuera del main

    public static Double calcularCesantias(Double salarioMensual, Integer diasTrabajados){
        Double cesantias = salarioMensual * (diasTrabajados / 360);
        return cesantias;
    }

    public static Double calcularInteresesCesantias(Double salarioMensual) {
        Double intereses=salarioMensual*0.12;
        return intereses;

    }

    public static Double calcularPrimaServicios(Double salarioMensual, Integer diasTrabajados) {
        Double primaServicios = salarioMensual * (diasTrabajados / 360);
        return primaServicios;
    }

    public static Double calcularVacaciones(Double salarioMensual){
        Double vacaciones = salarioMensual * 0.5;
        return vacaciones;

    }
}
