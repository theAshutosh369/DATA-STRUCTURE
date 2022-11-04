package Data_structure.Linked_list;

public class I_nth_Node_from_end_of_sll
{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    void push(int d)
    {
        Node new_node = new Node(d);
        new_node.next=head;
        head= new_node;
    }

    void print()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.print(n.data+" -->");
            n=n.next;
        }
        System.out.print("null");
        System.out.println();
    }

    void nth_node_from_end(int n)
    {
        Node mainPtr = head;
        Node refPtr = head;
        int count=0;

        while( count<n)
        {
            refPtr= refPtr.next;
            count++;
        }

        while(refPtr!=null){
            refPtr= refPtr.next;
            mainPtr=mainPtr.next;
        }
        System.out.println("the "+n+" node from end of linked list is : "+ mainPtr.data);
    }



    public static void main(String[] args)
    {
        I_nth_Node_from_end_of_sll ll = new I_nth_Node_from_end_of_sll();

        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);
        ll.push(50);

        ll.print();
        ll.nth_node_from_end(3);
    }
}
