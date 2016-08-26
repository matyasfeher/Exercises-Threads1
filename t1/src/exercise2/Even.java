/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author Acer
 */
public class Even extends Thread {

    private int n = 0;
    int i = 0;

//    public int next() {
//        n++;
//        n++;                           // the method returns the even numbers
//        System.out.println("" + n);       the problem is at line 18 & 19 where the 2 running threads can increment "n"
//        return n;                         so one number might occur twice
    
                                         //it's one of the most common concurrency issues 
//
//    }

    public synchronized int next() {
        n++;
        n++;        
        System.out.println(""+n);
        return n;

    }
    @Override
    public void run() {

        while (i < 50) {
            next();
            i++;
        }

    }
}
