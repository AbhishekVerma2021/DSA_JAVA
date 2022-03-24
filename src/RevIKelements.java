import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RevIKelements
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();

        InputQueue(que);
    }
    public static void InputQueue(Queue<Integer> que)
    {
        int n=sc.nextInt(),k= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            que.add(sc.nextInt());
        }
        RevKele(que,k);
    }
    static void RevKele(Queue<Integer> que,int k)
    {
        int n= que.size();
        int arr[]=new int[k];
        for(int i=0;i<k;i++)
        {
            arr[i]= que.poll();
        }
        for(int i=k-1;i>=0;i--)
        {
            que.add(arr[i]);
        }
        for(int i=0;i<n-k;i++)
        {
            que.add(que.poll());
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(que.poll()+" ");
        }
    }
}
