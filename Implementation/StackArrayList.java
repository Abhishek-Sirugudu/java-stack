package Stack;

class StackArr {
    private int[] arr;
    private int top;
    private int capacity;

    public StackArr(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int val) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = val;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty !");
            return -1;
        }
        return arr[top];
    }

    public void printele() {
        if (isEmpty()) {
            System.out.print("Stack is Empty !");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + "->");
        }
        System.out.print("end");
    }

    public static void main(String[] args) {
        StackArr stack = new StackArr(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.printele();
        System.out.println(stack.pop());
        stack.printele();
    }
}
