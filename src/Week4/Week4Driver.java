package Week4;

import java.io.IOException;

/**
 * All work is created by Matt Sievers on 04-21-2020 for use in CST-201
 */
public class Week4Driver {


  public static void main(String[] args) throws IOException {
    TestHelpers helpers = new TestHelpers();

   helpers.testSlop("/Users/ntqams30/Dropbox/GCU Work/CST-201/src/Week4/slopTestFile.txt");
   helpers.testSlip("/Users/ntqams30/Dropbox/GCU Work/CST-201/src/Week4/slipTestFile.txt");
   helpers.testSlap("/Users/ntqams30/Dropbox/GCU Work/CST-201/src/Week4/slapTestFile.txt");




  }
}
