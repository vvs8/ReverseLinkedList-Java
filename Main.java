import java.util.*;

class Main {
  public static void main(String[] args) {
    LL ll = new LL();
    
    ll.add("A"); 
    ll.add("B"); 
    ll.add("C"); 
    ll.add("D"); 
    ll.add("E"); 
    ll.add("F"); 
    ll.add("G");
    ll.push("hi");
    ll.print();
 
    ll.head = ReverseLL.recursive(ll.head); 
    System.out.println("Reversed Recursive"); 
    ll.print(); 

    ll.head = ReverseLL.iterative(ll.head);
    System.out.println("Reversed Back Iteratively"); 
    ll.print(); 


  }
}
