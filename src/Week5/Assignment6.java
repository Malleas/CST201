package Week5;

/**
 * All work is created by Matt Sievers on 04-28-2020 for use in CST-201
 * Using some online tutorials, i followed these examples for the boilerplate and then added and changed what i needed.
 * Banas, Derek(2013, March 28) Java Binary Search Tree.  Retrieved from: https://www.youtube.com/watch?v=M6lYob8STMI&list=PLGLfVvz_LVvReUrWr94U-ZMgjYTQ538nT&index=13
 * Banas, Derek(2013, March 30) Java Binary Search Tree 2.  Retrieved from: https://www.youtube.com/watch?v=UcOxGmj45AA&list=PLGLfVvz_LVvReUrWr94U-ZMgjYTQ538nT&index=14
 */
public class Assignment6 {

  Node root;

  public void addNode(String name) {
    Node newNode = new Node(name);

    if (root == null) {
      root = newNode;
    } else {
      Node focusNode = root;
      Node parent;
      while (true) {
        parent = focusNode;
        if (name.compareTo(focusNode.name) < 0) {
          focusNode = focusNode.leftChild;
          if (focusNode == null) {
            parent.leftChild = newNode;
            return;
          }
        } else if(name.compareTo(focusNode.name) > 0) {
          focusNode = focusNode.rightChild;
          if (focusNode == null) {
            parent.rightChild = newNode;
            return;
          }
        }else {
          return;
        }
      }
    }
  }

  public void inOrderTraverseTree(Node focusNode) {
    if (focusNode != null) {
      inOrderTraverseTree(focusNode.leftChild);
      System.out.println(focusNode);
      inOrderTraverseTree(focusNode.rightChild);
    }
  }

 public boolean remove(String name){
    Node focusNode = root;
    Node parent = root;

    boolean isALeftChild = true;

    while (!focusNode.name.equals(name)){
      parent = focusNode;
      if(name.compareTo(focusNode.name) < 0){
        isALeftChild = true;
        focusNode = focusNode.leftChild;
      }else {
        isALeftChild = false;
        focusNode = focusNode.rightChild;
      }
      if(focusNode == null)
        return false;
    }
    if(focusNode.leftChild == null && focusNode.rightChild == null){
      if (focusNode == root){
        root = null;
      }else if(isALeftChild){
        parent.leftChild = null;
      }else {
        parent.rightChild = null;
      }
    }
    else if(focusNode.rightChild == null){
      if(focusNode == root)
        root = focusNode.leftChild;
      else if(isALeftChild)
        parent.leftChild = focusNode.leftChild;
      else
        parent.rightChild = focusNode.leftChild;

    }
    else if(focusNode.leftChild == null){
      if(focusNode == root)
        root = focusNode.rightChild;
      else if(isALeftChild)
        parent.leftChild = focusNode.rightChild;
      else
        parent.rightChild = focusNode.leftChild;
    }
    else {
      Node replacement = getReplacementNode(focusNode);

      if(focusNode == root)
        root = replacement;
      else if(isALeftChild)
        parent.leftChild = replacement;
      else
        parent.rightChild = replacement;

      replacement.leftChild = focusNode.leftChild;
    }
    return true;
 }

 private Node getReplacementNode(Node replacedNode){
    Node replacementParent = replacedNode;
    Node replacement = replacedNode;

    Node focusNode = replacedNode.rightChild;

    while (focusNode != null){
      replacementParent = replacement;
      replacement = focusNode;
      focusNode = focusNode.leftChild;
    }

    if(replacement != replacedNode.rightChild){
      replacementParent.leftChild = replacement.rightChild;
      replacement.rightChild = replacedNode.rightChild;
    }
    return replacement;
 }


  public void findNode(String name){
    Node focusNode = root;
    int count = 0;

    if(focusNode.name.equals(name)){
    }

    while (!focusNode.name.equals(name)){
      if(name.compareTo(focusNode.name) < 0){
        count++;
        focusNode = focusNode.leftChild;
        if(focusNode == null){
          System.out.println("Inspected " + count + " elements" + "\n" + name + " was not located");
          return;
        }
      }else if(name.compareTo(focusNode.name) > 0) {
        count++;
        focusNode = focusNode.rightChild;
        if(focusNode == null){
          System.out.println("Inspected " + count + " elements" + "\n" + name + " was not located");
          return;
        }
      }
    }

    System.out.println("Inspected " + count + " elements" + "\n" + name + " located");
}

}

class Node {
  String name;
  Node leftChild;
  Node rightChild;

  Node(String name) {
    this.name = name;
  }

  public String toString() {
    return name;
  }
}
