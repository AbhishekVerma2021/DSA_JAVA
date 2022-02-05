import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SackImp
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> sta = new Stack<>();
        while(n!=0)
        {
            int rem=n%10;
            sta.push(rem);
            n/=10;
        }
        int i=0;
        int arr[]=new int[sta.size()];
        while(!sta.isEmpty())
        {
            arr[i]=sta.pop();
            i++;
        }

        Arrays.sort(arr);
        int temp=arr[0],c=0;
        for(int k=0;k<i;k++)
        {
            if(temp!=arr[k])
            {
                temp=arr[k];
                c++;
            }
        }
        System.out.println(c+1);
    }
}
