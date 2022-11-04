// addition of two singly sorted linked lists

package Data_structure.linked_list;
public class O_addition_of_two_sll {


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

    static Node add_two_ll(Node a , Node b)
    {
        Node dummy = new Node(0);
        Node tail = dummy;
        int carry =0;

        while(a!=null || b!=null)
        {
            int x = (a!=null) ? a.data : 0;
            int y = (b!=null) ? b.data : 0;
            int sum = carry + x+y;
            carry=sum/10;

            tail.next= new Node(sum%10);
            tail= tail.next;

            if(a!=null) a = a.next;
            if(b!=null) b = b.next;
        }

        if(carry >0)
        {
            tail.next= new Node(carry );
        }
        return dummy.next;

    }


    public static void main(String[] args) {
        O_addition_of_two_sll l1 = new O_addition_of_two_sll();
        l1.append(7);
        l1.append(4);
        l1.append(9);
        System.out.println("1st ll : ");
        l1.print();



        O_addition_of_two_sll l2 = new O_addition_of_two_sll();
        l2.append(5);
        l2.append(6);
        System.out.println("2nd ll : ");
        l2.print();

        System.out.println("addition is : ");
        O_addition_of_two_sll res = new O_addition_of_two_sll();
        res.head=add_two_ll(l1.head , l2.head);
        res.print();


    }
}
