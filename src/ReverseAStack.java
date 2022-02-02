import java.util.Stack;

public class ReverseAStack
{
    public static void ReverseStack(Stack<Integer> st)
    {
        if(st.size()>0)
        {
            int temp=st.peek();
            st.pop();
            ReverseStack(st);
            InsertIntoStack(st,temp);
        }
        else
        {
            return;
        }
    }
    public static void InsertIntoStack(Stack<Integer> st,int temp)
    {
        if(st.isEmpty())
        {
            st.push(temp);
        }
        else
        {
            int t=st.peek();
            st.pop();
            InsertIntoStack(st,temp);
            st.push(t);
        }
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
