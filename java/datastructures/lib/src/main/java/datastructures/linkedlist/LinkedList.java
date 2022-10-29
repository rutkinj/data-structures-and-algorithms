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
  public String toString()
    {
      StringBuilder retStr = new StringBuilder();
      Node current = head;
      while(current != null){
        retStr.append("{ " + current.value + " } => ");
        current = current.next;
      }
      retStr.append("NULL");
      return retStr.toString();
    }
}
