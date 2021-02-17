package sample;
import java.util.*;

public class ThrowThrows {
    static void fun() throws IllegalAccessException
    {
        System.out.println("Use of throws keyword");
    }
    static void checkAge(int age){
        if(age<18)
            throw new ArithmeticException("Age is below 18");
        else
            System.out.println("Age is above 18");
    }
    public static void main(String[] args) {
        try{
            checkAge(20);
            fun();
        }
        catch(IllegalAccessException e) {
            System.out.println("caught in main.");
        }
        checkAge(6);
    }
}
