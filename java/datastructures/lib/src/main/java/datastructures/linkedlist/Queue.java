package datastructures.linkedlist;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Queue {
  Node front = null;
  Node rear = null;

  public void enqueue(String val){
    Node nodeToQ = new Node(val);
    if(rear == null){
      rear = nodeToQ;
      front = rear;
    } else {
      rear.next = nodeToQ;
      rear = nodeToQ;
    }
  }

  public String dequeue(){
    Node nodeToDeQ = this.front;
    if(nodeToDeQ == null){
      throw new NoSuchElementException();
    }
    this.front = nodeToDeQ.next;
    if(this.front == null){
      this.rear = null;
    }
    return nodeToDeQ.value;
  }

  public String peek(){
    if (front == null) {
      throw new NoSuchElementException();
    }
    return front.value;
  }

  public boolean isEmpty(){
    if (front == null){
      return true;
    }
    return false;
  }
}
