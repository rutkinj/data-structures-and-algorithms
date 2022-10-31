package datastructures.linkedlist;

public class LinkedList
{
  public Node head = null;
  public LinkedList(){}

  public void insert(String value){
    Node newHead = new Node(value);
    newHead.next = head;
    head = newHead;
  }

  public boolean includes(String searchVal){
    Node current = head;
    while(current.next != null){
      if (current.next.value == searchVal){
        return true;
      }
      current = current.next;
    }
    return false;
  }

  @Override
  public String toString() {
    StringBuilder retStr = new StringBuilder();
    Node current = head;
    while(current != null){
      retStr.append("{ " + current.value + " } => ");
      current = current.next;
    }
    retStr.append("NULL");
    return retStr.toString();
  }

  public void append(String value){
    //add new node to end of ll
    Node current = head;
    while(current.next != null){
      current = current.next;
    }
    Node newNode = new Node(value);
    current.next = newNode;
  }

  public void insertBefore(String searchValue, String addValue){
    Node current = head;
    while(current != null){
      if (current.next.value == searchValue){
        Node newNode = new Node(addValue);
        newNode.next = current.next;
        current.next = newNode;
        return;
      }
      current = current.next;
    }
    System.out.println("Search value not found");
  }

  public void insertAfter(String searchValue, String addValue){
    Node current = head;
    while(current != null){
      if (current.value == searchValue){
        Node newNode = new Node(addValue);
        newNode.next = current.next;
        current.next = newNode;
        return;
      }
      current = current.next;
    }
    System.out.println("Search value not found");
  }
}
