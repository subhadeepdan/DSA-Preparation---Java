public class QueueUsingLinkedList {
    static Node front;
    static Node rear;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    QueueUsingLinkedList(){
        front = null;
        rear = null;
    }

    static void enqueue(int data){
        Node temp = new Node(data);
        if(rear == null){
            front = rear = temp;
            return;
        }

        rear.next = temp;
        rear = rear.next;
    }

    static int dequeue(){
        if(front == null){
            System.out.println("Queue is empty");
            return -1;
        }

        int element = front.data;
        front = front.next;

        if(front == null){
            rear = null;
        }

        return element;
    }

    public static void main(String[] args){
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

}
