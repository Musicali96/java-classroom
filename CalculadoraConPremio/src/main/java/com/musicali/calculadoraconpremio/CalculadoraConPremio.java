/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.musicali.calculadoraconpremio;

import java.util.Scanner;

/**
 *
 * @author Alicia
 */
public class CalculadoraConPremio {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Introduce un operador entero 1: ");
        int op1 = s.nextInt();

        System.out.println("Introduce un operador entero 2: ");
        int op2 = s.nextInt();

        int res = op1 + op2;
        System.out.println("Resultado: " + res);

        if (res % 10 == 5 && res != 15) {
            System.out.println("Va con premio.");
        } else {
            System.out.println("Sin premio.");
        }
    }
}
