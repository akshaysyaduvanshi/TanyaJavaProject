package sample;
import java.util.*;
public class GenericMethod {
        public static < E > void printArray(E[] elements) {
            for ( E element : elements){
                System.out.print(element+" " );
            }
            System.out.println();
        }
        public static void main( String args[] ) {
            Integer[] intArray = { 10, 20, 30, 40, 50 };
            Character[] charArray = { 'G', 'E', 'N', 'E', 'R','I','C'};
            System.out.println( "Printing Integer Array" );
            printArray( intArray  );
            System.out.println( "Printing Character Array" );
            printArray( charArray );
        }
    }
