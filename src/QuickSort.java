public class QuickSort
{
    public static void main(String[] args) {
        int arr[]={1,7,2,8,0,3,5,8};
        quickSort(arr,0,arr.length-1);
        display(arr);
    }
    static void display(int[] arr)
    {
        for (int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void quickSort(int[] arr,int front,int end)
    {
        if(front<end)
        {
            int p=partition(arr,front,end);
            quickSort(arr,front,p-1);
            quickSort(arr,p+1,end);
        }
    }
    static int partition(int[] arr,int front,int end)
    {
        int i=front-1;
        int p=end;
        for(int j=front;j<=end;j++)
        {
            if(arr[j]<=arr[p])
            {
                i++;
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        return i;
    }
}
