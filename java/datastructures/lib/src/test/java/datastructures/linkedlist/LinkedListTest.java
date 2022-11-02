package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
  @Test
  void createEmptyLinkedList() {
    LinkedList emptyLL = new LinkedList();
    assertTrue(emptyLL.head == null);
  }

  @Test
  void insertNewHead() {
    LinkedList linked = new LinkedList();
    linked.insert("bingbong");
    assertTrue(linked.head.value == "bingbong");
  }

  @Test
  void headPointsToNext() {
    LinkedList linked = new LinkedList();
    linked.insert("bingbong");
    assertTrue(linked.head.next == null);
  }

  @Test
  void insertMultipleNodes() {
    LinkedList linked = new LinkedList();
    linked.insert("bingbong");
    linked.insert("boy howdy!");
    assertTrue(linked.head.next.value == "bingbong");
  }

  @Test
  void successfullyFindValue() {
    LinkedList linked = new LinkedList();
    linked.insert("bingbong");
    linked.insert("boy howdy!");
    assertTrue(linked.includes("bingbong"));
  }

  @Test
  void failToFindValue() {
    LinkedList linked = new LinkedList();
    linked.insert("bingbong");
    linked.insert("boy howdy!");
    assertFalse(linked.includes("dit dah"));
  }

  @Test
  void returnValuesAsString() {
    LinkedList linked = new LinkedList();
    linked.insert("bingbong");
    linked.insert("boy howdy!");
    String expected = "{ boy howdy! } => { bingbong } => NULL";
    assertEquals(linked.toString(), expected);
  }

  @Test
  void insertAtEnd() {
    LinkedList linked = new LinkedList();
    linked.insert("bingbong");
    linked.insert("boy howdy!");
    linked.append("dit dah");
    String expected = "{ boy howdy! } => { bingbong } => { dit dah } => NULL";
    assertEquals(linked.toString(), expected);
  }

  @Test
  void insertMultipleAtEnd() {
    LinkedList linked = new LinkedList();
    linked.insert("bingbong");
    linked.insert("boy howdy!");
    linked.append("dit dah");
    linked.append("yeehaw");
    linked.append("yellerbelly");
    String expected = "{ boy howdy! } => { bingbong } => { dit dah } => { yeehaw } => { yellerbelly } => NULL";
    assertEquals(linked.toString(), expected);
  }

  @Test
  void insertBeforeDitDahMiddle() {
    LinkedList linked = new LinkedList();
    linked.insert("bingbong");
    linked.append("dit dah");
    linked.append("yellerbelly");
    linked.insertBefore("dit dah", "wahwah");
    String expected = "{ bingbong } => { wahwah } => { dit dah } => { yellerbelly } => NULL";
    assertEquals(linked.toString(), expected);
  }

  @Test
  void insertAfterDitDahMiddle() {
    LinkedList linked = new LinkedList();
    linked.insert("bingbong");
    linked.append("dit dah");
    linked.append("yellerbelly");
    linked.insertAfter("dit dah", "wahwah");
    String expected = "{ bingbong } => { dit dah } => { wahwah } => { yellerbelly } => NULL";
    assertEquals(linked.toString(), expected);
  }

  @Test
  void insertAfterDitDahEnd() {
    LinkedList linked = new LinkedList();
    linked.insert("bingbong");
    linked.append("yellerbelly");
    linked.append("dit dah");
    linked.insertAfter("dit dah", "wahwah");
    String expected = "{ bingbong } => { yellerbelly } => { dit dah } => { wahwah } => NULL";
    assertEquals(linked.toString(), expected);
  }

  @Test
  void kthFromEndHappyPath() {
    LinkedList linked = new LinkedList();
    linked.insert("potato");
    linked.insert("tomato");
    linked.insert("cucumber");
    linked.insert("onion");
    linked.insert("leek");
    linked.insert("broccoli");
    linked.insert("cabbage");
    assertEquals("onion", linked.kthFromEnd(3));
  }

  @Test
  void kthFromEndZero() {
    LinkedList linked = new LinkedList();
    linked.insert("potato");
    linked.insert("tomato");
    linked.insert("cucumber");
    linked.insert("onion");
    linked.insert("leek");
    linked.insert("broccoli");
    linked.insert("cabbage");
    assertEquals("potato", linked.kthFromEnd(0));
  }

  @Test
  void kthEqualToLLLength() {
    LinkedList linked = new LinkedList();
    linked.insert("potato");
    linked.insert("tomato");
    linked.insert("cucumber");
    linked.insert("onion");
    linked.insert("leek");
    linked.insert("broccoli");
    linked.insert("cabbage");
    assertEquals("cabbage", linked.kthFromEnd(6));
  }

  @Test
  void kthFromEndNegative() {
    LinkedList linked = new LinkedList();
    linked.insert("potato");
    linked.insert("tomato");
    linked.insert("cucumber");
    linked.insert("onion");
    linked.insert("leek");
    linked.insert("broccoli");
    linked.insert("cabbage");
    assertThrows(IllegalArgumentException.class, () -> linked.kthFromEnd(-3));
  }

  @Test
  void kthLargerThanLLLength() {
    LinkedList linked = new LinkedList();
    linked.insert("potato");
    linked.insert("tomato");
    linked.insert("cucumber");
    linked.insert("onion");
    linked.insert("leek");
    linked.insert("broccoli");
    linked.insert("cabbage");
    assertThrows(IllegalArgumentException.class, () -> linked.kthFromEnd(7));
  }

  @Test
  void kthFromEndTinyLL() {
    LinkedList linked = new LinkedList();
    linked.insert("potato");
    assertEquals("potato", linked.kthFromEnd(0));
    assertThrows(IllegalArgumentException.class, () -> linked.kthFromEnd(1));
  }

  @Test
  void kthFromEndSmallLL() {
    LinkedList linked = new LinkedList();
    linked.insert("potato");
    linked.insert("tomato");
    assertEquals("potato", linked.kthFromEnd(0));
    assertEquals("tomato", linked.kthFromEnd(1));
    assertThrows(IllegalArgumentException.class, () -> linked.kthFromEnd(2));
  }

}
