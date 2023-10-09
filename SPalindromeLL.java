//check Linked List is palindrome or not
import java.util.*;

class SPalindromeLL
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
    void palindrome(int n)
    {
        Node temp,current;
        int i,c=0,f=0;
        temp=head;
        while(temp.next!=null)/*its check whole LL after checking all posibilities upto null question is how reduce time complexity?*/
        { 
           int pos=n-c;
           for(current=head,i=1;i<pos;current=current.next,i++);
           if(temp.data!=current.data)
           {
                f=1;
                break;
           }
           temp=temp.next;
           c++;
        }
        if(f==1)
        System.out.println("LL is not palindrome....");
        else
        System.out.println("LL is Palindrome....");
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
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
       SPalindromeLL obj=new SPalindromeLL();
       System.out.println("Enter limit:");
       int n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
          int data=sc.nextInt();
          obj.add(data);  
       }
       obj.palindrome(n);
    } 
}