package Week6;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * All work is created by Matt Sievers on 05-05-2020 for use in CST-201
 * Used a great example for again the boiler plate and altered and changed what i needed to get this to work.
 * Big Datums (n.d.) How to create a hash table in java (chaining example).  Retrieved from:
 * http://bigdatums.net/2016/07/19/how-to-create-a-hash-table-in-java-chaining-example/
 */
public class Assignment7 {

  public static class HashObject {
    @Override
    public String toString() {
      return "HashObject{" +
              "key='" + key + '\'' +
              ", value=" + value +
              '}';
    }

    private String key;
    private Integer value;
  }

  private int ARR_SIZE = 10;
  private LinkedList<HashObject>[] arr = new LinkedList[ARR_SIZE];

  public Assignment7() {
    for (int i = 0; i < ARR_SIZE; i++) {
      arr[i] = null;
    }
  }

  private HashObject getObject(String key) {
    int count = 0;
    if (key == null)
      return null;

    int index = key.hashCode() % ARR_SIZE;
    LinkedList<HashObject> items = arr[index];

    if (items == null)
      return null;

    for (HashObject item : items) {
      if (!item.key.equals(key)){
        count ++;
      }else {
        System.out.println(count + " elements searched to find " + key);
        return item;
      }

    }

    return null;
  }

  public Integer findObject(String key) {
    HashObject item = getObject(key.toLowerCase());

    if (item == null) {
      return null;
    } else {
      return item.value;
    }
  }

  public void put(String key, Integer value) {
    int index = Math.abs(key.hashCode() % ARR_SIZE);
    LinkedList<HashObject> items = arr[index];
    if (items == null) {
      items = new LinkedList<>();

      HashObject item = new HashObject();
      item.key = key.toLowerCase();
      item.value = value;

      items.add(item);
      arr[index] = items;
    } else {
      for (HashObject item : items) {
        if (item.key.equals(key)) {
          item.value = value;
          return;
        }
      }

      HashObject item = new HashObject();
      item.key = key.toLowerCase();
      item.value = value;

      items.add(item);
    }
  }

  public void delete(String key) {
    int index = key.hashCode() % ARR_SIZE;
    LinkedList<HashObject> items = arr[index];

    if (items == null) {
      return;
    }
    for (HashObject item : items) {
      if (item.key.equals(key)) {
        items.remove(item);
        return;
      }
    }
  }


  public void displayTable() {
    for (int i = 0; i < ARR_SIZE; i++){
      System.out.println(arr[i]);
    }
  }



}

