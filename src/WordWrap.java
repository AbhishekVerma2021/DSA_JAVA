public class WordWrap
{
    public static void wordWrapIt(int[] arr,int k)
    {
        while(true)
        {
            int sum=0,prev=0;
            for(int i=0;i<arr.length && sum<6;i++)
            {
                if(i!= arr.length-1 )
                    sum+=1;
                sum+=arr[i];
                if(sum>k)
                    break;
                prev=sum;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={3,2,2,5};
        wordWrapIt(arr,6);
    }
}
