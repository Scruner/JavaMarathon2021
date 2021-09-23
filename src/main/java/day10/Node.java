package day10;

public class Node {
  Node leftLink;
  Node rightLink;
  private final int value;

  public Node(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  //  public Node(int value, Node leftLink, Node rightLink) {
//    this.leftLink = leftLink;
//    this.rightLink = rightLink;
//    this.value = value;
//  }



//  public int addElement(int element, Node linkRoot) {
//    if (element > root.value) {
//      linkRoot = root.rightLink;
//    }
//    if (element < root.value) {
//      linkRoot = root.leftLink;
//    }
//    return linkRoot.addElement(element, linkRoot);
//  }
}
