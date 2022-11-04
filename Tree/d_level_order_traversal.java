// level order traversal of a tree

package Data_structure.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class d_level_order_traversal
{
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
        Node sixth = new Node(50);

        root=fr;
        fr.left= sec;
        fr.right=td;
        sec.left=fourth;
        sec.right=fifth;
        td.left=sixth;
    }
    void level_order_traversal()
    {
        if(root==null)
        {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty())
        {
            Node temp = q.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null)
            {
                q.offer(temp.left);
            }
            if(temp.right!=null)
            {
                q.offer(temp.right);
            }
        }
    }


    public static void main(String[] args) {
        d_level_order_traversal t = new d_level_order_traversal();
        t.create_tree();

        t.level_order_traversal();
    }
}
