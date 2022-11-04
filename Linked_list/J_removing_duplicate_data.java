// removing duplicate data from the linked list
package Data_structure.Linked_list;
public class J_removing_duplicate_data {
    Node head;
    static class Node {
        int data;
        Node next;

        Node(int d){
            data =d ;
            next=null;
        }
    }

    void push(int d)
    {
        Node new_node = new Node(d);
        new_node.next = head;
        head = new_node;
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

    void remove_duplicate()
    {
        Node cur = head;
        while(cur!=null && cur.next!=null)
        {
            if(cur.data== cur.next.data)
            {
                cur.next=cur.next.next;
            }
            else
            {
                cur=cur.next;
            }
        }
    }


    public static void main(String[] args) {
        J_removing_duplicate_data ll = new J_removing_duplicate_data();

        ll.push(10);
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);
        ll.push(40);
        ll.push(50);
        ll.push(50);
        ll.push(60);
        ll.push(60);

        ll.print();

        ll.remove_duplicate();
        System.out.println("after removing the duplicate nodes ll is : ");
        ll.print();


    }
}
