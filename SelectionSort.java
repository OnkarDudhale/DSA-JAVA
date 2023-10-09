import java.util.*;
class SelectionSort
{
    int index;
    void Selection(int arr[],int n)
    {
        //time complexity O(n^2)
        int pass,i,min,temp;
        for(pass=1;pass<n;pass++)
        {
            min=arr[pass-1];
            for(i=pass;i<n;i++)
            {
                if(min>arr[i])
                {
                    min=arr[i];//min only use for comparison or to find/store minimum array element
                    index=i;
                }
            }
            temp=arr[pass-1];
            arr[pass-1]=arr[index];
            arr[index]=temp;
        }
        System.out.println("Sorted Array is:");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");  
        }
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        SelectionSort ob=new SelectionSort();
        int arr[]=new int[20];
        int i,n;
        System.out.println("Enter Limit:");
        n=sc.nextInt();
        System.out.println("Enter Array Elements:");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ob.Selection(arr,n);

    }
}