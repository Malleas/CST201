package Week4;

import java.util.Stack;

/**
 * All work is created by Matt Sievers on 04-21-2020 for use in CST-201
 */
public class Assignment4 {

  private Stack<Character> workingStack = new Stack<>();
  String orginalString = "";

  public Assignment4() {
  }

  public boolean isSlop(String string) {
    /** A slop is a character string that contains a Slap followed by a Slip
     * Examples of Slops: AHDFG, ADFGCDFFFFFG, ABAEFGCCDFEFFFFFG
     */
    orginalString = string;
    if (isSlap(string)) {
      if (workingStack.size() < orginalString.length() && isSlip(string.substring(workingStack.size()))) {
        return true;
      }
    }
    return false;
  }

  public boolean isSlap(String string) {
    /**
     * A slap has the following rules
     * its first character is an A
     * if it is a two character slap, then its second character is an H
     * if it is not a two character slap, then it is in one of these two forms:
     *      A followed by B followed by a Slap (AB, or AH) followed by a C
     *      A followed by a Slip followed by a C
     * Examples of Slaps: AH, ABAHC, ABABAHCC, ADFGC, ADFFFFGC, ABAEFGCC, ADFDFGC
     */
    char[] charArray = string.toUpperCase().toCharArray();

    int count = 0;
    try {
      for (int i = 0; i < charArray.length; i++) {
        if (workingStack.isEmpty() && charArray[i] == 'A') {
          workingStack.push(charArray[i]);
        } else if (workingStack.peek() == 'A' && charArray[i] == 'H') {
          workingStack.push(charArray[i]);
        } else if (workingStack.peek() == 'A' && charArray[i] == 'B') {
          workingStack.push(charArray[i]);
        } else if (workingStack.peek() == 'B' && charArray[i] == 'A') {
          workingStack.push(charArray[i]);
          count++;
          //Take current remaining char[], build a new string and submit that back to isSlap.
          String remaining = string.substring(i + 1);
          isSlap(remaining);
        } else if (count > 0 && charArray[i] == 'C') {
          count--;
          workingStack.push(charArray[i]);
        } else if (workingStack.peek() == 'A') {
          count++;
          String remaining = string.substring(i);
          isSlip(remaining);
        } else if (charArray[i] == 'D' || charArray[i] == 'E') {
          return true;
        }
        if ((workingStack.size() == charArray.length && count == 0) || (count == 0 && workingStack.peek() == 'C')) {
          return true;
        }
      }
    } catch (Exception e) {
    }
    return false;
  }

  public boolean isSlip(String string) {
    /**
     * A slip has the following rules
     * Its first character is either D of E
     * The first character is followed by a string of 1 or more F's
     * the string of F's is followed by another Slip (D or E) or a G
     * the Slip (D or E) or G that follows the string of F's ends the string.  Ex EFFFFG
     * Examples of Slips: DFG, EFG, DFFFFFG, DFDFDFDFG, DFEFFFFFG
     */
    char[] charArray = string.toUpperCase().toCharArray();
    orginalString = string;
    try {
      for (int i = 0; i < charArray.length; i++) {
        if (workingStack.isEmpty() && charArray[i] == 'D' || charArray[i] == 'E') {
          workingStack.push(charArray[i]);
        } else if ((workingStack.peek() == 'A' || workingStack.peek() == 'H') && (charArray[i] == 'D' || charArray[i] == 'E')) {
          workingStack.push(charArray[i]);
        } else if (charArray[i] == 'F') {
          workingStack.push(charArray[i]);
        } else if (workingStack.peek() == 'F' && charArray[i] == 'D' || charArray[i] == 'E') {
          workingStack.push(charArray[i]);
        } else if (workingStack.peek() == 'F' && charArray[i] == 'G') {
          workingStack.push(charArray[i]);
        }else if(workingStack.peek() == 'F' && charArray[i] != 'G') {
          return false;
        }
        if ((workingStack.size() == orginalString.length()) || (workingStack.peek() == 'G')) {
          return true;
        }
      }
    } catch (Exception e) {
    }
    return false;
  }


}
