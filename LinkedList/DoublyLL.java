public class DoublyLL {
  class Node{
    Node prev;
    Node next;
    int val;

    Node(int val){
        this.val = val;
        this.prev = null;
        this.next = null;
    }
    Node(int val,Node next,Node prev){
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
  }  

  Node head;

  public void insertFirst(int val){
    Node newnode = new Node(val);
    
        newnode.prev = null;
        newnode.next = head;
        if(head != null){
        head.prev = newnode;
        }
        head = newnode;    
  }

  public Node find(int val){
    Node n = head;
    while(n != null){
        if(n.val == val){
            return n;
        }
        n = n.next;
    }
    return null;
  }



  public void insertAtPosition(int after,int val){
    Node newnode = new Node(val);
    Node p = find(after);
    if(p == null){
        System.out.println("Does not Exist");
    }
    newnode.next = p.next;
    p.next = newnode;
    newnode.prev = p;
    if(newnode.next != null){
        newnode.next.prev = newnode;
    }
    

  }

  public void insertLast(int val){
    Node newnode = new Node(val);
    if(head == null){
        newnode.prev = null;
        head = newnode;
        return;
    }
    Node n = head;
    while(n.next != null){
        n =n.next;
    }
    n.next = newnode;
    newnode.prev = n;
    newnode.next = null;
  }

  public void display(){
    Node n = head;
    Node last = null;
    while(n != null){
        System.out.println(n.val);
        last = n;
        n = n.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    DoublyLL ll = new DoublyLL();
    ll.insertFirst(0);
    ll.insertFirst(1);
    ll.insertFirst(3);
    ll.insertFirst(4);
    ll.display();
    
    ll.insertLast(2);
    ll.insertLast(6);
    ll.insertLast(8);
    ll.display();

    ll.insertAtPosition(6, 19);
    
    ll.insertAtPosition(19, 55);
    ll.display();
  }
}

