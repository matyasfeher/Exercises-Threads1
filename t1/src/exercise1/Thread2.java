/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class Thread2 extends Thread{

    int count;

    @Override
    public void run() {
        while(count < 6){
            try {
                System.out.println("t2: " + count );
                Thread.sleep(2000);
                count++;
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }

}
