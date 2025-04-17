//Remove any position value from Linked List
import java.util.*;
class LLDelete
{
    Node head;
    class Node
    {
        String data;
        Node next;
        Node(String data)//constructor
        {
            this.data=data;
            this.next=null;
        }
    }
    void add(String data)
    {
        Node newnode=new Node(data);//constructor calling create newnode
        if(head==null)
        {
            head=newnode;
        }         
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("list is empty...");
        }
        else
        {
            Node temporaryNode=head;
            head=temporaryNode.next;
            temporaryNode=null;
        }
    }
    void deleteLast()
    {
        if(head==null)
        {
            System.out.println("list is empty...");
        }
        else
        {
            Node currentNode=head;
            while(currentNode.next.next!=null)
            {
               currentNode=currentNode.next;
            }
            currentNode.next=null;
        }
    }
    void deleteRandom(int position)
    {
        if(head==null)
        {
            System.out.println("list is empty..");
        }
        else
        {
            if(position==1)
            {
                deleteFirst();
            }
            else
            {
            int i=2;
            Node currentNode=head;
            while(i<position)
                {
                    currentNode=currentNode.next;
                    i++; 
                }
                Node temp=currentNode.next;
                currentNode.next=temp.next;
                temp=null;
            }
        }
    }
    void display()
    {
        if(head==null)
        {
            System.out.println("list is empty..");
        }
        else
        {
            Node currentNode=head;
            while(currentNode!=null)
            {
                System.out.print(currentNode.data+"\t");
                currentNode=currentNode.next;
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        LLDelete list=new LLDelete();
        list.add("this");
        list.add("is");
        list.add("linked");
        list.add("list");
        list.add("Data");
        list.add("structure");
        list.display();
        list.deleteFirst();
        System.out.println("First position value deleted:");
        list.display();
        System.out.println("Last position value deleted:");       
        list.deleteLast();
        list.display();
        System.out.println("Enter position to delete:");
        int position=sc.nextInt();
        list.deleteRandom(position);
        list.display();
    }
}