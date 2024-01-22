import java.util.*;

class CircularQueue
{
    static class Queue{
        int arr[],size;
        int rear=-1;
        int front=-1; 
        Queue(int n)
        {
            arr=new int[n];
            this.size=n;
        }
        int isEmpty()
        {
            if(rear==-1 && front==-1)
            return  1;
            else
            return 0;
        }
        int isFull()
        {
            if((rear+1)%size==front)
            return 1;
            else
            return 0;
        }
        void add(int data)
        {
           if(isFull()==1)
           {
               System.out.println("Queue is full..");
               return ;
           }
           if(front==-1)
           front=0;
           rear=(rear+1)%size;
           arr[rear]=data;
        }
        int remove()
        {
            if(isEmpty()==1)
            {
                System.out.println("queue is empty..");
                return -1;
            }
            int val=arr[front];
            front=(front+1)%size;
            return val;
        }
    }
    public static void main(String arg[])
        {
            Scanner sc=new Scanner(System.in);
           int data,n;
           System.out.println("Enter limit:");
           n=sc.nextInt();
           Queue q=new Queue(n);
           System.out.println("Enter Elements:");
           for(int i=0;i<n;i++)
           {
               data=sc.nextInt();
               q.add(data);
           }
           int j=0;
        while(j<n)
        {
            int var=q.remove();
            System.out.println(var);
            j++;
        }
    }
}