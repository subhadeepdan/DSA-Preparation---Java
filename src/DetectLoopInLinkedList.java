public class DetectLoopInLinkedList {
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

    static boolean detectLoop(Node head){
        Node slow_p=head, fast_p=head;

        while(slow_p!=null && fast_p!=null && fast_p.next!=null){
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;

            if(slow_p==fast_p){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;

        System.out.print(detectLoop(head));
    }
}
