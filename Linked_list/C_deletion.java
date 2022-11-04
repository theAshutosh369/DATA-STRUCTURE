// deleting a node

package Data_structure.Linked_list;

public class C_deletion {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next= null;
        }
    }
    void push(int d)
    {
        Node new_node = new Node(d);
        new_node.next= head;
        head=new_node;
    }

    void delete( int d)
    {
        // 3 cases are possible
        // 1st : if list is empty
        // 2nd : if the node to be deleted is head
        // 3rd : any node besides head
        Node temp = head, prev = null;

        // 1st -
        if(temp==null)
        {
            System.out.println("no list present ");
            return;
        }

        // 2nd -
        if(temp!=null && temp.data==d)
        {
            head = temp.next;
            return;
        }

        // 3rd -
        while( temp !=null && temp.data!=d)
        {
            prev=temp;
            temp= temp.next;
        }
        prev.next= temp.next;

    }
    void print()
    {
        Node n = head;
        while ((n!=null))
        {
            System.out.print(n.data+" ");
            n= n.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        C_deletion ll = new C_deletion();
        ll.head=new Node(20);
        Node s = new Node(30);
        Node t = new Node(40);

        ll.head.next=s;
        s.next=t ;

        ll.print();
        // 20 30 40
        ll.delete(20);
        ll.print();
        ll.push(200);
        ll.push(300);
        ll.push(400);
        ll.push(500);
        ll.delete(30);
        ll.print();
        ll.delete(40);
        ll.print();

    }
}
