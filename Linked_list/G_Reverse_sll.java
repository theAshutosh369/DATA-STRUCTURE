// reversing the linked list

package Data_structure.Linked_list;
public class G_Reverse_sll {
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

    void reverse_n_print(Node n)
    {
        Node prev= null;
        Node current = n;
        Node next = null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        n=prev;

        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println();
    }


//    public void reverse()
//    {
//        Node cur = head;
//        Node pre =null;
//        Node next = null;
//
//        while(cur!=null)
//        {
//            next = cur.next;
//            cur.next= pre;
//            pre=cur;
//            cur= next;
//        }
    // pre head hojayega reverse ll ka 
//
//        Node n = pre;
//        while(n!=null)
//        {
//            System.out.print(n.data+"-->");
//            n=n.next;
//        }
//    }


    public static void main(String[] args) {
        G_Reverse_sll ll = new G_Reverse_sll();
        ll.head = new Node(10);
        ll.head.next=new Node(20);
        ll.head.next.next= new Node(30);
        ll.head.next.next.next= new Node(40);

        ll.reverse_n_print(ll.head);
//        ll.reverse();

    }
}
