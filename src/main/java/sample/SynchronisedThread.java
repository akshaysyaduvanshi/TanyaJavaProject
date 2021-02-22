package sample;
import java.util.*;
class Counter extends Thread {
    int count=0;
    public synchronized void run() {
        int max = 100000000;
        for (int i = 0; i < max; i++)
            count++;
    }
}
public class SynchronisedThread {
    public static void main(String[]args) throws Exception{
        Counter c = new Counter();
        Thread t1 = new Thread (c,"First");
        Thread t2 = new Thread (c,"Second");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("counter value is "+c.count);
        }
}
