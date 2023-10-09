import java.util.Scanner;
class StackLL
{
    Node head;
    class Node
    {
      int data;
      Node next;
      Node(int data)
      {
          this.data=data;
          this.next=null;
      }
    }    
    boolean isEmpty()
    {
        if(head==null)
        return true;
        else
        return false;
    }
    void push(int data)
    {
        Node newnode=new Node(data);
        if(isEmpty())
        {
            head=newnode;
            return;
        } 
          //[30]->[20]->[10]->null
            newnode.next=head;
            head=newnode;
    }
    int pop()
    {
        int top=0;
        if(isEmpty())
        {
            return -1;
        }  
        else
        {
            top=head.data;
            head=head.next;
        }
        return top;
    }
    void peek()
    { 
       int topElement=pop();
       System.out.println(topElement);
    }

    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        StackLL sl=new StackLL();

        System.out.println("Enter Limit for Stack elements:");
        int n=sc.nextInt();
        System.out.println("Enter Elements in stack:");
        for(int i=0;i<n;i++)
        {
            int data=sc.nextInt();
            sl.push(data);//push element in stack
        }
        while(!sl.isEmpty())
        {
            sl.peek();
        }
    }
}