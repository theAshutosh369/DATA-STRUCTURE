// finding the maximum value Node in the tree

package Data_structure.Tree;
public class e_max_value_in_tree {

    Node root;
    static class Node{
        int data;
        Node left,right;
        Node(int d)
        {
            data =d ;
            left=right=null;
        }
    }

    void create_tree()
    {
        Node fr = new Node(10);
        Node sec = new Node(30);
        Node td = new Node(20);
        Node fourth = new Node(60);
        Node fifth = new Node(40);
        Node sixth = new Node(90);

        root=fr;
        fr.left= sec;
        fr.right=td;
        sec.left=fourth;
        sec.right=fifth;
        td.left=sixth;
    }

    // method to find max value
    int find_max(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int res = root.data;
        int left = find_max(root.left);
        int right = find_max(root.right);
        if(left>res)
        {
            res=left;
        }
        if(right>res)
        {
            res=right;
        }
        return res;
    }

    public static void main(String[] args)
    {
        e_max_value_in_tree t = new e_max_value_in_tree();
        t.create_tree();
        System.out.println("maximum value is :"+ t.find_max(t.root));
    }
}
