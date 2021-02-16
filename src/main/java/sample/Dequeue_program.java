package sample;
import java.util.*;
public class Dequeue_program {
    public static void main(String[] args) {
        Deque<Integer>dq=new ArrayDeque<>();
        for(int i=0;i<5;i++)
            dq.add(i);
        System.out.println("Original deque is                             "+dq);
        dq.addFirst(-1);
        System.out.println("After adding element at front ,then deque is  "+dq);
        dq.addLast(5);
        System.out.println("After adding element at end ,then deque is    "+dq);
        System.out.println(dq.pop());
        System.out.println("After using pop method, deque is              "+dq);
        System.out.println(dq.pollFirst());
        System.out.println("After using pollFirst method, deque is        "+dq);
        System.out.println(dq.pollLast());
        System.out.println("After using pollLast method, deque is         "+dq);
        System.out.println("Whether dequeue contains 0                    "+dq.contains(0));
        System.out.println("Size of dequeue is                            "+dq.size());

    }
}
