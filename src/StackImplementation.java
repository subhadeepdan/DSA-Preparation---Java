public class StackImplementation {
    private int top;
    private int[] arr;
    private int size;

    StackImplementation(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public void push(int element){
        if(top<size-1){
            top++;
            arr[top]=element;
        }
        else{
            System.out.println("Stack Overflow");
        }
    }

    public int pop(){
        if(top>=0){
            int element = arr[top];
            top--;
            return element;
        }
        else{
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int peek(){
        if(top>=0){
            return arr[top];
        }
        else{
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public static void main(String[] args){
        StackImplementation stack = new StackImplementation(5);
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
