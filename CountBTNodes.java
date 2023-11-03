import java.util.*;
class CountBTNodes
{
    static class Node{
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
        void inorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
        int countNodes(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int leftCount=countNodes(root.left);
            int rightCount=countNodes(root.right);

            return leftCount+rightCount+1;
        }
    }
    public static void main(String[] args) {
        BinaryTree btree=new BinaryTree();
        int data[]={10,20,30,-1,-1,40,-1,-1,50,-1,-1};
        Node root=btree.buildTree(data);
        System.out.println("inorder of Binary tree:");
        btree.inorder(root);
        int count=btree.countNodes(root);
        System.out.println("Count of all Nodes is:"+count);
    }
}