//Calculate Height Of Tree In Binary Tree
import java.util.*;
class HeightOfTree
{
    static class Node{
        int data;
        Node left,right;
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
        static Node builtTree(int data[])
        {
           idx++;
           if(idx>=data.length || data[idx]==-1)
           {
               return null;
           } 
           Node newNode=new Node(data[idx]);//root
           newNode.left=builtTree(data);
           newNode.right=builtTree(data);

           return newNode;
        }
        int heightTree(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int height1=heightTree(root.left);
            int height2=heightTree(root.right);
            
            int result=Math.max(height1,height2)+1;
            return result;
        }
    }
    public static void main(String[] args) {
        BinaryTree btree=new BinaryTree();
        int data[]={10,20,30,-1,-1,40,-1,-1,50,60,-1,-1,70};
        Node root=btree.builtTree(data);
        int height=btree.heightTree(root);
        System.out.println("Height of Tree is:"+height);
    }
}