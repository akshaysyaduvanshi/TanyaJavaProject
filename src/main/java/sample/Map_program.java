package sample;
import java.util.*;
public class Map_program {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "One");
        map.put(5, "Five");
        map.put(2, "Two");
        map.put(6, "Six");
        Set set = map.entrySet();
        Iterator itr = set.iterator();
        System.out.print("Map is                          ");
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.print(entry.getKey() + "-" + entry.getValue()+"   ");
        }
        System.out.println();
        System.out.println("size of map is                  "+map.size());
        System.out.println("Does map contains 3 as key      "+map.containsKey(3));
        System.out.println("Does map contains 3 as value    "+map.containsValue(3));
        System.out.println("Does map contains 2 as key      "+map.containsKey(2));
        map.remove(2);
        System.out.println("After removing 2 from map       "+map);
        map.putIfAbsent(2,"Two");
        System.out.println("After adding 2 in map           "+map);
    }
}
