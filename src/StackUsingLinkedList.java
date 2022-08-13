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

    StackUsingLinkedList(){
        head = null;
    }

    static void push(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    static int pop(){
        if(head==null){
            System.out.print("Top is empty");
            return -1;
        }
        int element = head.data;
        head = head.next;
        return element;
    }

    static int peek(){
        if(head==null){
            System.out.print("Top is empty");
            return -1;
        }
        return head.data;
    }

    static boolean isEmpty(){
        if(head==null){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());
    }
}
