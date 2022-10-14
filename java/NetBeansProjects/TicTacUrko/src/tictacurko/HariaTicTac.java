/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictacurko;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agirrezabala.peru
 */
public class HariaTicTac extends Thread{
    private int i;
    String mezua="";
    HariaTicTac(int i) 
    {

        if(i==1){
            mezua="TIC";
            
        }else{
            mezua="TAC";
            setName(mezua);
        }
    }
    
    @Override
    public void run()
    {
       while(true){
           System.out.println(mezua);
           try {
               sleep(100);
           } catch (InterruptedException ex) {
               Logger.getLogger(HariaTicTac.class.getName()).log(Level.SEVERE, null, ex);
           }
       } 
    }

    
    
}
