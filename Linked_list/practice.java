package Data_structure.linked_list;

public class practice {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            this.data= d;
            next=null;

        }
    }

    void InsertFirst(int d)
    {
        Node new_node = new Node(d);
        new_node.next= head;
        head= new_node;
    }
    void InsertBetween1(int d, Node pre_node)
    {
        Node new_node =new Node(d);
        new_node.next= pre_node.next;
        pre_node.next= new_node;

    }
    void InsertBetween2(int d , int pos)
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

    void InsertEnd(int d)
    {
        Node new_node = new Node(d);
        if(head==null)
        {
            new_node=head;
            return;
        }


        Node last= head;
        while(last.next!=null)
        {
            last = last.next;
        }
        last.next= new_node;

    }

    void print()
    {
        Node n = head;
        while( n!=null)
        {
            System.out.print(n.data + "--> ");
            n= n.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        practice ll = new practice();
        ll.head=new Node(10);
        Node s = new Node(30);
        Node t = new Node(40);

        ll.head.next= s;
        s.next=t;

        ll.InsertEnd(50);
        ll.InsertFirst(1);
        ll.InsertBetween1(35,ll.head.next.next.next);
        ll.InsertBetween2(32,3);

        ll.print();
    }
}
