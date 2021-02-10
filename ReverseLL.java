public class ReverseLL {
 
  public static LL.Node iterative(LL.Node node) {
    LL.Node prev = null;
    LL.Node curr = node;
    LL.Node next = null;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    node = prev;
    return node;
  }
 
  public static LL.Node recursive(LL.Node node) { 
    if (node == null || node.next == null) {
      return node; 
    }
    LL.Node temp = recursive(node.next); 
    node.next.next = node; 
    node.next = null; 
    return temp; 
  }

}
