package Week4;

import java.util.Scanner;

/**
 * All work is created by Matt Sievers on 04-24-2020 for use in CST-201
 */
public class TowersOfHanoi {

  public void solveTowersOfHanoi(int n, String source, String aux, String dest){
    if(n == 1){
      System.out.println(source + " --> " + dest);
      return;
    }
    solveTowersOfHanoi(n-1, source, dest, aux);
    System.out.println(source + " --> " + dest);

    solveTowersOfHanoi(n-1, aux, source, dest);
  }

  public static void main(String[] args) {
    TowersOfHanoi towersOfHanoi = new TowersOfHanoi();

    System.out.println("Enter number of disks : ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    input.close();

    towersOfHanoi.solveTowersOfHanoi(n, "A", "B", "C");

  }
}
