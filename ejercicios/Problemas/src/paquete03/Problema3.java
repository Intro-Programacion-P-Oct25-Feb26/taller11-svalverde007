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
        
        String reporte = "";
        int opcion;

        System.out.println("Seleccione una opcion \n1. Area del cuadrado "
                + "\n2. Area del triangulo \n3. Area de un rectangulo");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            obtenerAreaCuadrado();
        }else{
            (opcion == 2){
            
        }
        }

    }

}
