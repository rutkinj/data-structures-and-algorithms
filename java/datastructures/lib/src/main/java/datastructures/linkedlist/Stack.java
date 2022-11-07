package datastructures.linkedlist;

import java.util.EmptyStackException;

public class Stack {
  Node top = null;

  public Stack(){};

  public void push(String val){
    Node newTop = new Node(val);
    newTop.next = this.top;
    this.top = newTop;
  }

  public String pop(){
    Node popNode = this.top;
    if (popNode == null) {
      throw new EmptyStackException();
    }
    top = popNode.next;
    return popNode.value;
  }

  public String peek(){
    if (this.top == null) {
      throw new EmptyStackException();
    }
    return top.value;
  }

  public boolean isEmpty(){
    if (this.top == null){
      return true;
    }
    return false;
  }
}
