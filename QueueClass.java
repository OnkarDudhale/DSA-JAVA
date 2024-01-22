import java.util.Scanner;

class QueueClass
{
    static class Queue{
        static int data[];
        static int size,rear=-1,front=-1;
        Queue(int n)
        {
           data=new int[n];
           this.size=n;
        }
        
        static boolean isEmpty()
        {
            return rear==-1;
        }
        void add(int val)
        {
           if(front==-1)
           front=0;
           if(rear==size-1)
           {
           System.out.println("Queue is full..");
           return;
           }
           rear++;
           data[rear]=val;
        }
        int remove()
        {
            if(isEmpty())
            {
            System.out.println("Queue is already empty.."); 
            }
            int temp=data[front];
            front++;
            
            return temp;
        }
        void peek()
        {
            while(!isEmpty())
            {
                int k=remove();
                System.out.println(k);
            }
        }
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n; 
        System.out.println("Enter limit:");
        n=sc.nextInt();
        Queue q=new Queue(n);
        for(int i=0;i<n;i++)
        {
            int val=sc.nextInt();
            q.add(val);
        }
       
        q.peek();
        
    }
}