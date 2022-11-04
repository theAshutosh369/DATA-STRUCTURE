package Data_structure.Tree;

public class f_binary_search_tree {

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
    void insert(int value)
    {
        root=insert_binary(root,value);
    }

    Node insert_binary(Node root, int value)
    {
        if(root==null){
            root=new Node(value);
            return root;
        }
        if(value< root.data)
        {
            root.left=insert_binary(root.left,value);
        }else
        {
            root.right=insert_binary(root.right,value);
        }
        return root;
    }

    void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {


        f_binary_search_tree t = new f_binary_search_tree();
        t.insert(80);
        t.insert(60);
        t.insert(50);
        t.insert(90);
        t.insert(100);
        t.insert(20);

        t.inorder(t.root);
    }
}
