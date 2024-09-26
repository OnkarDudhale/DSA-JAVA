import java.util.*;
class InsertionSort
{
    void insertion(int arr[],int n)
    {
        int i,j,mx;
        for(i=1;i<n;i++)
        {
            mx=arr[i];
            for(j=i-1;j>=0 && arr[j]>mx;j--)
            {
                arr[j+1]=arr[j];
            }
            arr[j+1]=mx;
        }
    }
    void display(int n,int arr[])
    {
        int i;
        for(i=0;i<n;i++)
        System.out.print(arr[i]+"\t");
    }
    public static void main(String arg[])
    {
        InsertionSort ob=new InsertionSort();
        Scanner sc=new Scanner(System.in);
        int i,n;
        int arr[]=new int[20];
        System.out.println("Enter Limit:");
        n=sc.nextInt();
        System.out.println("Enter array Elements:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        ob.insertion(arr,n);
        ob.display(n,arr);
    }
}