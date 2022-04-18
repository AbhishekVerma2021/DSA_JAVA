public class QuickSort
{
    static void quicksort(int[] arr,int front,int end)
    {
        if(front<end)
        {
            int pivot=partion(arr,front,end);
            quicksort(arr,front,pivot);
            quicksort(arr,pivot+1,end);
        }
    }
    public static int partion(int[] arr,int f,int e)
    {
        int i=f;
        int p=e-i;
        for(int j=i;j<p;j++)
        {
            if(arr[i]<arr[j])
            {
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        return i;
    }
    public static void main(String[] args)
    {
        int arr[]={1,5,2,7,6,3};
        quicksort(arr,0,arr.length-1);

        for (int i:arr
             ) {
            System.out.print(i+" ");

        }
    }
}