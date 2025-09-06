package Stack;

import LinkedList.LinkedList;

public class Stack {
    public LinkedList list;

    public Stack(){
        this.list = new LinkedList();
    }

    public void pushData(int data){
        list.addFirst(data);
        System.out.printf("Data pushed to Stack: %d",data);
    }

    public int popData(){
        int data = list.removeFirst();
        System.out.printf("Data popped from Stack: %d", data);
        return data;
    }

    public boolean _StackIsEmpty(){
        return (list.head == null);
    }
}
