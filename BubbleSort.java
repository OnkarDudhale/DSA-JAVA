import java.util.*;
class BubbleSort
{
    void Bubble(int arr[],int n)
    {
        //time complexity O(n^2)
        int pass,i,max;
        for(pass=1;pass<n;pass++)
        {
            for(i=0;i<n-pass;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    max=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=max;
                }
            }
        }
        System.out.println("Sorted Array is:");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");  
        }
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        BubbleSort ob=new BubbleSort();
        int arr[]=new int[20];
        int i,n;
        System.out.println("Enter Limit:");
        n=sc.nextInt();
        System.out.println("Enter Array Elements:");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ob.Bubble(arr,n);

    }
}