public class StackUsingLinkedList {
    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static void push(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    static void pop(){
        if(head==null){
            System.out.print("Top is empty");
            return;
        }
        head = head.next;
    }

    public static void main(String[] args){

    }
}
