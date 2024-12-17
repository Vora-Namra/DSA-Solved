class LL {

    // Node class representing each element in the list
    static class Node {
        int data;       // Value of the node
        Node next;      // Pointer to the next node

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;  // Head (first node) of the list

    // ================== Insertion Operations ==================

    // Insert a new node at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert a new node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Insert a new node at a specific position (0-based index)
    public void insertAtPosition(int data, int position) {
        if (position == 0) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // ================== Deletion Operations ==================

    // Delete a node from the beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // Delete a node from the end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Delete a node at a specific position (0-based index)
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (position == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Position out of bounds");
            return;
        }
        current.next = current.next.next;
    }

    // ================== Search Operation ==================

    // Search for a node by its value
    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // ================== Traversal Operation ==================

    // Traverse the list and print all elements
    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// ================== Main Class ==================

public class SinglyLL {
    public static void main(String[] args) {
        LL list = new LL();

        System.out.println("=== Insertion Operations ===");
        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtPosition(15, 1);  // Insert 15 at position 1
        list.traverse();  // Output: 10 -> 15 -> 20 -> 30 -> null

        System.out.println("\n=== Deletion Operations ===");
        list.deleteAtBeginning();
        list.traverse();  // Output: 15 -> 20 -> 30 -> null
        list.deleteAtEnd();
        list.traverse();  // Output: 15 -> 20 -> null
        list.deleteAtPosition(1);
        list.traverse();  // Output: 15 -> null

        System.out.println("\n=== Search Operations ===");
        System.out.println("Search for 15: " + list.search(15));  // Output: true
        System.out.println("Search for 20: " + list.search(20));  // Output: false
    }
}
