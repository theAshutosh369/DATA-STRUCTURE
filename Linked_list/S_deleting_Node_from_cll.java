// deleting the node from circular linked list

package Data_structure.linked_list;
public class S_deleting_Node_from_cll {
    Node last;

    static class Node{
        int data ;
        Node next;
        Node(int d)
        {
            data = d;
            next=null;
        }
    }

    void append(int d)
    {
        Node new_node = new Node(d);
        if(last==null)
        {
            last=new_node;
            last.next=last;
            return;
        }

        new_node.next=last.next;
        last.next=new_node;
        last=new_node;
    }

    void print()
    {
        Node n = last.next;
        if(last==null)
        {
            System.out.println("list is empty !");
            return;
        }
        while(n!=last)
        {
            System.out.print(n.data+"-->");
            n=n.next;
        }
        System.out.print(n.data+"-->");
        System.out.println("return to "+last.next.data);
        System.out.println();
    }

    void delete_first()
    {
        Node temp = last.next;
        if(last==null)
        {
            System.out.println("list is empty ");
            return;
        }
        if(last.next==last)
        {
            System.out.println("deleted "+ last.data);
            last.next=null;
            last=null;
        }
        System.out.println("deleted "+last.next.data);
        last.next= temp.next;
    }

    public static void main(String[] args)
    {
        S_deleting_Node_from_cll cll = new S_deleting_Node_from_cll();

        cll.append(10);
        cll.append(20);
        cll.append(30);
        cll.append(40);
        cll.print();

        cll.delete_first();
        cll.print();

        cll.delete_first();
        cll.print();
        cll.delete_first();
        cll.print();
        cll.delete_first();
        cll.print();
    }
}
