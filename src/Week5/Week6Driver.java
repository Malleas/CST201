package Week5;

import Helpers.Helpers;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * All work is created by Matt Sievers on 04-28-2020 for use in CST-201
 */
public class Week6Driver {

  public static void main(String[] args) throws IOException {
    Assignment6 theTree = new Assignment6();
    Helpers helpers = new Helpers();

    ArrayList<String> inputArray = helpers.splitString("/Users/ntqams30/Dropbox/GCU Work/CST-201/src/Week5/week6Input.txt");
    System.out.println(inputArray.toString());

    for (int i = 0; i <= inputArray.size() - 1; i++) {
      theTree.addNode(inputArray.get(i));
    }

    theTree.inOrderTraverseTree(theTree.root);
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("Enter string, enter -1 to quit: ");
      String input = scanner.nextLine();
      if(input.equals("-1")){
        break;
      }
      theTree.findNode(input);
    } while (true);

    System.out.println("Enter string to remove: ");
   // Scanner removeScanner = new Scanner(System.in);
    do{
      System.out.println("Enter string to remove, enter -1 to quit: ");
      String removedString = scanner.nextLine();
      if(removedString.equals("-1")){
        break;
      }
      boolean isRemoved = theTree.remove(removedString);
      if(isRemoved){
        theTree.inOrderTraverseTree(theTree.root);
      }else {
        System.out.println(removedString + " not found, nothing removed.");
        theTree.inOrderTraverseTree(theTree.root);
      }
    }while (true);


  }
}
