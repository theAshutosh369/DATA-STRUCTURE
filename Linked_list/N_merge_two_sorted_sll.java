// merging the 2 sorted singly linked list

package Data_structure.Linked_list;

public class N_merge_two_sorted_sll {

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
    static Node merge(Node a, Node b)
    {
        Node dummy = new Node(0);
        Node tail = dummy;

        while(a!=null && b!=null)
        {
            if(a.data <= b.data )
            {
                tail.next=a;
                a= a.next;
            }
            else
            {
                tail.next=b;
                b=b.next;
            }
            tail= tail.next;
        }

        if(a==null)
        {
            tail.next=b;

        }
        else {
            tail.next= a;

        }

        return dummy.next;
    }

    public static void main(String[] args) {
        N_merge_two_sorted_sll l1 = new N_merge_two_sorted_sll();
        l1.append(10);
        l1.append(20);
        l1.append(30);
        l1.append(40);
        System.out.println("1st sorted ll : ");
        l1.print();

        N_merge_two_sorted_sll l2 = new N_merge_two_sorted_sll();
        l2.append(5);
        l2.append(25);
        l2.append(35);
        l2.append(45);
        l2.append(55);
        l2.append(57);
        System.out.println("2nd sorted ll : ");
        l2.print();


        System.out.println("this is the merged linked list of the two given singly linked list :");
        N_merge_two_sorted_sll result = new N_merge_two_sorted_sll();
        result.head = merge(l1.head,l2.head);
        result.print();



    }
}
