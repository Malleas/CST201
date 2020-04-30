package Week4;

/**
 * All work is created by Matt Sievers on 04-24-2020 for use in CST-201
 */
public class Pallindrome {

  public Pallindrome() {
  }

  public boolean isPalindrome(int number) {
    int reverseNumber = 0;
    int tempNumber = number;
    int remainder;
    while (number > 0) {
      remainder = number % 10;
      reverseNumber = (reverseNumber * 10) + remainder;
      number = number / 10;
    }
    if (reverseNumber == tempNumber) {
      return true;
    } else {
      return false;
    }
  }
}
