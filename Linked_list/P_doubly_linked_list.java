// printing doubly linked list in forward n backword direction
// pushing and appending nodes in doubly linked list

package Data_structure.linked_list;

public class P_doubly_linked_list {
    Node head,tail;

    static class Node{
        int data ;
        Node next, prev;

        Node(int d)
        {
            data = d;
            prev=null;
            next=null;
        }
    }

    void print_straight()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.print(n.data+"-->");
            n= n.next;
        }
        System.out.println("null");
    }

    void print_reverse()
    {
        Node n = tail;
        while(n!=null)
        {
            System.out.print(n.data+"-->");
            n= n.prev;
        }
        System.out.println("null");
    }

    void push(int d )
    {
        Node new_node = new Node(d);
        if(head== null)
        {
            head = new_node;
            tail= new_node;
            return;
        }

        new_node.next= head;
        head.prev= new_node;
        head= new_node;

    }
   void append(int d)
    {
        Node new_node=new Node(d);
        if(head==null)
        {
            head = new_node;
            tail=new_node;
            return;
        }
        tail.next= new_node;
        new_node.prev= tail;
        tail= new_node;
    }

    public static void main(String[] args) {
        P_doubly_linked_list dll = new P_doubly_linked_list();
        dll.append(10);
        dll.append(20);
        dll.append(30);
        dll.append(40);
        dll.push(5);
        dll.push(3);
        dll.push(1);

        System.out.println("straight :");
        dll.print_straight();

        System.out.println();
        System.out.println("reverse :");
        dll.print_reverse();


    }

}
