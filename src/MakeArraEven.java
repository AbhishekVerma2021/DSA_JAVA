import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakeArraEven
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int s= sc.nextInt();
            int[] arr=new int[s];
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<s;i++)
            {
                arr[i]=sc.nextInt();
                if(!map.containsKey(arr[i]))
                    map.put(arr[i],1);
                else
                    map.put(arr[i],map.get(arr[i])+1);
            }
            int max=0;
            for(Map.Entry mapset : map.entrySet())
            {
                int f=(int)mapset.getValue();
                if(f>max)
                    max=f;
            }
            System.out.println(arr.length-max);
        }
    }
}
