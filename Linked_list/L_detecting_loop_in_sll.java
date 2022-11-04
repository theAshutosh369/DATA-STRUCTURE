// detecting the loop in linked list (floy's cycle detection algorithm)
// finding the start of the loop


package Data_structure.Linked_list;
public class L_detecting_loop_in_sll
{

    Node head;
    static class Node {
        int data;
        Node next;

        Node(int d){
            data =d ;
            next=null;
        }
    }

    void push(int d)
    {
        Node new_node = new Node(d);
        new_node.next = head;
        head = new_node;
    }

    void print()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.print(n.data+"-->");
            n=n.next;
        }
        System.out.print("null");
        System.out.println();
    }

    boolean detect_loop()
    {
        Node fastPtr = head;
        Node slowPtr = head;

        while(fastPtr!=null && fastPtr.next!=null)
        {
            fastPtr= fastPtr.next.next;
            slowPtr= slowPtr.next;

            if(slowPtr==fastPtr)
            {
                System.out.println("loop detected ");
                start_of_loop(slowPtr);
                return true;
            }
        }
        return false;
    }

    void start_of_loop(Node slowPtr)
    {
        Node temp = head;
        while(slowPtr!=temp)
        {
            temp= temp.next;
            slowPtr= slowPtr.next;
        }
        System.out.println("start of the loop is : "+ slowPtr.data);
    }


    public static void main(String[] args)
    {
        L_detecting_loop_in_sll ll = new L_detecting_loop_in_sll();
        ll.head = new Node(10);
        Node sec = new Node(20);
        Node t  = new Node(30);
        Node fo = new Node(40);
        Node fi = new Node(50);
        Node six = new Node(60);

        ll.head.next= sec;
        sec.next= t;
        t.next=fo;
        fo.next=fi;
        fi.next=six;
        six.next= t;

//        ll.print();
        ll.detect_loop();

    }
}
