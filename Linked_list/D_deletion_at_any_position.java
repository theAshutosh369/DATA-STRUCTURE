// deleting a node at any position

package Data_structure.linked_list;
import org.w3c.dom.Node;

import java.util.Scanner;

public class D_deletion_at_any_position {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next=null;
        }
    }
    public void push(int d)
    {
        Node new_node = new Node(d);
        new_node.next=head;
        head=new_node;
    }
    public void pushAtEnd(int d)
    {
        Node new_node = new Node(d);
        new_node.next=null;

        Node last = head;
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=new_node;
        return;
    }

    public void pushBetween(int d, Node pre_node)
    {
        Node new_node= new Node(d);
        new_node.next= pre_node.next;
        pre_node.next=new_node;

    }

    public void print()
    {
        Node n = head;
        while (n != null) {
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println();
    }
//    public void deleteAtAnyPos(int pos)
//    {
//        if(head==null)
//        {
//            return;
//        }
//        Node temp = head;
//
//        if(pos==0)
//        {
//            head= temp.next;
//            return;
//        }
//        for(int i=0;temp!= null && i<pos-1;i++)
//        {
//            temp=temp.next;
//        }
//
//        if(temp==null || temp.next==null)
//        {
//            return;
//        }
//        Node next = temp.next.next;
//        temp.next= next;
//
//    }

    void deleteAtAnyPosition(int pos)
    {
        if(pos==1)
        {
            head= head.next;
            return;
        }
        else
        {
            Node prev = head;
            int count=1;
            while(count<pos-1)
            {
                prev= prev.next;
                count++;
            }
            Node current = prev.next;
            prev.next= current.next;
            return;
        }
    }

    public static void main(String[] args) {

        D_deletion_at_any_position ll = new D_deletion_at_any_position();
        ll.head=new Node(20);
        Node s = new Node(30);
        Node t = new Node(50);

        ll.head.next=s;
        s.next=t;
        ll.push(10);
        ll.push(5);
        ll.push(3);

        ll.print();
        int c =1;
        Scanner sc = new Scanner(System.in);
        while(c!=0) {
            System.out.print("enter the position :");
            int pos = sc.nextInt();

            ll.deleteAtAnyPosition(pos);
            ll.print();
        }


    }
}
