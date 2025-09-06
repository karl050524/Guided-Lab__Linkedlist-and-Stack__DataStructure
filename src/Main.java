import LinkedList.LinkedList;
import Stack.Stack;

public class Main {
    public static void main(String[] args) {

        // Implementing my Explicit Linked List
        System.out.println("\n\n==========IMPLEMENTING LINKED LIST DATA STRUCTURE==========\n");
        LinkedList myLinkedList = new LinkedList();

        System.out.println("Adding 69 to the front...");
        myLinkedList.addFirst(69);
        myLinkedList.displayList();

        System.out.println("Adding 420 to the front...");
        myLinkedList.addFirst(420);
        myLinkedList.displayList();

        System.out.println("Adding 20 to the front...");
        myLinkedList.addFirst(20);
        myLinkedList.displayList();

        // Implementing my Explicit Stack Data Structure
        System.out.println("\n==========IMPLEMENTING STACK DATA STRUCTURE==========\n");
        Stack myStack = new Stack();

        myStack.pushData(0);
        myStack.pushData(1);
        myStack.pushData(1);
        myStack.pushData(2);
        myStack.pushData(3);
        myStack.pushData(5);

        System.out.println("\nCurrent Stack State: ");
        myStack.list.displayList();

        // Popping elements out the Stack
        for (int i = 0; i < 6; i++) {
            myStack.popData();
            System.out.println();
            myStack.list.displayList();
        }

        if (myStack._StackIsEmpty()){
            System.out.println("\nThe Stack is empty now!");
        }
    }
}
