import java.util.Arrays;
import java.util.Scanner;

public class ASSIGNMENT_04
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt();
        int arr1[]=new int[m],arr2[]=new int[n];
        for(int i=0;i<m;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int arr3[]=new int[arr1.length+arr2.length];
        for(int i=0;i<m;i++)
        {
            arr3[i]=arr1[i];
        }
        int i=m;
        for(int ele:arr2)
        {
            arr3[i]=ele;
            i++;
        }
        Arrays.sort(arr3);
        if((m+n)%2==0)
        {
            System.out.println( (((float) arr3[(m+n)/2]+(float)arr3[((m+n)/2)-1])/2));
        }
    }
}
