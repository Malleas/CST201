package Week3;

/**
 * All work is created by Matt Sievers on 04-14-2020 for use in CST-201
 */
public class JVMStackExample {

  public static void main(String[] args) {
    foo();
  }

  public static void foo(){
    bar();
  }

  private static void bar(){
    System.out.println("Test");
  }
}
