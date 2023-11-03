//Time Complexity:O(N^2)
import java.util.*;
class DiameterOfTree
{
    static class Node
    {
       int data;
       Node left;
       Node right;
       Node(int data)
       {
         this.data=data;
         this.left=null;
         this.right=null;
       }
    }
    static class BinaryTree
    {
        static int idx=-1;
        static Node buildTree(int data[])
        {
            idx++;
            if(data[idx]==-1)
            {
                return null;
            }
            Node newNode=new Node(data[idx]);
            newNode.left=buildTree(data);
            newNode.right=buildTree(data);
           
            return newNode;
        }
        int heightOfTree(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int h1=heightOfTree(root.left);
            int h2=heightOfTree(root.right);
            int highHeight=Math.max(h1,h2)+1;

            return highHeight;
        }
        int diameterOfTree(Node root)
        {
            if(root==null){
                return 0;
            }
            int d1=diameterOfTree(root.left);
            int d2=diameterOfTree(root.right);
            int d3=heightOfTree(root.left)+heightOfTree(root.right)+1;

            int high=Math.max(d3,Math.max(d1,d2));

            return high;
        }
    }
    public static void main(String[] args) {
        BinaryTree btree=new BinaryTree();
        int data[]={10,20,30,-1,-1,40,-1,-1,50,60,-1,-1,70,-1,-1};
        Node root=btree.buildTree(data);
        int diameter=btree.diameterOfTree(root);
        System.out.println("Diameter of Tree:"+diameter);
    }
}

//Output:Diameter of Tree:5