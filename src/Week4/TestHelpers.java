package Week4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * All work is created by Matt Sievers on 04-23-2020 for use in CST-201
 */
public class TestHelpers {

  public TestHelpers() {
  }

  public void testSlop(String fileName) throws IOException {
    System.out.println("****SLOPS OUTPUT****");
    String[] inputArray = readLines(fileName);
    int i;
    for (i = 0; i < inputArray.length; i++) {
      Assignment4 assignment4 = new Assignment4();
      if (assignment4.isSlop(inputArray[i])) {
        System.out.println("\t" + inputArray[i] + " YES");
      } else {
        System.out.println("\t" + inputArray[i] + " NO");
      }
    }
    System.out.println("****END OF OUTPUT****");
  }

  public void testSlip(String filename) throws IOException {
    System.out.println("****SLIPS OUTPUT****");
    String[] inputArray = readLines(filename);
    int i;
    for (i = 0; i < inputArray.length; i++) {
      Assignment4 assignment4 = new Assignment4();
      if (assignment4.isSlip(inputArray[i])) {
        System.out.println("\t" + inputArray[i] + " YES");
      } else {
        System.out.println("\t" + inputArray[i] + " NO");
      }
    }
    System.out.println("****END OF OUTPUT****");
  }

  public void testSlap(String filename) throws IOException {
    System.out.println("****SLAPS OUTPUT****");
    String[] inputArray = readLines(filename);
    int i;
    for (i = 0; i < inputArray.length; i++) {
      Assignment4 assignment4 = new Assignment4();
      if (assignment4.isSlap(inputArray[i])) {
        System.out.println("\t" + inputArray[i] + " YES");
      } else {
        System.out.println("\t" + inputArray[i] + " NO");
      }
    }
    System.out.println("****END OF OUTPUT****");
  }

  private String[] readLines(String filename) throws IOException {
    FileReader fileReader = new FileReader(filename);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    List<String> lines = new ArrayList<String>();
    String line = null;
    while ((line = bufferedReader.readLine()) != null) {
      lines.add(line);
    }
    bufferedReader.close();
    return lines.toArray(new String[lines.size()]);
  }

}
