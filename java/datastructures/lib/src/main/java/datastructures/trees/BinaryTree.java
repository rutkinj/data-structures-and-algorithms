package datastructures.trees;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Queue;

public class BinaryTree {
  Node root;

  public BinaryTree(){};

  public BinaryTree (Integer root){
    this.root = new Node(root);
  }

  public ArrayList<Integer> preorder(){
    ArrayList<Integer> values = new ArrayList();
    preorder(root, values);
    return values;
  }

  private void preorder(Node node, ArrayList<Integer> values){
    if(node == null) return;
    // root -> left -> right
    values.add(node.value);
    preorder(node.left, values);
    preorder(node.right, values);
  }

  public ArrayList inorder(){
    ArrayList<Integer> values = new ArrayList();
    inorder(root, values);
    return values;
  }

  private void inorder(Node node, ArrayList<Integer> values){
    if(node == null) return;
    // left -> root -> right
    inorder(node.left, values);
    values.add(node.value);
    inorder(node.right, values);
  }

  public ArrayList postorder(){
    ArrayList<Integer> values = new ArrayList();
    postorder(root, values);
    return values;
  }

  private void postorder(Node node, ArrayList<Integer> values){
    if(node == null) return;
    // left -> right -> root
    postorder(node.left, values);
    postorder(node.right, values);
    values.add(node.value);
  }

  public Integer findMax(){
    Integer hi = root.value;
    hi = findMax(root, hi);
    return hi;
  }

  private Integer findMax(Node node, Integer hi){
    if(node != null){
    // root -> left -> right
      if (node.value > hi) {
        hi = node.value;
      }
      hi = findMax(node.left, hi);
      hi = findMax(node.right, hi);
    }
    return hi;
  }

  public static ArrayList<Integer> breadthFirst(BinaryTree tree){
    ArrayList<Integer> retArr = new ArrayList<>();
    Queue q = null;
    Node temp = null;
    q.add(tree.root);
    while (!q.isEmpty()) {

    }

    return retArr;
  }
}
