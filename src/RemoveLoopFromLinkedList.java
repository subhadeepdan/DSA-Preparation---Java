public class RemoveLoopFromLinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node slow_p = RemoveLoopFromLinkedList.head, fast_p= RemoveLoopFromLinkedList.head;
        while(slow_p!=null && fast_p!=null && fast_p.next!=null){
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if(slow_p==fast_p){
                remove(slow_p, head);
                return;
            }
        }
    }

    public static void printList(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }

    public static void remove(Node slow_p, Node head){
        Node ptr1 = slow_p, ptr2=slow_p;
        int count=1;
        while(ptr1.next!=ptr2){
            count++;
            ptr1=ptr1.next;
        }
        ptr1 = ptr2 = head;
        for(int i=0;i<count;i++){
            ptr1=ptr1.next;
        }

        while(ptr1!=ptr2){
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }

        while(ptr2.next!=ptr1){
            ptr2=ptr2.next;
        }

        ptr2.next=null;
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

        removeLoop(head);

        printList();
    }
}
