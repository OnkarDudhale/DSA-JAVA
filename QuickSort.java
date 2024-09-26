class QuickSort
{
   void QuickSorted(int arr[],int low,int high)
   {
       if(low<high)
       {
           int pivot=partitionSwap(arr,low,high);//find pivot value actual location and then
           QuickSorted(arr,low,pivot);//parition using pivot location recursivaly
           QuickSorted(arr,pivot+1,high);
       }
   }
   static void swap(int arr[],int i,int j)
   {
       int temp;
       temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
   } 
   static int partitionSwap(int arr[],int low,int high)
   {
       int pivot=arr[low];
       int k=high;
       for(int i=high;i>low;i--)
       {
           if(arr[i]>pivot)
           swap(arr,i,k--); 
       }
       swap(arr,low,k);//k position is pivot element position

       return k;
   }
   void display(int arr[])
   {
    System.out.println("Quick:Sorted Elements is:");   
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+"\t");
    }
   }
   public static void main(String arg[])
   {
      int arr[]={20,34,12,56,45,25};
      int low=0;
      int high=arr.length-1;
      QuickSort obj=new QuickSort();
      obj.QuickSorted(arr,low,high);
      obj.display(arr); 
   }
}