package sample;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

class Atomic extends Thread{
    AtomicInteger count;
    Atomic(){
        count = new AtomicInteger();
    }
    public void run(){
        int max=100000000;
        for(int i=0;i<max;i++)
            count.addAndGet(1);
    }
}
public class AtomicVariableJava {
    public static void main(String[] args) throws Exception{
        Atomic ob = new Atomic();
        Thread t1 = new Thread(ob,"First");
        Thread t2 = new Thread(ob,"Second");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("counter value is "+ob.count);
    }
}
