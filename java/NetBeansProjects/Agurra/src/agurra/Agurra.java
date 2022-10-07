/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agurra;

/**
 *
 * @author agirrezabala.peru
 */
public class Agurra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (args.length < 1) {
            System.out.println("SE NECESITA UN SALUDO...");
            System.exit(1);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + args[0]);
        }
    }
}
