// Java program to swap two given nodes of a linked list

package Data_structure.Linked_list;
public class F_swapping_of_nodes {
    Node head;
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

        void print()
        {
            Node n = head;
            while(n!=null)
            {
                System.out.print(n.data+" ");
                n= n.next;
            }
            System.out.println();
        }
        void push(int d)
        {
            Node new_node = new Node(d);
            new_node.next= head;
            head = new_node;
        }
        void swap(int x , int y)
        {
            if(x==y)
                return;

            Node cx=head,px=null;
            while(cx!=null && cx.next!=null)
            {
                px=cx;
                cx=cx.next;
            }
            Node cy=head,py=null;
            while(cy!=null && cy.next!=null)
            {
                py=cy;
                cy=cy.next;
            }

            if(cx==null || cy==null)
            {return;
            }
            if(px!=null)
                px.next=cy;
            else
                head=cy;

            if(py!=null)
                py.next=cx;
            else
                head=cx;

            Node temp = cx.next;
            cx.next=cy.next;
            cy.next=temp;
        }

        public static void main(String[] args) {
            F_swapping_of_nodes ll = new F_swapping_of_nodes();

            ll.push(10);
            ll.push(20);
            ll.push(30);
            ll.push(40);
            ll.push(50);
            ll.push(60);

            System.out.println("before swapping ll :");
            ll.print();

            ll.swap(30,50);
            System.out.println("after swapping ll :");
            ll.print();



        }

}
