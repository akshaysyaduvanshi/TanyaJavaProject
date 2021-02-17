package sample;
import java.util.*;
public class TryCatchFinally {
    public static void main(String[] args) {
        Integer a,b;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            Integer c=a/b;
            System.out.println("On division output is "+c);
        }
        catch (Exception e)
        {
            System.out.println("Can't divide number by zero");
        }
        try
        {
            Integer arr[]= {1,2,3};
            System.out.println(arr[10]);
        }
        catch(Exception e)
        {
            System.out.println("Index is out of range");
        }
        finally
        {
            System.out.println("Finally block is executed");
        }

    }
}
