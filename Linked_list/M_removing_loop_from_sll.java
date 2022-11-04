// removing the loop from singly linklist

package Data_structure.Linked_list;
public class M_removing_loop_from_sll
{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data= d;
            next=null;
        }
    }

    void append(int d)
    {
        Node new_node = new Node(d);
        if(head==null)
        {
            head= new_node;
            return;
        }
        Node last = head;
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next= new_node;

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
        Node slowPtr = head;
        Node fastPtr = head;
        while(fastPtr!=null && fastPtr.next!=null)
        {
            fastPtr= fastPtr.next.next;
            slowPtr= slowPtr.next;
            if(slowPtr==fastPtr)
            {
                System.out.println("loop detected ");
                if (slowPtr != null) {
                    remove_loop(slowPtr);
                }
                return true;

            }
        }

        return false;
    }
    void remove_loop(Node slowPtr)
    {
        Node temp = head;
        while(temp.next!=slowPtr.next)
        {
            temp=temp.next;
            slowPtr=slowPtr.next;
        }
        System.out.println("start loop node is : "+slowPtr.next.data);
        slowPtr.next=null;

    }


    public static void main(String[] args) {
        M_removing_loop_from_sll ll = new M_removing_loop_from_sll();
//        ll.append(10);
//        ll.append(20);
//        ll.append(30);
//        ll.append(40);
//        ll.append(50);
//        ll.append(60);
//        ll.head.next.next.next.next.next.next=ll.head.next.next;

        ll.head = new M_removing_loop_from_sll.Node(10);
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

        ll.detect_loop();
        ll.print();

    }
}


