// insertion of node at any position

package Data_structure.Linked_list;
public class B_insertion {
    Node head;
    static class Node
    {
        int data ;
        Node next;
        Node(int d)
        {
            data= d;
            next=null;
        }
    }
    void pushAtFront(int d)
    {
        Node new_node = new Node(d);
        new_node.next=head;
        head=new_node;
    }
    void pushBetween(int d,Node pre_node)
    {
        Node new_node = new Node(d);
        new_node.next= pre_node.next;
        pre_node.next= new_node;
    }

    void InsertBetweenByPosition(int d , int pos)
    {
       Node new_node = new Node(d);
        if(pos==1)
        {
            new_node.next=head;
            head=new_node;
        }

        Node pre = head;
        for(int n=1; n<pos;n++)
        {
            pre = pre.next;
        }
        Node current = pre.next;
        pre.next= new_node;
        new_node.next=current;
    }


    void pushAtEnd(int d)
    {
        if(head==null)
        {
            head = new Node(d);
            return;
        }
        Node new_node = new Node(d);
        new_node.next=null;

        Node last = head;
        while(last.next!=null)
        {
            last = last.next;
        }
        last.next=new_node;
        return;
    }

    void print()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.print(n.data +"--> ");
            n=n.next;
        }
        System.out.print("null");
        System.out.println();
    }


    public static void main(String[] args) {
        B_insertion ll = new B_insertion();
        ll.head = new Node(10);
        Node s = new Node(30);
        Node t = new Node(40);

        ll.head.next=s;
        s.next=t;
        ll.print();
        // 10 30 40

        ll.pushAtFront(25);
        ll.print();
        // 25 10 30 40

        ll.pushBetween(38,ll.head.next.next);
        ll.print();
        // 25 10 30 38 40

        ll.pushAtEnd(80);
        ll.print();
        // 25 10 30 38 40 80

        ll.pushBetween(100,ll.head.next.next.next);
        ll.print();
        // 25 10 30 38 100 40 80

        ll.InsertBetweenByPosition(300,4);
        ll.print();
        // 25 10 30 38 300 100 40 80

    }
}
