package datastructures.trees;

public class BinarySearchTree extends BinaryTree{

  public void add(Integer value){
    Node newNode = new Node(value);
    if (root == null) {
      root = newNode;
      return;
    }
    Node current = root;

    while (current!=null) {
      if (value < current.value) {
        if (current.left == null) {
          current.left = newNode;
          return;
        } else current = current.left;
      } else if (value > current.value) {
        if (current.right == null) {
          current.right = newNode;
          return;
        } else current = current.right;
      } else return;
    }
  }

  public boolean contains(Integer value){
    Node current = root;

    while (current!=null) {
      if (value < current.value) {
        if (current.left == null) {
          return false;
        } else current = current.left;
      } else if (value > current.value) {
        if (current.right == null) {
          return false;
        } else current = current.right;
      } else return true;
    }
    return false;
  }
}
