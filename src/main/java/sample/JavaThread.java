package sample;
import java.util.*;
public class JavaThread extends Thread{
    public void run()
    {
        System.out.println("inside run() method.");
    }
    public static void main(String[] args) {
        JavaThread thread=new JavaThread();
        thread.start();
        System.out.println("inside main() method.");
    }
}
