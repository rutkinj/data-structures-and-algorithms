package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class PseudoQueueTest {
  @Test void createPseudoQ(){
    assertNotNull(new PseudoQueue());
  }

  @Test void enQSuccess(){
    PseudoQueue sut = new PseudoQueue();
    sut.enqueue("cabbage");
    assertEquals("cabbage", sut.getRear().peek());
  }
  @Test void enQMutliSuccess(){
    PseudoQueue sut = new PseudoQueue();
    sut.enqueue("onion");
    sut.enqueue("carrot");
    sut.enqueue("cabbage");
    assertEquals("cabbage", sut.getRear().peek());
  }
  @Test void deQSuccess(){
    PseudoQueue sut = new PseudoQueue();
    sut.enqueue("onion");
    sut.enqueue("carrot");
    sut.enqueue("cabbage");
    assertEquals("onion", sut.dequeue());
    assertTrue(sut.getRear().isEmpty());
  }
  @Test void deQMultiSuccess(){
    PseudoQueue sut = new PseudoQueue();
    sut.enqueue("onion");
    sut.enqueue("carrot");
    sut.enqueue("cabbage");
    assertEquals("onion", sut.dequeue());
    assertEquals("carrot", sut.dequeue());
    assertEquals("cabbage", sut.getFront().peek());
  }
  @Test void multiEnQDeQ(){
    PseudoQueue sut = new PseudoQueue();
    sut.enqueue("onion");
    sut.dequeue();
    sut.enqueue("potato");
    assertEquals("potato", sut.dequeue());
    assertThrows(EmptyStackException.class, ()->sut.dequeue());
  }
  @Test void emptyStacksException(){
    PseudoQueue sut = new PseudoQueue();
    assertThrows(EmptyStackException.class, ()->sut.dequeue());
  }
}
