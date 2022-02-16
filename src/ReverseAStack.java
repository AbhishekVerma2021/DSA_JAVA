import java.util.Stack;

public class ReverseAStack
{
    public static void ReverseStack(Stack<Integer> st)
    {
        if(st.isEmpty())
        {
            return;
        }
        int temp=st.pop();
        ReverseStack(st);
        InsertAtBottom(st,temp);
    }
    public static void InsertAtBottom(Stack<Integer> st,int temp)
    {
        if(st.isEmpty())
        {
            st.push(temp);
            return;
        }
        int t=st.pop();
        InsertAtBottom(st,temp);
        st.push(t);
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        for(int i=1;i<6;i++)
        {
            stack.push(i);
            System.out.println(i+"-");
        }

        ReverseStack(stack);
        while(stack.isEmpty()!=true)
        {
            System.out.println(stack.pop());
        }
    }
}
