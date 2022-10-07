/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.unsaludo;

import java.io.IOException;

/**
 *
 * @author agirrezabala.peru
 */
public class UnSaludo {

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.out.println("SE NECESITA UN SALUDO...");
            System.exit(1);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + args[0]);
        }
    }
}//Unsaludo

