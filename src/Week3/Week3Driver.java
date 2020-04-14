package Week3;

import java.io.FileNotFoundException;

/**
 * All work is created by Matt Sievers on 04-14-2020 for use in CST-201
 */
public class Week3Driver {

  public static void main(String[] args) throws FileNotFoundException {
    AssignmentWeek3 assignmentWeek3 = new AssignmentWeek3();
    String inputFile1 = "/Users/ntqams30/Dropbox/GCU Work/CST-201/src/Week3/input1.txt";
    String inputFile2 = "/Users/ntqams30/Dropbox/GCU Work/CST-201/src/Week3/input2.txt";

    char[] file1 = assignmentWeek3.createCharArray(inputFile1);
    char[] file2 = assignmentWeek3.createCharArray(inputFile2);

    System.out.println("Input from file 1: ");
    System.out.println(file1);
    System.out.println("Input from file 2: ");
    System.out.println(file2);

    assignmentWeek3.checkEqualChars(file1);
    assignmentWeek3.checkEqualChars(file2);

  }
}
