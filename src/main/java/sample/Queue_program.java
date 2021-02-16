package sample;
import java.util.*;
public class Queue_program {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 10; i < 15; i++)
            q.add(i);
        System.out.println("Original queue  "+ q);
        System.out.println("removed element "+q.remove());
        System.out.println("Updated Queue   "+q);
        System.out.println("head of queue   "+q.peek());
        System.out.println("Size of queue   "+q.size());
    }
}
