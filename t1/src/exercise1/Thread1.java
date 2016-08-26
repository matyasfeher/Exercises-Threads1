package exercise1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class Thread1 extends Thread {

    long num1;
    long sum;

    @Override
    public void run() {
        while (true) {
            sum += num1;
            num1++;

            if (num1 == 1000000000) {
                System.out.println("t1: " + sum);
                break;
            }
        }

    }

}
