/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        String cedula;
        int tipo;

        System.out.println("Escoja el tipo de servicio que necesita"
                + "\n1. Calcular la planilla de luz \n2. Calcular el predio urbano");
        tipo = entrada.nextInt();
        entrada.nextLine();

        if (tipo == 1 || tipo == 2) {
            System.out.println("Ingrese su nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su número de cédula");
            cedula = entrada.nextLine();

            if (tipo == 1) {
                calcularValorLuz(nombre, cedula);
            } else {
                if (tipo == 2) {
                    calcularPredio(nombre, cedula);
                }
            }
        } else {
            System.out.println("Opcion Invalida");
        }
    }

    public static void calcularValorLuz(String n, String c) {
        double kilovatio;
        double valorKilovatio;
        double valor;
        System.out.println("Ingrese cuántos kilovatios ha consumido");
        kilovatio = entrada.nextDouble();
        System.out.println("Ingrese el valor por kilovatio");
        valorKilovatio = entrada.nextDouble();

        valor = kilovatio * valorKilovatio;

        System.out.printf("Cliente %s con cédula %s debe cancelar $%.2f\n",
                n, c, valor);
    }

    public static void calcularPredio(String n, String c) {
        double inmueble;
        double porcentaje;
        System.out.println("Ingrese el valor de su inmueble");
        inmueble = entrada.nextDouble();

        porcentaje = inmueble * 0.02;

        System.out.printf("Cliente %s con cédula %s tiene un inmueble valorado "
                + "en $%.2f y tiene que pagar de predio: $%.2f\n",
                n, c, inmueble, porcentaje);
    }
}
