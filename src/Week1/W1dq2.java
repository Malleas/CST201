package Week1;

import java.util.Random;

/**
 * All work is created by Matt Sievers on 03-30-2020 for use in CST-201
 */
public class W1dq2 {

  public static void main(String[] args) {
    int[] intArray = createArray();
    sortArray(intArray);
  }

  /**
   *  Following example for Sorting Selection was found and implemented from the following website.
   *  Geeksforgeeks(n.d.) Selection sort.  Retrieved from: https://www.geeksforgeeks.org/selection-sort/
    */


  public static void sortArray(int[] intArray){
    //declaring a loop invariant.
    int arrayLength = intArray.length;
    //standard for loop, moving the index boundary by 1
    for (int i = 0; i < arrayLength -1; i++){
      //sets what ever the current min index is for the loop to assign the next value to it
      int min_index = i;
      //looks at the next index in the array
      for(int j = i+1; j < arrayLength; j++){
        //compares the next index to the current min index.  If the next index is lower, it assigns that value of J to min index
        if(intArray[j] < intArray[min_index]){
          min_index = j;
        }
        //
        //Assigns the value at current min index to a temp value.
        int temp = intArray[min_index];
        //assigns the intArray min index to the current index of the original array.
        intArray[min_index] = intArray[i];
        //assigns the temp value of the to the current index which should be the min index as well.
        intArray[i] = temp;
      }
    }
    System.out.println("Sorted list: ");
    for(int i = 0; i < intArray.length; i++){
      System.out.println(intArray[i]);
    }


  }

  public static int[] createArray(){
    int[] intArray = new int[5];
    System.out.println("Starting Array is: ");
    Random random = new Random();
    for (int i = 0; i < intArray.length; i++){
      intArray[i] = random.nextInt(100 + 1) + 10;

      System.out.println(Integer.toString(intArray[i]));
    }

    return intArray;
  }
}
