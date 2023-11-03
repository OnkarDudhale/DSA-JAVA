//check SubTree TO another subtree
import java.util.*;
class SubTreeOfTree
{
    static class Node
    {
       int data;
       Node left;
       Node right;
       Node(int data)
       {
           this.data=data;
       }
    }
    static class BinaryTree
    {
        static int idx=-1;
        static int index=-1;
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
        static Node buildSubTree(int dat[])
        {
            index++;
            if(dat[index]==-1)
            {
                return null;
            }
            Node newNode=new Node(dat[index]);
            newNode.left=buildSubTree(dat);
            newNode.right=buildSubTree(dat);

            return newNode;
        }
    }
    public static boolean isIdentical(Node root,Node subRoot)
    {
        if(root==null && subRoot==null)
        {
            return true;
        }
        if(root==null || subRoot==null)
        {
            return false;
        }
        if(root.data==subRoot.data)
        {
            return isIdentical(root.left,subRoot.left) &&  isIdentical(root.right,subRoot.right);
        }
        return false;
    }
    public static boolean subTree(Node root,Node subRoot)//check main root and subRoot root
    {
         if(subRoot==null)
         {
             return true;
         }
         if(root==null)
         {
             return false;
         }
         if(root.data==subRoot.data)
         {
             if(isIdentical(root,subRoot))
             {
                 return true;
             }
         }
         return subTree(root.left,subRoot) || subTree(root.right,subRoot);
    }
    public static void main(String[] args) {
        BinaryTree btree=new BinaryTree();
        int data[]={10,20,30,-1,-1,40,-1,-1,50,60,-1,-1,70,-1,-1};
        Node root=btree.buildTree(data);
        int dat[]={20,30,-1,-1,40,-1,-1};
        Node subRoot=btree.buildSubTree(dat);
        if(subTree(root,subRoot))
        {
            System.out.println("SubTree found...");
        }
        else
        {
            System.out.println("Not found SubTree..");
        }
    }
}