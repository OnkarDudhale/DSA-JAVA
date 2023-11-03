/*in tree root is top most element node this is important or main part of tree which connected to other
nodes using root node we can access other element which connected to that node*/
//Level wise traversal 
import java.util.*;
class LevelWiseTraversal
{
    public static class Node
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
    public static class BinaryTree
    {
        static int idx=-1; 
        Node buildTree(int data[])
        {
            idx++;
            if(idx>=data.length||data[idx]==-1)
            {
                return null; 
            }
            Node newNode=new Node(data[idx]);
            newNode.left=buildTree(data);
            newNode.right=buildTree(data);

            return newNode;
        }
        void levelWise(Node root)
        {
            int level=1;
            Node temp;
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            System.out.print("Level="+level+"\t");
            while(!q.isEmpty())
            {
                temp=q.remove();//built in function automatically remove element one by one
               if(temp==null)
               {
                   level++;
                   if(!q.isEmpty())
                   {
                       q.add(null);
                       System.out.println();
                       System.out.print("Level:"+level+"\t");
                   }
               }
               else
               {
                  System.out.print(temp.data+"\t");
                  if(temp.left!=null)
                  q.add(temp.left);
                  if(temp.right!=null)
                  q.add(temp.right);
               }
            }
        }
    }
    public static void main(String[] args) {
         BinaryTree btree=new BinaryTree();
         int data[]={10,20,30,-1,-1,40,-1,-1,50,60,-1,-1,70,-1,-1};
         Node root=btree.buildTree(data);
         btree.levelWise(root);      
    }
}