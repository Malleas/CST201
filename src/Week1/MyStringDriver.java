package Week1;

import java.util.Scanner;

/**
 * All work is created by Matt Sievers on 03-30-2020 for use in CST-201
 */
public class MyStringDriver {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input first string:");
    MyString firstString = new MyString(input.nextLine());

    System.out.println("Input second string:");
    MyString secondString = new MyString(input.nextLine());

    System.out.println("Input third string:");
    MyString thirdString = new MyString(input.nextLine());

    System.out.println("Input start index number:");
    int startIndex = input.nextInt();
    input.nextLine();

    System.out.println("Input end index number:");
    int endIndex = input.nextInt();
    input.nextLine();

    // .length() method
    System.out.println("The length of my first input string is: " + firstString.length());

    //toString method
    System.out.println(firstString);
    System.out.println(secondString);
    System.out.println(thirdString);

    //concat() method
    System.out.println("My Concat string is: " + firstString.concatString(secondString));

    //equals() method

    System.out.println("Do my two strings equal each other? " + secondString.equals(thirdString));

    //compareto() method
    int comparedValue = firstString.compareTo(secondString);
    if(comparedValue == 0){
      System.out.println(firstString + " & " + secondString + " are the same, compareTo returned a " + comparedValue);
    }else if(comparedValue == -1){
      System.out.println(firstString + " is lower in the alphabet than " + secondString + ", compareTo returned a " + comparedValue);
    }else {
      System.out.println(firstString + " is higher in the alphabet than " + secondString + ", compareTo returned a " + comparedValue);
    }

    //getChar() method
    System.out.println("The character at index of " + startIndex + " is " + firstString.getChar(startIndex));

    //toUpper() method
    System.out.println("To upper case is " + firstString.toUpper());

    //toLower() method
    System.out.println("To lower case is " + secondString.toLower());

    //subString() starting index only
    System.out.println("With the starting index of " + startIndex + ", the remaining string is " + secondString.subString(startIndex));

    //subString() start and end index
    System.out.println("With the starting index of " + startIndex + " and an end index of "
            + endIndex + ", what's left over is: " + secondString.subString(startIndex, endIndex));

    //indexOf() method
    int indexOfChar = thirdString.indexOf('n');
    if(indexOfChar == -1){
      System.out.println("Char of 'n' not found in " + thirdString);
    }else{
      System.out.println("Char of 'n' found at index of: " + indexOfChar + " in " + thirdString);
    }

    //lastIndexOf() method
    int lastIndexOfChar = thirdString.lastIndexOf('n');
    if(lastIndexOfChar == -1){
      System.out.println("Char of 'n' not found in " + thirdString);
    }else{
      System.out.println("The last char of 'n' found at index of: " + lastIndexOfChar + " in " + thirdString);
    }
  }



}
