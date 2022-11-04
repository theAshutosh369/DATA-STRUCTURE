// circular singly linked list -
// last node of sll points to first node of it
// instead of head, we keep track of last node in circular sll

// pushing n appending nodes in cll

package Data_structure.linked_list;

import java.util.NoSuchElementException;

public class R_circular_singly_linked_list {

    Node last;

    static class Node
    {
        int data ;
        Node next;
        Node(int d)
        {
            data= d;
            next= null;
        }
    }
    void push(int d)
    {
        Node new_node = new Node(d);
        if(last == null)
        {
            last=new_node;
            last.next=last;
            return;
        }
        new_node.next= last.next;
        last.next=new_node;
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
            throw new NoSuchElementException();
        }
        while(n!=last){
            System.out.print(n.data+"-->");
            n=n.next;
        }
        System.out.print(n.data+"-->");
        System.out.print("return to"+last.next.data);
    }
    public static void main(String[] args) {
        R_circular_singly_linked_list cll = new R_circular_singly_linked_list();
//        cll.append(10);
//        cll.append(20);
//        cll.append(30);
//        cll.append(40);
//
//        cll.push(5);
//        cll.push(2);
//        cll.push(1);

        cll.print();

    }
}
