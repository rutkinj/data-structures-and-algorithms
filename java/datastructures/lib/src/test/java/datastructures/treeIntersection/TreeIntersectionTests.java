package datastructures.treeIntersection;

import datastructures.trees.BinarySearchTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeIntersectionTests {
  @Test void worksAtAll(){
    BinarySearchTree sut1 = new BinarySearchTree();
    sut1.add(1);
    sut1.add(2);
    sut1.add(3);
    sut1.add(4);
    sut1.add(5);
    sut1.add(6);
    sut1.add(7);
    BinarySearchTree sut2 = new BinarySearchTree();
    sut2.add(7);
    sut2.add(8);
    sut2.add(9);
    sut2.add(10);
    sut2.add(11);
    sut2.add(12);
    sut2.add(13);
    assertEquals("[7]", TreeIntersection.treeIntersection(sut1,sut2).toString());
  }
}
