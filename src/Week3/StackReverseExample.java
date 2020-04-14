package Week3;

import java.util.Stack;

/**
 * All work is created by Matt Sievers on 04-14-2020 for use in CST-201
 */
public class StackReverseExample {
  static Stack<Character> st = new Stack<>();


  public static void main(String[] args) {
  st.push('1');
  st.push('2');
  st.push('3');
  st.push('4');

    System.out.println("Original Stack");
    System.out.println(st);

    reverse();

    System.out.println("Reversed Stack");
    System.out.println(st);

  }

  static void insert_at_bottom(char x){
    if(st.empty()){
      st.push(x);
    }else {
      char a = st.peek();
      System.out.println("char a " + a);
      System.out.println("cur stack " + st);
      st.pop();
      System.out.println("stack post pop " + st);
      insert_at_bottom(x);
      System.out.println("iab " + st);
      st.push(a);
      System.out.println("end of iab" + st);
    }
  }

  static void reverse(){
    if(st.size() > 0){
      System.out.println("Current stack in reverse method " + st);
      char x = st.peek();
      System.out.println("Char x assignment " + x);
      st.pop();
      System.out.println("Post Pop in reverse method " + st);
      reverse();
      insert_at_bottom(x);
    }
  }

}
