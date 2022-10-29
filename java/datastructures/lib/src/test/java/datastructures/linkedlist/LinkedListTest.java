package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest
{
  @Test void createEmptyLinkedList()
    {
      LinkedList emptyLL = new LinkedList();
      assertTrue(emptyLL.head == null);
    }

  @Test void insertIntoLinkedList()
    {
      LinkedList linked = new LinkedList();
      linked.insert("bingbong");
      assertTrue(linked.head.value == "bingbong");
    }

  @Test void headPointsToNext()
    {
      LinkedList linked = new LinkedList();
      linked.insert("bingbong");
      assertTrue(linked.head.next == null);
    }
    @Test void insertMultipleNodes(){
      LinkedList linked = new LinkedList();
      linked.insert("bingbong");
      linked.insert("boy howdy!");
      assertTrue(linked.head.next.value == "bingbong");
    }

    @Test void successfullyFindValue(){
      LinkedList linked = new LinkedList();
      linked.insert("bingbong");
      linked.insert("boy howdy!");
      assertTrue(linked.includes("bingbong"));
    }

    @Test void failToFindValue(){
      LinkedList linked = new LinkedList();
      linked.insert("bingbong");
      linked.insert("boy howdy!");
      assertFalse(linked.includes("dit dah"));
    }

    @Test void returnValuesAsString(){
      LinkedList linked = new LinkedList();
      linked.insert("bingbong");
      linked.insert("boy howdy!");
      String expected = "{ boy howdy! } => { bingbong } => NULL";
      assertEquals(linked.toString(), expected);
    }
}
