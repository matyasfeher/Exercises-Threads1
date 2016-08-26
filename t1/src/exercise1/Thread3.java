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
public class Thread3 extends Thread {

    long start = System.currentTimeMillis();
    int count = 10;

    @Override
    public void run() {
        while (true) {
            try {
                if (start + 10000 <= System.currentTimeMillis()) {
                    break;
                }
                System.out.println("t3: " + count);
                Thread.sleep(3000);
                count++;

            } catch (InterruptedException ex) {
                Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
