//Reverse Linked List(Singly)
import java.util.*;
class SReverseLL
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
    void add(int data)
    {
       Node newnode=new Node(data);
       if(head==null)
       {
            head=newnode;
       }
       else
       {
           Node currentNode=head;
           while(currentNode.next!=null)
           {
               currentNode=currentNode.next;
           }
           currentNode.next=newnode;
       }
    }
    void Reverse()
    {
        if (head==null) {
            System.out.println("List is empty");
        }
        else
        {
            //at the start all nodes point to head
            Node currentNode=head;
            Node temp=head;
            Node nextNode=currentNode.next;            
            while(nextNode!=null)//upto nextNode is null
            {
                currentNode=nextNode;
                nextNode=nextNode.next;
                currentNode.next=temp;
                temp=currentNode;
            }
            System.out.println();
            System.out.println("Reverse Singly Linked List:");
    
             while(temp!=head)
            {
                 System.out.print(temp.data+"->");
                 temp=temp.next;
             }
            // last position head value display
            System.out.print(head.data);
        }
    }
    void display()
    {
        if(head==null)
        {
            System.out.println("Linked List is empty....");
        }
        else
        {
            Node temp=head;
            System.out.println("linked list:");
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.print("null");
        }
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        SReverseLL list=new SReverseLL();
        System.out.println("Enter Limit:");
        int n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
           int data=sc.nextInt();
           list.add(data);
       }
       list.display();
       list.Reverse();
    }
}