/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Scanner;

/**
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("Seleccione una opcion \n1. Area del cuadrado "
                + "\n2. Area del triangulo \n3. Area de un rectangulo");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            obtenerAreaCuadrado();
        } else {
            if (opcion == 2) {
                obtenerAreaTriangulo();
            } else {
                if (opcion == 3) {
                    obtenerAreaRectangulo();
                } else {
                    System.out.println("Opcion Invalida");
                }
            }
        }
    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double lado;
        double area;
       

        System.out.println("Ingrese el valor del lado del cuadrado");
        lado = entrada.nextDouble();

        area = lado * lado;
        System.out.printf("El area del cuadrado es: " + area);

    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;

        System.out.println("Ingrese el valor de la base del triangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura del triangulo");
        altura = entrada.nextDouble();

        area = (base * altura) / 2;
        System.out.printf("El area del triangulo de base: " + base + "y altura: " + altura
                + "es: " + area);

    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;

        System.out.println("Ingrese el valor de la base del rectangulo");
        base = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura del rectangulo");
        altura = entrada.nextDouble();

        area = base * altura;

        System.out.printf("El area del cuadrado es: ", area);

    }
}
