//Binary Tree Travarsal
class BinaryTravarsal
{
    public static class Node{
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
    public static class binaryTree   //build tree in PreOrder
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
      void preorder(Node root)
      {
          if(root==null)
          {
              return;
          }
          System.out.print(root.data+"\t");
          preorder(root.left);
          preorder(root.right);
      }
      void inorder(Node root)
      {
          if(root==null)
          {
              return;
          }
          inorder(root.left);
          System.out.print(root.data+"\t");
          inorder(root.right);
      }
      void postorder(Node root)
      {
          if(root==null)
          {
              return;
          }
          postorder(root.left);
          postorder(root.right);
          System.out.print(root.data+"\t");
      }
    }   
    public static void main(String[] args) {
       int data[]={10,20,30,-1,-1,40,-1,-1,70,60,-1,-1,80,-1,-1};
       binaryTree tree=new binaryTree();
       Node root=tree.buildTree(data);
       System.out.println(root.data); 
       System.out.println("Preorder travarsal:");
       tree.preorder(root);
       System.out.println();
       System.out.println("Inorder travarsal:");
       tree.inorder(root);
       System.out.println();
       System.out.println("Postorder travarsal:");
       tree.postorder(root);
    }
} 