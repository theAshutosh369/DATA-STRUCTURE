package Data_structure.Linked_list;

public class K_Inserting_node_in_sorted_sll {

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

    void insert(int d)
    {
        Node new_node = new Node(d);
        Node cur = head;
        Node temp = null;

        while(cur!=null && cur.data < d)
        {
            temp= cur;
            cur= cur.next;
        }
        new_node.next =cur;
        temp.next= new_node;

    }

    public static void main(String[] args)
    {
        K_Inserting_node_in_sorted_sll ll = new K_Inserting_node_in_sorted_sll();
        ll.push(60);
        ll.push(50);
        ll.push(40);
        ll.push(30);
        ll.push(20);
        ll.push(10);

        ll.print();
        ll.insert(35);
        ll.print();

    }
}
