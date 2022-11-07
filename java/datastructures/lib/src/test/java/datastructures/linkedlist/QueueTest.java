package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
//  Can successfully enqueue into a queue
  @Test void enqueueToQ(){
    Queue sut = new Queue();
    sut.enqueue("hello");
    assertEquals("hello", sut.rear.value);
    assertEquals("hello", sut.front.value);
    assertFalse(sut.isEmpty());
  }
//  Can successfully enqueue multiple values into a queue
  @Test void enqueueMultipleToQ(){
    Queue sut = new Queue();
    sut.enqueue("hello");
    sut.enqueue("world");
    assertEquals("hello", sut.front.value);
    assertEquals("world", sut.rear.value);
  }
//  Can successfully dequeue out of a queue the expected value
  @Test void dequeueFromQueue(){
    Queue sut = new Queue();
    sut.enqueue("hello");
    sut.enqueue("world");
    sut.enqueue("again");
    assertEquals("hello", sut.dequeue());
    assertEquals("world", sut.front.value);
    assertEquals("again", sut.rear.value);
  }
//  Can successfully peek into a queue, seeing the expected value
  @Test void peekQueue(){
    Queue sut = new Queue();
    sut.enqueue("hello");
    sut.enqueue("world");
    assertEquals("hello", sut.peek());
  }
//  Can successfully empty a queue after multiple dequeues
  @Test void dequeueUntilEmpty() {
    Queue sut = new Queue();
    sut.enqueue("hello");
    sut.enqueue("world");
    sut.enqueue("again");
    sut.dequeue();
    sut.dequeue();
    sut.dequeue();
    assertNull(sut.front);
    assertNull(sut.rear);
  }
  //  Can successfully instantiate an empty queue
  @Test void instantiateQueue(){
    Queue sut = new Queue();
    assertNull(sut.front);
    assertNull(sut.rear);
    assertTrue(sut.isEmpty());
  }
//  Calling dequeue or peek on empty queue raises exception
  @Test void exceptionOnEmptyQ(){
    Queue sut = new Queue();
    assertThrows(NoSuchElementException.class, ()->sut.peek());
    assertThrows(NoSuchElementException.class, ()->sut.dequeue());
  }
}
