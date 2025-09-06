package LinkedList;

public class LinkedList {
    public Node head;

    public LinkedList(){
        this.head = null;
    }

    public void addFirst(int data){
        Node newNode = new Node(data); // 1. Create a new node with the given data
        newNode.next = this.head; // 2. Set the new node's next reference to the current head
        this.head = newNode; // 3. Update the list's head to be the new node
    }

    public void displayList() {
        System.out.print("List (head -> tail): ");
        Node current = this.head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {
        if (head == null) throw new RuntimeException("Cannot remove from an empty list.");

        int data = this.head.data;

        this.head = this.head.next;

        return data;
    }
}
