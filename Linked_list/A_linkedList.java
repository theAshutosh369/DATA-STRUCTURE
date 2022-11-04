// creation and traversal of linked list

package Data_structure.Linked_list;

class A_linkedList
{
    Node head;

    static class Node
    {
        int data;
        Node next;

        Node(int d){
            this.data=d;
            next =null;
        }
    }
    void print()
    {
        Node n = head ;
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n=n.next;
        }
    }

    public static void main(String[] args) {

        A_linkedList ll = new A_linkedList();
        //creating the nodes n inserting data in nodes
        ll.head = new Node(10);
        Node s = new Node(20);
        Node t = new Node(30);

        // connecting the nodes
        ll.head.next = s;
        s.next=t;

        ll.print();
    }
}
