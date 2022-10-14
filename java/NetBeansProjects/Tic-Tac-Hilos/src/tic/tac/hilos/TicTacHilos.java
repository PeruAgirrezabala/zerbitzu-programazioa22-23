/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tic.tac.hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agirrezabala.peru
 */
public class TicTacHilos extends Thread {

    public String tictac;
    
    public TicTacHilos(String tictac){
        this.tictac=tictac;
    }
    public String getTictac(){
        return tictac;
    }
    @Override
    public void run(){
        while(true){
            System.out.println(getTictac());
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(TicTacHilos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TicTacHilos tic = new TicTacHilos("tic");
        TicTacHilos tac = new TicTacHilos("tac");
        tic.start();
        tac.start();
    }
    
}
