import java.util.*;
class SLLSort
{
    Node head;
    class Node//like struct in c
    {
       int data;
       Node next;
       Node(int data)
       {
           this.data=data;
           this.next=null;
       }
    }
    void sort() //Bubble Sort
    {
        Node temp=head;
        Node current=head;
        int sort;
        
        while (current!=null) {
            temp=head; // Reset temp to the beginning of the list in each pass
            
            while (temp.next!=null) {
                if (temp.data>temp.next.data) {
                    sort=temp.data;
                    temp.data=temp.next.data;
                    temp.next.data=sort;
                }
                temp=temp.next;
            }
            current=current.next;
        }
        
        temp=head;
        while(temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
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
        SLLSort list=new SLLSort();
        for(int i=1;i<=5;i++)
        {
            int data=sc.nextInt();
            list.add(data);
        }
        list.display();
        list.sort();
    }
}