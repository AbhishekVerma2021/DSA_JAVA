import java.util.*;

public class StackEementatbottom
{

    public static void PushAtBottom(int data, Stack<Integer> st)
    {
        if(st.isEmpty())
        {
            st.push(data);
            return;
        }
        int top=st.pop();
        PushAtBottom(data,st);
        st.push(top);
    }
    public static void main(String[] args)
    {
        Stack<Integer> list = new Stack<>();
        for(int i=0;i<5;i++)
        {
            list.push(i);
        }
        PushAtBottom(99,list);
        while(list.isEmpty()!=true)
        {
            System.out.println(list.pop()+" ");
        }
    }
}
