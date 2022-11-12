package datastructures.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TreesTest {

  //  Can successfully instantiate an empty tree
  @Test void MakeEmptyTree(){
    BinaryTree sut = new BinaryTree();
    assertNotNull(sut);
    assertNull(sut.root);
  }
//  Can successfully instantiate a tree with a single root node
  @Test void MakeTreeSingleNode(){
    BinaryTree sut = new BinaryTree(25);
    assertNotNull(sut);
    assertEquals(25, sut.root.value);
  }
//  For a Binary Search Tree, can successfully add a left child and right child properly to a node
  @Test void AddTwoBinarySearchTree(){
    BinarySearchTree sut = new BinarySearchTree();
    sut.add(4);
    sut.add(2);
    sut.add(8);
    assertEquals(4, sut.root.value);
    assertEquals(2, sut.root.left.value);
    assertEquals(8, sut.root.right.value);
  }
//  Can successfully return a collection from a preorder traversal
  @Test void PreorderBinarySearchTree(){
    BinarySearchTree sut = new BinarySearchTree();
    sut.add(4);
    sut.add(2);
    sut.add(1);
    sut.add(3);
    sut.add(8);
    sut.add(6);
    sut.add(10);
    assertEquals("[4, 2, 1, 3, 8, 6, 10]" ,sut.preorder().toString());
  }
//  Can successfully return a collection from an inorder traversal
  @Test void InorderBinarySearchTree(){
    BinarySearchTree sut = new BinarySearchTree();
    sut.add(4);
    sut.add(2);
    sut.add(1);
    sut.add(3);
    sut.add(8);
    sut.add(6);
    sut.add(10);
    assertEquals("[1, 2, 3, 4, 6, 8, 10]" ,sut.inorder().toString());
  }
//  Can successfully return a collection from a postorder traversal
  @Test void PostorderBinarySearchTree(){
    BinarySearchTree sut = new BinarySearchTree();
    sut.add(4);
    sut.add(2);
    sut.add(1);
    sut.add(3);
    sut.add(8);
    sut.add(6);
    sut.add(10);
    assertEquals("[1, 3, 2, 6, 10, 8, 4]" ,sut.postorder().toString());
  }
//  Returns true	false for the contains method, given an existing or non-existing node value
  @Test void ContainsBinarySearchTree(){
    BinarySearchTree sut = new BinarySearchTree();
    sut.add(4);
    sut.add(2);
    sut.add(1);
    sut.add(3);
    sut.add(8);
    sut.add(6);
    sut.add(10);
    assertTrue(sut.contains(6));
    assertFalse(sut.contains(7));
  }
}
