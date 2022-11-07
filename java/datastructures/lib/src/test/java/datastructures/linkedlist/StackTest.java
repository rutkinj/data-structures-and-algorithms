package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
//  Can successfully push onto a stack
  @Test void pushToStack(){
    Stack sut = new Stack();
    sut.push("hello,");
    assertEquals("hello,", sut.top.value);
  }
//  Can successfully push multiple values onto a stack
  @Test void pushMultipleToStack(){
    Stack sut = new Stack();
    sut.push("hello,");
    sut.push(" world!");
    assertEquals(" world!", sut.top.value);
  }
//  Can successfully pop off the stack
  @Test void popFromStack(){
    Stack sut = new Stack();
    sut.push("hello,");
    sut.push(" world!");
    assertEquals(" world!", sut.pop());
    assertEquals("hello,", sut.top.value);
  }
//  Can successfully empty a stack after multiple pops
  @Test void popUntilEmpty(){
    Stack sut = new Stack();
    sut.push("hello,");
    sut.push(" world!");
    sut.pop();
    sut.pop();
    assertTrue(sut.isEmpty());
  }
//  Can successfully peek the next item on the stack
  @Test void peekTopOfStack(){
    Stack sut = new Stack();
    sut.push("hello,");
    sut.push(" world!");
    assertEquals(" world!", sut.peek());
  }
//  Can successfully instantiate an empty stack
  @Test void instantiateEmptyStack(){
    Stack sut = new Stack();
    assertEquals(null, sut.top);
    assertTrue(sut.isEmpty());
  }
//  Calling pop or peek on empty stack raises exception
  @Test void exceptionOnEmptyStack(){
    Stack sut = new Stack();
    assertThrows(EmptyStackException.class, ()->sut.pop());
    assertThrows(EmptyStackException.class, ()->sut.peek());
  }
}
