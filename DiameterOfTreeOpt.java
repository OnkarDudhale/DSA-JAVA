//Time Complexity:O(N)
import java.util.*;
class DiameterOfTreeOpt
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
       int idx=-1;
       Node buildTree(int data[])
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
    }
    static class TreeInfo
        {
           int ht;
           int dia;
           TreeInfo(int ht,int dia)
          {
            this.ht=ht;
            this.dia=dia;
           }
        }
       static TreeInfo calculateDiameter(Node root)
       {
           if(root==null)
           {
               return new TreeInfo(0,0);
           }
           TreeInfo left=calculateDiameter(root.left);
           TreeInfo right=calculateDiameter(root.right);
           
           int height=Math.max(left.ht,right.ht)+1;
           
           int diameterL=left.dia;
           int diameterR=right.dia;
           int diameterLR=left.ht+right.ht+1;

           int diameter=Math.max(diameterLR,Math.max(diameterL,diameterR));
           TreeInfo result=new TreeInfo(height,diameter);
           return result;
       }
       public static void main(String[] args) {
       BinaryTree btree=new BinaryTree();
       int data[]={10,20,30,-1,-1,40,-1,-1,50,60,-1,-1,70,-1,-1};
       Node root=btree.buildTree(data);
       System.out.println("Diameter of Tree is:"+calculateDiameter(root).dia);
   }
}

//OUTPUT:Diameter of Tree is:5