package datastructures.linkedlist;

import java.util.EmptyStackException;

public class PseudoQueue {
  private Stack front;
  private Stack rear;

  public PseudoQueue(){
    this.front = new Stack();
    this.rear = new Stack();
  }

  public void enqueue(String val){
    rear.push(val);
  }

  public String dequeue(){
    if (front.isEmpty()){
      if (rear.isEmpty()){
        throw new EmptyStackException();
      }
      while (!rear.isEmpty()){
        front.push(rear.pop());
      }
    }
    return front.pop();
  }

  public Stack getFront() {
    return front;
  }

  public Stack getRear() {
    return rear;
  }
}
