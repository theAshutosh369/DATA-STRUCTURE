// iterative and recursive inorder traversal of tree

package Data_structure.Tree;
import java.util.Stack;
public class b_inorder_traversal {

    Node root;
    static class Node
    {
        int data ;
        Node left,right ;
        Node(int d)
        {
            data= d;
            left=right=null;
        }
    }

    void create_tree()
    {
        root= new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);
        Node fourth = new Node(50);

        root.left= first;
        root.right=second;
        first.left= third;
        second.right= fourth;

    }

    void rec_inorder(Node root)
    {
        if(root==null)
        {
            return;
        }

        rec_inorder(root.left);
        System.out.print(root.data+" ");
        rec_inorder(root.right);
    }

    void iterative_inorder()
    {
        if(root==null)
        {
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node temp = root;

        while(!stack.isEmpty() || temp!=null)
        {
            if(temp!=null)
            {
                stack.push(temp);
                temp= temp.left;
            }
            else
            {
                temp= stack.pop();
                System.out.print(temp.data+" ");
                temp=temp.right;
            }
        }
    }



    public static void main(String[] args) {
        b_inorder_traversal t = new b_inorder_traversal();

        t.create_tree();

        System.out.println("recursive inorder traversal of tree :");
        t.rec_inorder(t.root);
        System.out.println();

        System.out.println("iterative inorder traversal of tree :");
        t.iterative_inorder();


    }
}
