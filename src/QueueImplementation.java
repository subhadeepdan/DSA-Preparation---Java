public class QueueImplementation {
    int front;
    int rear;
    int size;
    int[] arr;

    QueueImplementation(int size){
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = 0;
    }

    public void enqueue(int data){
        if(rear < size){
            arr[rear] = data;
            rear ++;
        }
        else{
            System.out.println("Queue is full");
        }
    }

    public int dequeue(){
        if(!isEmpty()){
            int element = arr[front];
            arr[front] = -1;
            front ++;

            if(front==rear){
                front = 0;
                rear = 0;
            }

            return element;
        }
        else{
            System.out.println("Queue is empty");
        }
        return -1;
    }

    boolean isEmpty(){
        return front == rear;
    }

    public static void main(String[] args){
        QueueImplementation queue = new QueueImplementation(5);
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
    }
}
