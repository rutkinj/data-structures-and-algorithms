package datastructures.treeIntersection;

import datastructures.trees.BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;

public class TreeIntersection {
  public static ArrayList<Integer> treeIntersection(BinaryTree first, BinaryTree second){
    HashMap<Integer,Integer> valuesInFirst = first.inorderHashmap();
    ArrayList<Integer> valuesSeenTwice = new ArrayList<>();
    for(Object value:second.postorder()){
      if (valuesInFirst.containsKey(value)){
        valuesSeenTwice.add((Integer) value);
      }
    }
    return valuesSeenTwice;
  }

}
