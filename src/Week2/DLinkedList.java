package Week2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * provided file for DLinkedList Assignment
 *
 * @author lkfritz
 */
public class DLinkedList<T extends Comparable<T>> {

  public static void main(String[] args) throws FileNotFoundException {

    DLinkedList<String> lst1 = new DLinkedList<>();
    DLinkedList<String> lst2 = new DLinkedList<>();

    Scanner fin = new Scanner(new File("/Users/ntqams30/Dropbox/GCU Work/CST-201/src/Week2/text1.in"));
    String str;

    while (fin.hasNext()) {
      str = fin.next();
      str = cleanUp(str);
      lst1.insertOrderUnique(str);
    }
    fin.close();

   fin = new Scanner(new File("/Users/ntqams30/Dropbox/GCU Work/CST-201/src/Week2/text2.in"));
   while (fin.hasNext()) {
     str = fin.next();
     str = cleanUp(str);
     lst2.insertOrderUnique(str);
   }

    System.out.println("List 1:  " + lst1);
    System.out.println("List 2:  " + lst2);


    DLinkedList combined = lst1.merge(lst2);

    System.out.println("\nAFTER MERGE");
    System.out.println("List 1:  " + lst1);
    System.out.println("List 2:  " + lst2);
    System.out.println("\n" + combined);
  }

  /**
   * ASSIGNED
   * @param str
   * @return str in all lower case with LEADING and TRAILING non-alpha
   * chars removed
   */
  public static String cleanUp(String str) {
    return str.toLowerCase().replaceAll("^[^a-z]+|[^a-z]+$", "");
  }

  //inner DNode class:  PROVIDED
  private class DNode {

    private DNode next, prev;
    private T data;

    private DNode(T val) {
      this.data = val;
      next = prev = this;
    }
  }

  //DLinkedList fields:  PROVIDED
  private DNode header;

  //create an empty list:  PROVIDED
  public DLinkedList() {
    header = new DNode(null);
  }

  /**
   * PROVIDED add
   *
   * @param item return ref to newly inserted node
   */
  public DNode add(T item) {
    //make a new node
    DNode newNode = new DNode(item);
    //update newNode
    newNode.prev = header;
    newNode.next = header.next;
    //update surrounding nodes
    header.next.prev = newNode;
    header.next = newNode;
    return newNode;
  }

  //PROVIDED
  public String toString() {
    String str = "[";
    DNode curr = header.next;
    while (curr != header) {
      str += curr.data + " ";
      curr = curr.next;
    }
    str = str.substring(0, str.length() - 1);
    return str + "]";
  }

  /**
   * ASSIGNED
   * remove val from the list
   *
   * @param val
   * @return true if successful, false otherwise
   */
  public boolean remove(T val) {
    DNode current = header.next;
    while (current != header && current.data.compareTo(val) != 0) {
      current = current.next;
    }
    if(current == header){
      return false;
    }
    current.prev.next = current.next;
    current.next.prev = current.prev;
    current.next = current;
    current.prev = current;
    return true;
  }

  /**
   * ASSIGNED
   *
   * @param item
   */
  public void insertOrder(T item) {
    DNode current = header.next;
    while (current != header && current.data.compareTo(item) < 0) {
      current = current.next;
    }
    DNode newNode = new DNode(item);
    newNode.prev = current.prev;
    newNode.next = current;
    current.prev.next = newNode;
    current.prev = newNode;

  }

  /**
   * ASSIGNED
   *
   * @param item
   */
  public boolean insertOrderUnique(T item) {
    DNode current = header.next;
    while (current != header && current.data.compareTo(item) < 0) {
      current = current.next;
    }
    if(current != header && current.data.compareTo(item) == 0){
      return false;
    }
    DNode newNode = new DNode(item);
    newNode.prev = current.prev;
    newNode.next = current;
    current.prev.next = newNode;
    current.prev = newNode;
    return true;
  }

  /**
   * ASSIGNED
   * PRE:  this and rhs are sorted lists
   * @param rhs
   * @return list that contains this and rhs merged into a sorted list
   * POST:  returned list will not contain duplicates
   */
  public DLinkedList merge(DLinkedList rhs) {
    DLinkedList result = new DLinkedList();
    DNode current = this.header.prev;
    while (current != this.header){
      result.add(current.data);
      current = current.prev;
    }
    current = rhs.header.next;
    while (current != rhs.header){
      result.insertOrderUnique(current.data);
      current = current.next;
    }
    return result;
  }

}