/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tictacurko;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agirrezabala.peru
 */
public class TicTacUrko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            // TODO code application logic here
            
        HariaTicTac hTIC= new HariaTicTac(1);
        HariaTicTac hTAC= new HariaTicTac(0);
            
        hTIC.start();
        hTAC.start();
        try
        {    
            hTIC.join();
            hTAC.join();
        } 
        catch (InterruptedException ex) 
        {
            Logger.getLogger(TicTacUrko.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
