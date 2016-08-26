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
public class DepositTask implements Runnable {

    private ReentrantLock lock = new ReentrantLock();
    BankAccountUnsynchronized acc;

    public DepositTask(BankAccountUnsynchronized a) {
        acc = a;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            for (int i = 1; i < 30; i++) {
                acc.deposit(100);
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
        } finally {
            lock.unlock();
        }
    }
}
