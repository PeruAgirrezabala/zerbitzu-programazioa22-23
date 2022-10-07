/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.adibidea3;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author agirrezabala.peru
 */
public class Adibidea3 {

    public static void main(String args[]) {
        // TODO code application logic here
        Runtime r = Runtime.getRuntime();
        String comando = "java -jar UnSaludo.jar Kaixo";
        Process p = null;
        if (args.length < 1) {
            System.out.println("SE NECESITA UN SALUDO...");
            System.exit(1);
        }
        try {
            //fichero al que se enviara la salida del programa Unsaludo
            FileOutputStream fos = new FileOutputStream(args[0]);
            PrintWriter pw = new PrintWriter(fos);
            p = r.exec(comando);
            InputStream is = p.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String linea;
            while ((linea = br.readLine()) != null) {//lee la salida de un saludo
                System.out.println(args[0] + ">" + linea + "-an sartzen dut");
                pw.println(linea);//la inserta en el fichero

            }
            br.close();
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
