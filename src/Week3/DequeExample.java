package Week3;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * All work is created by Matt Sievers on 04-13-2020 for use in CST-201
 * Code Example was taken from GeeksforGeeks
 * GeeksforGeeks (n.d.) Deque Interface in Java with Example.  Retrieved from: https://www.geeksforgeeks.org/deque-interface-java-example/
 * Code was rewritten line by line so i understood how and what was happening, not simply copied.
 */
public class DequeExample {

  public static void main(String[] args) {
    Deque<String> deque = new LinkedList<>();

    deque.add("Element 1"); //adds to the tail, insertion is always completed at the tail
    deque.addFirst("Element 2"); //adds at the head, E1 is now in second place
    deque.addLast("Element 3");  //adds to the tail, E1 is not between E2 and E3
    deque.push("Element 4"); //adds to the front of the head, E4 is now before E2
    deque.offer("Element 5"); //add to the tail, E5 is now after E3
    deque.offerFirst("Element 6");  //Adds to head, E6 is now before E4
    deque.offerLast("Element 7");  //adds to the tail, E7 now follows E5

    System.out.println(deque + "\n");

    System.out.println("Standard Iterator");
    Iterator iterator = deque.iterator();
    while (iterator.hasNext()){
      System.out.println("\t" + iterator.next());
    }
  }

}
