// finding the length of linked list
// searching an element in ll


package Data_structure.Linked_list;


import java.util.Scanner;

public class E_length_of_sll_n_searching_element {
    Node head;

     static class Node{
        int data;
        Node next ;
        Node(int d){
            data = d ;
            next= null;
        }
    }
    void push(int d)
    {
        Node new_node = new Node(d);
        new_node.next =head;
        head = new_node;

    }
    void pushEnd(int d)
    {
        Node new_node = new Node(d);
        Node last = head;
        new_node.next= null;
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=new_node;

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
    void non_rec_count()
    {
        Node current = head ;
        int c =0;
        while(current!=null)
        {
            c=c+1;
            current=current.next;
        }
        System.out.println("length of ll by non recursive method is : "+c);
    }
    int rec_count(Node n)
    {
        if(n==null)
        {
            return 0;
        }
        else return 1+rec_count(n.next);
    }

    public void search_element( int d)
    {
        Node temp = head;
        int count = 1;
        if(temp==null)
        {
            System.out.println("no linked list is present");
            return;
        }
        while(temp.next!=null && temp.data!= d)
        {
            temp= temp.next;
            count++;
        }

        if(temp.data==d)
        {
            System.out.println("element found ! its at position : "+ count);
        }
        else{
            System.out.println("element not found");
        }
    }

    void search(int d)
    {
        int count=1;
        Node current = head;
        while(current!=null)
        {
            if(current.data==d)
            {
                System.out.println("element found at position : "+ count);
                return;
            }
            current=current.next;
            count++;
        }

        System.out.println("not found ");
    }
    public static void main(String[] args) {
        E_length_of_sll_n_searching_element ll = new E_length_of_sll_n_searching_element();
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);
        ll.push(50);
        ll.pushEnd(70);
        ll.pushEnd(80);
        ll.pushEnd(90);

        ll.print();
        ll.non_rec_count();

        System.out.println("length of ll by recursive method is : "+ll.rec_count(ll.head));

        System.out.print("enter the element to be searched :");
        Scanner s = new Scanner(System.in);
        int ele = s.nextInt();
//        ll.search_element(ele);
        ll.search(ele);
// donhi paiki ek vapra
    }
}
