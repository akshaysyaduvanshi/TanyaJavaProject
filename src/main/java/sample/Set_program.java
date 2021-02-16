package sample;
import java.util.*;
public class Set_program {
    public static void main(String[] args) {
        Integer count[] = {34,22,10,60,30,22};
        Set<Integer> set = new HashSet<Integer>();
        try {
            for(int i = 0; i < 5; i++)
                set.add(count[i]);
            System.out.println("Original set is                  "+set);

            TreeSet sortedSet = new TreeSet<Integer>(set);
            System.out.println("The sorted list is:              "+sortedSet);
            System.out.println("The First element of the set is: "+(Integer)sortedSet.first());
            System.out.println("The last element of the set is:  "+ (Integer)sortedSet.last());
            System.out.println("Is element 3 present in set      "+set.contains(3));
            System.out.println("Is set empty                     "+set.isEmpty());
            System.out.println("The size of set is               "+set.size());
            set.remove(60);
            System.out.println("After removing 60 from set       "+set);
            set.clear();
            System.out.println(set);
    }
      catch(Exception e)
      {}
}
}
