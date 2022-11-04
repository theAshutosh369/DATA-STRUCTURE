// implementing the binary tree
// creating a tree
// recursive preorder traversal of the tree
// non recursive preorder traversal of the tree


package Data_structure.Tree;
import java.util.Stack;
public class a_implementation_of_tree {
        Node root;
        static class Node
        {
            int data; // generic type
            Node left,right;

            Node(int d)
            {
                data=d;
                left=null;
                right=null;
            }
        }
        void non_rec_preorder()
        {
            if(root==null)
            {
                return;
            }

            Stack<Node> stack = new Stack<>();
            stack.push(root);
            while(!stack.isEmpty())
            {
                Node temp = stack.pop();
                System.out.print(temp.data+" ");

                if(temp.right!=null)
                {
                    stack.push(temp.right);
                }
                if(temp.left!=null)
                {
                    stack.push(temp.left);
                }
            }
            System.out.println();
        }
        void rec_preorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            System.out.print(root.data+" ");
            rec_preorder(root.left);
            rec_preorder(root.right);
        }

    public void create_tree()
    {
        root = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);
        Node fourth = new Node(50);
        Node fifth = new Node(60);

        root.left= first;
        root.right= second;
        first.left=third;
        first.right= fourth;
        second.left= fifth;
    }

    public static void main(String[] args)
    {
        a_implementation_of_tree tree = new a_implementation_of_tree();
        tree.create_tree();

        tree.rec_preorder(tree.root);
        System.out.println();
        tree.non_rec_preorder();
    }
}
