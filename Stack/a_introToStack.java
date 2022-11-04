// printing the stack
// pushing the data in it
// poping data from top


package Data_structure.Stack;

public class a_introToStack {
    Node top=null;

    static class Node{
        int data;
        Node next ;

        Node(int d)
        {
            data= d;
            next=null;

        }
    }

    void push(int d)
    {
        Node new_node = new Node(d);
        if(top==null)
        {
            top=new_node;
            return;
        }
        new_node.next=top;
        top=new_node;
    }

    void pop()
    {
        if(top==null)
        {
            System.out.println("list is empty");
            return;
        }
        top=top.next;
    }

    void print()
    {
        Node n =top;
        while(n!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }

    }

    public static void main(String[] args) {
        a_introToStack stack = new a_introToStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.print();
        System.out.println("-------------------");
        stack.pop();
        stack.print();
    }
}
