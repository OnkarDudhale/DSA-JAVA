//Add Elements in linked list in any position
import java.util.*;
class LinkedList
{
    Node head;    
    class Node
    {
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
        } 
    }
    void addFirst(String data)
    {
        Node newnode=new Node(data);//create newnode of data(String)
        if(head==null)
        {
        head=newnode;
        }
        else
        {
        newnode.next=head;
        head=newnode;
        }
    }
    void addLast(String data)
    {
        Node newnode=new Node(data);//create newnode of data(String)
        if(head==null)
        {
        head=newnode;
        }
        else
        {
        Node currentNode=head;
        while(currentNode.next!=null)
        currentNode=currentNode.next;
        
        currentNode.next=newnode;
        }
    }
    void display()
    {
        if(head==null)
        System.out.println("Linked list is empty.....");

        Node currentNode=head;
        while(currentNode!=null)
        {
            System.out.print(currentNode.data+"\t");
            currentNode=currentNode.next;
        }
        System.out.println();
    }
    void addRandom(String data,int position)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            System.out.println("Linked is empty...");
        }
        else
        {
            Node currentNode=head;
            if(position==1)
            {
                addFirst(data);
            }
            else
            {
            for(int i=2;i<position;i++)
                {
                currentNode=currentNode.next;
                }
            newnode.next=currentNode.next;
            currentNode.next=newnode;
            }
        }
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        LinkedList obj=new LinkedList();
        obj.addFirst("a");
        obj.addFirst("is");
        obj.addLast("LinkedList");
        obj.addFirst("This");
        obj.display();
        System.out.println("Enter Position to add String in List:");
        int position=sc.nextInt();
        obj.addRandom("Data Structure",position);
        obj.display();
    }
}