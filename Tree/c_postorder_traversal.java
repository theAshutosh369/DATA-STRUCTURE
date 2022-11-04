// recursive and iterative postorder traversal of tree

package Data_structure.Tree;
import java.util.Stack;
public class c_postorder_traversal {

    Node root;
    static class Node{
        int data;
        Node left,right;

        Node(int d)
        {
            data=d;
            left=right=null;
        }
    }

    void create_tree()
    {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);
        Node seventh = new Node(70);


        root=first;
        first.left=second;
        first.right=third;
        second.left= fourth;
        second.right=fifth;
        third.left=sixth;
        third.right=seventh;


    }

    void rec_postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        rec_postorder(root.left);
        rec_postorder(root.right);
        System.out.print(root.data+" ");
    }

    void iterative_postorder()
    {
        if(root==null)
        {
            return;
        }
        Node current = root;
        Stack<Node> stack = new Stack<>();

        while(current!=null || !stack.isEmpty())
        {
            if(current!=null)
            {
                stack.push(current);
                current= current.left;
            }
            else
            {
                Node temp = stack.peek().right;
                if(temp==null)
                {
                    temp = stack.pop();
                    System.out.print(temp.data+" ");
                    while(!stack.isEmpty() && temp== stack.peek().right)
                    {
                        temp= stack.pop();
                        System.out.print(temp.data+" ");
                    }
                }
                else{
                    current=temp;
                }
            }
        }
    }
    public static void main(String[] args) {

        c_postorder_traversal t = new c_postorder_traversal();
        t.create_tree();

        System.out.println("recursive postorder traversal :");
        t.rec_postorder(t.root);
        System.out.println();

        System.out.println("iterative postorder traversal :");
        t.iterative_postorder();
    }
}
