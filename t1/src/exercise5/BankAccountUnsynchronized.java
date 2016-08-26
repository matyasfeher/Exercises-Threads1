package exercise5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// NOT THREADSAFE
public class BankAccountUnsynchronized {

  private double balance;
  private final Lock lock = new ReentrantLock();

  public BankAccountUnsynchronized() {
    balance = 0;
    // The same Thread can get the incremented or decreased amount right before the other one
    // The closing balance should be 0, but due to unsynchronization it might not be
  }

  public synchronized void deposit(double amount) {
//    double newBalance = balance + amount;
//    balance = newBalance;  
    balance += amount;
   }

  public synchronized void withdraw(double amount) {
//    double newBalance = balance - amount;
//    balance = newBalance;
     balance -= amount;
   }

  public double getBalance() {
    return balance;
  }
}
