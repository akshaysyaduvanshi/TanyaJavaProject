package sample;
import java.util.*;
public class Lis {
    public static void main(String[] args) {
        List<String> list= new ArrayList<String>(); {
            list.add("Mango");
            list.add("Apple");
            list.add("Pineapple");
            list.add("Kiwi");
            list.add("Orange");
            System.out.println(list);
            Collections.sort(list);
            System.out.println("Sorted list is                   "+list);
            list.remove(2);
            System.out.println("After removing 3rd element       "+list);
            list.set(1,"Mango");
            System.out.println("After setting element at index 1 "+list);
            list.add(0,"Kiwi");
            System.out.println("Adding kiwi at 0 index           "+list);
        }
    }
}
