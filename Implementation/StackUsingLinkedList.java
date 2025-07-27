package Stack;

public class StackUsingLinkedList {
    public class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public Boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void push(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public int pop() {
        if(isEmpty()){
            System.out.println("Stack is Empty !");
            return -1;
        }
        int top = head.val;
        head = head.next;
        return top;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty !");
            return -1;
        }
        return head.val;
    }

    public void printele(){
        if(head == null){
            System.out.print("Stack is Empty !");
            return;
        }
        Node temp = head;

        while(temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("end");
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        stack.printele();
    }
}
