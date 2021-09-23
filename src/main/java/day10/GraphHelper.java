package day10;

public class GraphHelper {

  public static void addToNode(Node root, Node newNode) {
    if (root == null) {
      throw new NullPointerException();
    }
    if (root.getValue() > newNode.getValue()) {
      if (root.leftLink == null) {
        root.leftLink = newNode;
      } else {
        addToNode(root.leftLink, newNode);
      }
    } else {
      if (root.rightLink == null) {
        root.rightLink = newNode;
      } else {
        addToNode(root.rightLink, newNode);
      }
    }
  }

  public static void showGraph(Node graph) {
    if (graph == null) {
      return;
    }
    if (graph.leftLink != null) {
      showGraph(graph.leftLink);
    }
    System.out.println(graph.getValue());
    if (graph.rightLink != null) {
      showGraph(graph.rightLink);
    }
  }

  public static void main(String[] args) {
    var root = new Node(12);
    showGraph(root);
    var left1 = new Node(-12);
    var leftRight = new Node(2);
    var right = new Node(14);
    var rightSame = new Node(14);
    addToNode(root, left1);
    addToNode(root, leftRight);
    addToNode(root, right);
    addToNode(root, rightSame);
    System.out.println("--------------");
    showGraph(root);
  }
}
