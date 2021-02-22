package sample;
import java.util.*;
public class JavaThreadUsingInterface implements Runnable{
    public void run()
    {
        System.out.println("Inside run() method");
    }
    public static void main(String[] args) {
        JavaThreadUsingInterface obj =new JavaThreadUsingInterface();
        Thread thread=new Thread(obj);
        thread.start();
        System.out.println("Inside main() method");
    }
}
