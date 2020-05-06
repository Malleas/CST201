package Week6;

import Helpers.Helpers;
import Week5.Assignment6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * All work is created by Matt Sievers on 05-05-2020 for use in CST-201
 */
public class Week6Driver {

  public static void main(String[] args) throws IOException {
    Helpers helpers = new Helpers();
    ArrayList<String> inputList = helpers.splitString("/Users/ntqams30/Dropbox/GCU Work/CST-201/src/Week6/week6Input.txt");
    Assignment7 assignment7 = new Assignment7();

    for (int i = 0; i < inputList.size(); i++) {
      Random rand = new Random();
      assignment7.put(inputList.get(i), rand.nextInt(1000));
    }

    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("Enter search criteria, enter -1 to quit: ");
      String input = scanner.nextLine();
      if(input.equals("-1")){
        break;
      }
      if(assignment7.findObject(input)== null){
        System.out.println("No items found.  Result returned with 0 elements searched");
      }
    } while (true);

  }
}
