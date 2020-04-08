package Week2;

import java.util.ArrayList;
import java.util.List;

/**
 * All work is created by Matt Sievers on 04-07-2020 for use in CST-201
 */
public class Assignment1Driver {

  public static void main(String[] args) {
    SinglyLinkedList<String> myList = new SinglyLinkedList();
    SinglyLinkedList<String> secondList = new SinglyLinkedList();

    //check if list is empty
    System.out.println("Is myList empty? " + myList.isEmpty());

    //inserting new data into list
    myList.insert("foo");
    myList.insert("bar");
    myList.insert("matt");

    //create a second list for merging


    //check to see if the list is now empty
    System.out.println("Is myList empty post insertion? " + myList.isEmpty());

    //reverse the order of the list
    myList.reverse();

    //check size of the list
    System.out.println("Size of newly created list is: " + myList.size());

    System.out.println("Head node.next " + myList.frontNode().next);
    System.out.println("Tail node.next " + myList.tailNode().next);
    System.out.println("Tail node.previous " + myList.tailNode().previous);

    System.out.println("Head " + myList.front());
    System.out.println("Tail " + myList.back());

    //remove head and replace with next
    myList.pop_front();
    System.out.println("New Head post pop_front() " + myList.front());
    //check size after removing head
    System.out.println("New size post pop_front() " + myList.size());
    //remove tail and replace with previous
    myList.pop_back();
    System.out.println("New Tail post pop_back() " + myList.back());
    //check size after removing tail
    System.out.println("New size post pop_back() " + myList.size());

    //merge myList and secondList
    SinglyLinkedList copiedList = new SinglyLinkedList(myList);
    copiedList.insert("stuff");
    copiedList.insert("and");
    copiedList.insert("things");
    System.out.println(copiedList.front() + " " + copiedList.back());

  }
}

