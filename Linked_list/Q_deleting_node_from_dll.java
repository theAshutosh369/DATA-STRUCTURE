// deleting first node of doubly linked list
// deleting last node of doubly linked list

package Data_structure.linked_list;
import java.sql.ClientInfoStatus;
public class Q_deleting_node_from_dll {
    Node head,tail;

    static class Node
    {
        int data ;
        Node next,prev;

        Node(int d)
        {
            data = d;
            next=null;
            prev=null;
        }
    }

    void push (int d)
    {
        Node new_node = new Node(d);

        // if list is empty
        if(head==null)
        {
            head=new_node;
            tail=new_node;
            return;
        }

        // for non empty list
        new_node.next = head;
        head.prev= new_node;
        head= new_node;
    }

    void append(int d)
    {
        Node new_node = new Node(d);

        // if empty list is present
        if(head==null && tail==null)
        {
            head=new_node;
            tail=new_node;
            return;
        }

        // for non empty list
        tail.next= new_node;
        new_node.prev = tail;
        tail = new_node;
    }

    void print_forward ()
    {
        Node n = head;

        // if list is empty
        if(n==null)
        {
            System.out.println("list is empty ! ");
            return;
        }

        // for non empty list
        while(n!=null)
        {
            System.out.print(n.data + "-->");
            n=n.next;
        }
        System.out.println("null");
        System.out.println();
    }

    void delete_first()
    {
        // empty list
        if(head==null)
        {
            System.out.println("list is empty ");
            return;
        }

        // only one node in list
        if(head==tail)
        {
            System.out.println("deleted "+ head.data);
            head=null;
            tail= null;
            return;
        }

        // for more than one node in list
        Node temp = head.next;
        temp.prev=null;
        head.next=null;
        System.out.println("deleted "+head.data);
        head= temp;

    }

    void delete_last( )
    {
        // if list is empty
        if(head==null && tail==null)
        {
            System.out.println("the list is empty ");
            return;
        }

        // if list contains only one node
        if(head==tail)
        {
            System.out.println("list conatains only one node ");
            System.out.println("deleted "+ head.data);
            tail=null;
            head=null;
            return;
        }

        // if list contains more than one node
        Node temp = tail.prev;
        System.out.println("deleted "+ tail.data);
        temp.next=null;
        tail.prev=null;
        tail= temp;

    }

    public static void main(String[] args) {
        Q_deleting_node_from_dll dll = new Q_deleting_node_from_dll();
        dll.push(10);
        dll.append(20);
        dll.push(5);
        dll.append(30);
        dll.append(40);
        dll.push(2);
        dll.print_forward();

        dll.delete_first();
        dll.print_forward();

        dll.delete_last();
        dll.print_forward();

    }
}
