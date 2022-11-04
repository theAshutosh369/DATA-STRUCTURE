// implementation of queue
// enqueue and dequeue
// printing elements of queue


package Data_structure.Queue;
public class a_implementation_of_queue {
    Node front=null,rear=null;

    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data= d;
            next=null;
        }
    }
    void enqueue(int d)
    {
        Node new_node = new Node(d);

        if(front==null)
        {
            front=new_node;
            rear=new_node;
            return;
        }
        if(front==rear)
        {
            rear=new_node;
            front.next= rear;
            return;
        }

        rear.next=new_node;
        rear=rear.next;
        return;
    }

    void dequeue()
    {
        if(front==null)
        {
            System.out.println("queue is empty");
            return;
        }
        if(front==rear)
        {
            System.out.println("dequeued "+ front.data);
            front=null;
            rear=null;
            return;
        }
        System.out.println("dequeued "+front.data);
        front=front.next;
        return;
    }

    void print()
    {
        Node n = front;
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        a_implementation_of_queue q = new a_implementation_of_queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.print();

        q.dequeue();
        q.print();

        q.dequeue();
        q.print();

        q.dequeue();
        q.print();
        q.dequeue();
        q.print();
        q.dequeue();
        q.print();
        q.dequeue();
        q.print();

        q.enqueue(50);

        q.print();






    }
}
