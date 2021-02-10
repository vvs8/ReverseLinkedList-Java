import java.util.*;

public class LL {
  Node head; 
     
  class Node { 
    String data; 
    Node next; 
    Node(String d) { 
      data = d; 
      next = null; 
    } 
  } 

  public void add(String data) {
    Node new_node = new Node(data);
    Node last = head;
    new_node.next = null;
    if (head == null) {
      head = new_node;
      return;
    }
    while (last.next != null)
      last = last.next;
    last.next = new_node; 
  }

  public void push(String data) { 
    Node new_node = new Node(data); 
    new_node.next = head; 
    head = new_node; 
  } 

  public void print() { 
    Node temp = head; 
    while (temp != null) { 
      System.out.print(temp.data + " "); 
      temp = temp.next; 
    } 
    System.out.println();
  }

}
