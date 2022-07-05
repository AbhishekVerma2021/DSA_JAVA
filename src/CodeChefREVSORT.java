import java.util.*;

public class CodeChefREVSORT
{
    public static int[] reverseArray(int[] arr)
    {
        int[] res= new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            res[j]=arr[i];
            j++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int size=sc.nextInt();
            int sum=sc.nextInt();
            int[] arr= new int[size];
            ArrayList<Integer> arrayList=new ArrayList<>();
            for(int i=0;i<size;i++) {
                arr[i] = sc.nextInt();
                arrayList.add(arr[i]);
            }
            Set<ArrayList> set = new HashSet<>();
            for(int i=0;i<size;i++)
            {
                int s=0,l=0;
                ArrayList<Integer> arr1=new ArrayList<>();
                int[] array1=new int[size-i];
                for(int k=i;k<size;k++)
                {
                    array1[l]=arr[k];
                    s+=arr[k];
                    l++;
                }
                if(s<=sum)
                {
                    array1=reverseArray(array1);
                    for (int k=0;k<array1.length;k++)
                        arr1.add(array1[k]);
                    set.add(arr1);
                }
            }
        }
    }
}
