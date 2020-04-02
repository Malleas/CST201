package Week1;

import java.util.Random;

/**
 * All work is created by Matt Sievers on 03-30-2020 for use in CST-201
 */
public class W1dq1 {

  public static void main(String[] args) {
    int[] intArray = generateIntArray();
    calculateLargestNumber(intArray);
  }


  public static int[] generateIntArray(){
    Random random = new Random();
    int[] intArray = new int[100];
    for (int i = 0; i < intArray.length; i++){
      intArray[i] = random.nextInt(1000);
      System.out.println(Integer.toString(intArray[i]));
    }

    return intArray;
  }

  public static void calculateLargestNumber(int[] intArray){
    int largestNumber = 0;
    int computationCount = 0;
    for(int i = 0; i < intArray.length; i++){
      if (intArray[i] > largestNumber){
        largestNumber = intArray[i];
        computationCount++;
      }else if (intArray[i] < largestNumber){
        computationCount++;
      }
    }
    System.out.println("The largest number was " + largestNumber + " and it took " + computationCount + " times to compute");
  }


}
