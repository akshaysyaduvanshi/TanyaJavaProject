package sample;
import java.util.*;

class MyThread implements Runnable {
    String name;
    Thread t;

    MyThread(String thread) {
        name = thread;
        t = new Thread(this, name);
        System.out.println("New Thread " + t);
        t.start();
    }
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println(name+" "+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e) {
            System.out.println(name+" Interrupted");
        }
        System.out.println(name+" exiting");
    }
}


public class MultiThreadExample {
    public static void main(String[] args) {
        new MyThread("One");
        new MyThread("Two");
        new MyThread("Three");
        try {
            Thread.sleep(10000);
        }
        catch(InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread Exiting");
    }
}
