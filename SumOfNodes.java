//Sum of Nodes in Binary tree
class SumOfNodes
{
    public static class Node
    {
        int data;
        Node right;
        Node left;
        Node(int data)
        {
            this.data=data;
            this.right=null;
            this.left=null;
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
        int sumOfNode(Node root)
        {
            if(root==null)
            {
            return 0;
            }
            int val1=sumOfNode(root.left);
            int val2=sumOfNode(root.right);

            return val1+val2+root.data;
        }
    }
    public static void main(String[] args) {
        BinaryTree btree=new BinaryTree();
        int data[]={10,20,30,-1,-1,40,-1,-1,50,60,-1,-1,70,-1,-1};
        Node root=btree.buildTree(data);
        System.out.print("Given Data is:");
        btree.inorder(root);
        System.out.println();
        int sum=btree.sumOfNode(root);
        System.out.println("Sum of all Nodes is:"+sum);
    }
}