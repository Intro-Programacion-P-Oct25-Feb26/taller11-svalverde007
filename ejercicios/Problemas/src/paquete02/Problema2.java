/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema2 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombres[] = obtenerListadoViviendas();
        double obtenerConsumoMensual[][] = obtenerConsumoMensual(nombres);
        double matrizConsumoElectrico [] = matrizConsumoElectrico(obtenerConsumoMensual);
        reporteFinal(nombres , matrizConsumoElectrico);

    }

    public static String[] obtenerListadoViviendas() {

        String v[] = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el numero de vivienda: ");
            v[i] = entrada.nextLine();
        }
        return v;
    }

    public static double[][] obtenerConsumoMensual(String[] casa) {

        double gastoMes;
        double[][] z = new double[10][12];

        for (int i = 0; i < z.length; i++) {
            System.out.printf("Ingrese los gastos de la vivienda %s:\n",
                    casa[i]);

            for (int j = 0; j < z[i].length; j++) {
                System.out.printf("mes %s\n", j +1);
                gastoMes = entrada.nextDouble();
                z[i][j] = gastoMes;
            }
        }
        return z;
    }

    public static double[] matrizConsumoElectrico(double[][] anual) {
        double z[] = new double[10];
        for (int i = 0; i < anual.length; i++) {
            double suma = 0;
            for (int j = 0; j < anual[i].length; j++) {
                suma = suma + anual[i][j];
            }
            z[i] = suma;
        }
        return z;
    }

    public static void reporteFinal(String[] casa, double[] anual) {
        String cadena = "";
        for (int i = 0; i < casa.length; i++) {
            cadena = String.format("%sVivienda %s\nGasto anual: %.2f\n", cadena,
                    casa[i], anual[i]);

        }
        System.out.printf(cadena);

    }

}
