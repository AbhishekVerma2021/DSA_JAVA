import java.util.Scanner;
import java.util.Stack;


public class RevStackRecursion
{
    public void revstack(Stack<Integer> st)
    {
        if(st.isEmpty())
        {
            return;
        }
        int top=st.pop();
        revstack(st);
        InsertAtBottom(st,top);

    }
    public void InsertAtBottom(Stack<Integer> st, int temp)
    {
        if(st.isEmpty())
        {
            st.push(temp);
            return;
        }
        int t= st.pop();
        InsertAtBottom(st,temp);
        st.push(t);
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        RevStackRecursion obj= new RevStackRecursion();
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<5;i++)
        {
            st.push(sc.nextInt());
        }
        obj.revstack(st);
        while(!st.isEmpty() )
        {
            System.out.println(st.pop());
        }
    }
}
