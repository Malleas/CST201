package Week3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * All work is created by Matt Sievers on 04-14-2020 for use in CST-201
 */
public class AssignmentWeek3 {

  public AssignmentWeek3() {
  }

  public char[] createCharArray(String inputFile) throws FileNotFoundException {
    Scanner scanner = new Scanner(new File(inputFile));
    String string = scanner.nextLine();
    while (scanner.hasNext()) {
      string = string + "\n" + scanner.nextLine();
    }
    char[] charArray = string.toCharArray();
    return charArray;
  }

  public void checkEqualChars(char[] inputArray) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < inputArray.length; i++) {
      if (inputArray[i] == '(' || inputArray[i] == '{' || inputArray[i] == '[') {
        stack.push(inputArray[i]);
        System.out.println(stack);
      } else if (inputArray[i] == ')' || inputArray[i] == '}' || inputArray[i] == ']') {
        stack.pop();
        System.out.println(stack);
      }
    }
    if (stack.empty()){
      System.out.println("Opening and closing characters matched");
    }else {
      System.out.println("The opening and closing don't match, the stack is not empty");
      System.out.println(stack);
    }
  }


}
