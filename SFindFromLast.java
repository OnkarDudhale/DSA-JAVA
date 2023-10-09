import java.util.Scanner;
//find position in (singly)linked list from last and remove element of that position
class SFindFromLast
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
    void removeElement(int pos,int n)
    {
        Node current=head;
        Node temp=head;
        int i;
        int position=n-pos;
        
        if(position==0)
        {
            current=current.next;
            head=current;
            temp=null;
        }
        else
        {
        for(current=head,i=1;i<position;current=current.next,i++);
        temp=current.next;
        current.next=temp.next;
        temp=null;
        }
    }
    void display()
    {
        Node current=head;
        System.out.println("Delete Element from Last:");
        while(current!=null)
        {
            System.out.print(current.data+"\t");
            current=current.next;
        }
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        SFindFromLast obj=new SFindFromLast();
        System.out.println("Enter Limit:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int data=sc.nextInt();
            obj.add(data);
        }
        System.out.println("Number Of elements:");
        System.out.println(n);
        System.out.println("Enter position:");
        int Position=sc.nextInt();
        obj.removeElement(Position,n);
        obj.display();
    }
}