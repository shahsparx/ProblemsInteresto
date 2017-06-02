/**
 * Created by shahsparx on 20/3/17.
 */
public class LCAofaBST {
    Node root;
    // Function to find LCA of n1 and n2
    Node lca(Node node,int n1,int n2)
    {
        if (node == null)
        {
            return null;
        }

        if (node.data>n1 && node.data>n2)
            return lca(node.left,n1,n2);

        if (node.data<n1 && node.data<n2)
            return lca(node.right,n1,n2);

        return node;

    }

    public static void main(String[] agrs)
    {
        LCAofaBST tree = new LCAofaBST();
        tree.root = new Node(4);
        tree.root.left = new Node(7);
        tree.root.right = new Node(8);
        tree.root.left.left = new Node(6);
        tree.root.left.right = new Node(3);

        int n1 = 3,n2=7;
        Node t = tree.lca(tree.root,n1,n2);
        System.out.println("LCA  : "+t.data);
    }
}
