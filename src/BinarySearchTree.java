import java.util.Scanner;

/**
 * Created by shahsparx on 17/3/17.
 */
class Node
{
    int data;
    Node left;
    Node right;
    public Node(int data)
    {
        this.data=data;
        left = null;
        right = null;
    }
}

public class BinarySearchTree {
    public static Node root;
    public BinarySearchTree()
    {
        this.root=null;
    }

    public void insert(int id)
    {
        Node newNode = new Node(id);
        if (root==null)
        {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent = null;

        while(true)
        {
            parent = current;
            if (id<current.data)
            {
                current = current.left;
                if (current == null)
                {
                    parent.left = newNode;
                    return;
                }
            }
            else
            {
                current = current.right;
                if (current == null)
                {
                    parent.right=newNode;
                    return;
                }
            }
        }
    }
    public void display(Node root){
        if(root!=null){
            display(root.left);
            System.out.print(root.data+" ");
            display(root.right);
        }


    }

    public int treeHeight(Node root){
        if(root==null)return 0;
        return (1+ Math.max(treeHeight(root.left),treeHeight(root.right)));
    }
    public static void main(String[] args) throws Exception
    {
        BinarySearchTree b = new BinarySearchTree();
        BSTHeight bsth = new BSTHeight();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =0;i<n;i++)
        {
            b.insert(sc.nextInt());
        }
        System.out.println(bsth.maxDepth(root));

    }
}


