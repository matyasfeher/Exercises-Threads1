/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author jekm
 */
public class WithdrawTask implements Runnable {

    private final ReentrantLock lock = new ReentrantLock();
    BankAccountUnsynchronized acc;

    public WithdrawTask(BankAccountUnsynchronized a) {
        acc = a;
    }

    public void run() {
        lock.lock();
        try {
            for (int i = 1; i < 30; i++) {
                acc.withdraw(100);
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
        } finally {

            lock.unlock();
        }
    }
}
