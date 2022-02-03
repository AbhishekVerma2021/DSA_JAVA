import java.util.Stack;

public class ReverseAStack
{
    public static void ReverseStack(Stack<Integer> st,int s)
    {
        if(!st.isEmpty()) {
            return;
        }
        int temp = st.pop();
        ReverseStack(st,s);
        InsertIntoStack(st, temp,s);
        }
    public static void InsertIntoStack(Stack<Integer> st,int temp,int s)
    {
        if(s==0)
        {
            return;
        }
        int temp2=temp;
        s--;
        InsertIntoStack(st,temp,s);
        st.push(temp2);
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        for(int i=1;i<6;i++)
        {
            stack.push(i);
            System.out.println(i+"-");
        }

        ReverseStack(stack, stack.size());
        while(stack.isEmpty()!=true)
        {
            System.out.println(stack.pop());
        }
    }
}
