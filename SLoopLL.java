//Detect loop or cycle in Linked List and calculate Length of Linked List using Floyed Cycle Detection
import java.util.Scanner;
class SLoopLL
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
    // Function to detect a loop in the linked list
    boolean detectLoop() {
        Node slowRunner=head;
        Node fastRunner=head;

        while(slowRunner!=null && fastRunner!=null && fastRunner.next!=null) {
            slowRunner=slowRunner.next;
            fastRunner=fastRunner.next.next;

            if(slowRunner==fastRunner) {
                int length = calculateLoopLength(slowRunner);//call to calculate length
                System.out.println("Loop detected. Length is: " + length);
                return true;
            }
        }
        return false;
    }
    int calculateLoopLength(Node loopNode) {
        int length=1;
        Node current=loopNode.next;
        while(current!=loopNode) {
            length++;
            current=current.next;
        }
        return length;
    }
    void createLoop(int position) {
        if(position<=0 || position>=size())//function size calculate size of LL
        {
            System.out.println("Invalid position for creating a loop.");
            return;
        }

        Node current=head;
        Node loopNode=null;
        int count=1;

        while(current!=null && count<position) {
            current=current.next;
            count++;//count use for go upto position
        }

        loopNode=current;
        while(current.next!=null) {
            current=current.next;
        }
        current.next=loopNode;//[data1]->[data2]->[data3]->[position_data1/2/3]
    }
    void addNode(int data) {
        Node newNode=new Node(data);
        if(head==null) {
            head=newNode;
        }
        else 
        {
            Node current=head;
            while(current.next!=null) {
                current=current.next;
            }
            current.next=newNode;
        }
    }
    int size() 
    {
        int count=0;
        Node current=head;
        while(current!=null)
        {
            count++;
            current=current.next;
        }
        return count;
    }
    public static void main(String[] args) {
        SLoopLL list =new SLoopLL();
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter limit for elements:");
        int n=sc.nextInt();

        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) {
            int data=sc.nextInt();
            list.addNode(data);//[data1]->[data2]->[data3]->null
        }
        System.out.print("Enter the position for loop (0 for NO loop)");
        int loopPosition=sc.nextInt();

        if(loopPosition!=0)
        {
            list.createLoop(loopPosition);
        }

        if(!list.detectLoop())
        {
            System.out.println("No loop detected.");//when that function return false 
        }
    }
}

/*import java.util.*;
class SLoopLL
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
    int findLoop()
    {
        int c=0;
        Node fastRunner=head,slowRunner=head;
        while(fastRunner!=null || fastRunner.next!=null)
        {
            fastRunner=fastRunner.next.next;
            slowRunner=slowRunner.next;
            if(fastRunner==slowRunner)
            {
                System.out.println("loop detected...");
                //c=lengthOfLoop(slowRunner);
                //return c;
                
                return c;
            } 
        }
        return 0;
    }
    /*int lengthOfLoop(Node meet)
    {
        int count=0;
        Node temp=meet;
        while(temp.next!=meet)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }*/
/*    void create(int data)
    {
       Node newnode=new Node(data);
       if(head==null)
       {
           head=newnode;
       }
       else
       {
           Node currentNode=head;
           while(currentNode.next!=head.next)//loop =check next is not head next insted of null
           {
               currentNode=currentNode.next;
           }
           currentNode.next=newnode;
           newnode.next=head.next;
       }
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        SLoopLL loop=new SLoopLL();
        System.out.println("Enter Limit:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int data=sc.nextInt();
            loop.create(data);
        }
        int length=loop.findLoop();
        if(length>0)
        System.out.println("Loop detected Length is:"+length); 
        else
        System.out.println("Loop is Not detected");
    }
}*/

