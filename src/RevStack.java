import java.util.Scanner;
import java.util.Stack;

public class RevStack
{
    public Stack<Integer> reverseStack(Stack<Integer> st1)
    {
        Stack<Integer> st2=new Stack<>();
        while(!st1.isEmpty())
        {
            st2.push(st1.pop());
        }
        while(!st2.isEmpty())
        {
            st1.push(st2.pop());
        }
        return st1;
    }

    public static void main(String[] args)
    {
        RevStack obj= new RevStack();
        Stack<Integer> st1= new Stack<>();
        Scanner sc= new Scanner(System.in);
        int s=sc.nextInt();
        for(int i=0;i<s;i++)
        {
            st1.push(sc.nextInt());
        }
        obj.reverseStack(st1);
        while(!st1.isEmpty())
        {
            System.out.println(st1.pop());
        }
    }
}
