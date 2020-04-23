package Week4;

import java.io.IOException;

/**
 * All work is created by Matt Sievers on 04-21-2020 for use in CST-201
 */
public class Week4Driver {


  public static void main(String[] args) throws IOException {
    TestHelpers helpers = new TestHelpers();
    Assignment4 assignment4 = new Assignment4();

   helpers.testSlop("/Users/ntqams30/Dropbox/GCU Work/CST-201/src/Week4/slopTestFile.txt");
   helpers.testSlip("/Users/ntqams30/Dropbox/GCU Work/CST-201/src/Week4/slipTestFile.txt");
   helpers.testSlap("/Users/ntqams30/Dropbox/GCU Work/CST-201/src/Week4/slapTestFile.txt");


    String slip1 = "dfg";
    String slip2 = "EFG";
    String slip3 = "DFFFFFG";
    String slip4 = "DFDFDFDFG";
    String slip5 = "DFEFFFFFG";
    String slip6 = "EFAHG"; //Expected Failure
    String slip7 = "DG";  //Expected Failure


    //isSlap testSlop
    String slap1 = "AH";
    String slap2 = "ABAHC";
    String slap3 = "AbabahCC";
    String slap4 = "ABAC";
    String slap5 = "ADFGC";
    String slap6 = "ADFFFFGC";
    String slap7 = "ABABAHC";

    //isSlop Tests
    String slop1 = "AHDFG";
    String slop2 = "ADFGCDFFFFFG";
    String slop3 = "ABABCC"; //Expected failure

   // System.out.println(test15.isSlop(slop1));
   // System.out.println(test16.isSlop(slop2));
   // System.out.println(test17.isSlop(slop3));

    // System.out.println(test1.isSlap(slap1));
    // System.out.println(test2.isSlap(slap2));
    // System.out.println(test3.isSlap(slap3));
    // System.out.println(test4.isSlap(slap4));
    // System.out.println(test5.isSlap(slap5));
    // System.out.println(test6.isSlap(slap6));
    // System.out.println(test7.isSlap(slap7));

    //  System.out.println(test8.isSlip(slip1));
    //  System.out.println(test9.isSlip(slip2));
    //  System.out.println(test10.isSlip(slip3));
    //  System.out.println(test11.isSlip(slip4));
    //  System.out.println(test12.isSlip(slip5));
     //System.out.println(assignment4.isSlip(slip6));
    //  System.out.println(test14.isSlip(slip7));

  }

  /**
   * String[] slips = new String[]{slip1, slip2, slip3, slip4, slip5, slip6, slip7};
   *
   *
   *
   *    System.out.println(helpers.testSlop(slips));
   */
}
