// finding the middle node of the linked list

package Data_structure.Linked_list;

public class H_middle_node_of_sll {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data= d;
            next=null;
        }
    }

    void print()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.print(n.data+"-->");
            n=n.next;
        }
        System.out.print("Null");
    }

    void middle_node()
    {
        Node SlowPtr = head;
        Node FastPtr = head ;

        while(FastPtr!=null && FastPtr.next!=null)
        {
            SlowPtr= SlowPtr.next;
            FastPtr= FastPtr.next.next;
        }
        System.out.println();
        System.out.println("the middle node is : "+SlowPtr.data);

    }

    public static void main(String[] args) {
        H_middle_node_of_sll ll = new H_middle_node_of_sll();
        ll.head= new Node(10);
        ll.head.next= new Node (20);
        ll.head.next.next= new Node(30);
        ll.head.next.next.next= new Node(40);
//        ll.head.next.next.next.next= new Node(50);

        ll.print();
        ll.middle_node();

    }
}
