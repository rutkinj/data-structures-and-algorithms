package datastructures.animalshelter;

import datastructures.linkedlist.Node;
import datastructures.linkedlist.Queue;

import java.util.NoSuchElementException;

public class AnimalShelter {
  private Queue mainQ;
  private Queue tempQ;

  public AnimalShelter() {
    this.mainQ = new Queue();
    this.tempQ = new Queue();
  }

  public void enqueue(String animal){
    mainQ.enqueue(animal);
  }

  public String dequeue(String pref){
    // invalid input
    if(pref != "cat" && pref != "dog") return null;

    //check tempQ
    if(!tempQ.isEmpty() && tempQ.peek() == pref) return tempQ.dequeue();

    //if we get here and mainQ is empty there are no matches
    if(mainQ.isEmpty()) return null;

    //while there's no match, move values from mainQ to tempQ
    while(mainQ.peek() != pref){
      tempQ.enqueue(mainQ.dequeue());
    }
    //return the match
    return mainQ.dequeue();
  }
}
