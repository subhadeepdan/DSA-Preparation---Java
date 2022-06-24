public class LinkedListTraversal {
    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
         }
    }

    public static void main(String[] args){
        head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.next = third;

        printList();

        push(5);

        printList();

        insertAfter(second, 15);

        printList();

        append(50);
        printList();

        deleteNode(20);
        printList();
    }

    public static void printList(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }

    public static void push(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public static void insertAfter(Node node, int newData){
        Node newNode = new Node(newData);

        newNode.next = node.next;

        node.next = newNode;
    }

    public static void append(int newData){
        Node newNode = new Node(newData);
        if(head==null){
            head = newNode;
        }

        Node n = head;
        while(n.next!=null){
            n = n.next;
        }
        n.next = newNode;
    }

    public static void deleteNode(int key){
        Node temp = head, prev = null;

        if(temp!=null && temp.data == key){
            head = temp.next;
            return;
        }

        while(temp!=null && temp.data!=key){
            prev = temp;
            temp = temp.next;
        }

        if(prev==null){
            return;
        }
        if(temp!=null){
            prev.next = temp.next;
        }
    }
}
