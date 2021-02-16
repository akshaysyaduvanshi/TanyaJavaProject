import java.util.*;
class Main {

  public static void main(String[] args) {
    LinkedList<Integer> list=new LinkedList<>();
    list.add(17);
    list.add(20);
    list.add(76);
    list.add(81);
    list.add(5);
    list.add(100);
    System.out.println("Original list is "+list);
    System.out.println("Last element is "+list.getLast());
    System.out.println("First element is "+list.getFirst());
    System.out.println("Whether list contains 76 "+list.contains(76));
    System.out.println("Whether list contains 86 "+list.contains(86));
    list.remove(4);
    System.out.println("After removing element at 4th position "+list);
    list.set(3,1000);
    System.out.println("After replacing 3rd element with 1000 "+list);
    System.out.println("Size of list "+list.size());
  }
}
