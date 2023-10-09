class MerSort
{
    static void mergeSort(int arr[], int left, int mid, int right)
    {
        int b[] = new int[right - left + 1];
        int i = left, j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right)
        {
            if (arr[i] <= arr[j])
            {
                b[k++] = arr[i++];
            }
            else
            {
                b[k++] = arr[j++];
            }
        }

        while (i <= mid)
        {
            b[k++] = arr[i++];
        }

        while (j <= right)
        {
            b[k++] = arr[j++];
        }
        for (i = left, k = 0; i <= right; i++, k++)
        {
            arr[i] = b[k];
        }
    }

    static void divide(int arr[], int left, int right)
    {
        if (left < right)
        {
            int mid = (left + right) / 2;
            divide(arr, left, mid);
            divide(arr, mid + 1, right);

            mergeSort(arr, left, mid, right);
        }
    }

    static void displayMergeSort(int arr[])
    {
        int i;
        int n = arr.length;
        System.out.println("Sorted Merged array is:");
        for (i = 0; i < n; i++)
        {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String arg[])
    {
        int arr[] = {23, 12, 34, 55, 45, 13};
        int right = arr.length;
        System.out.println("Original array is:");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "\t");
        System.out.println();
        divide(arr, 0, right - 1);
        displayMergeSort(arr);
    }
}
