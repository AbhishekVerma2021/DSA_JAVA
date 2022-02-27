import java.util.Stack;

class HackerRAnk_Contest
{
    public void reversestack(Stack<Character> st)
    {
        if(st.isEmpty())
        {
            return;
        }
        char top=st.pop();
        reversestack(st);
        insertatBottom(st,top);
    }
    public void insertatBottom(Stack<Character> st,char temp)
    {
        if(st.isEmpty())
        {
            st.push(temp);
            return;
        }
        char t=st.pop();
        insertatBottom(st,temp);
        st.push(t);
    }

    public static void main(String[] args) {
        HackerRAnk_Contest obj=new HackerRAnk_Contest();
        Stack<Character> st=new Stack<>();
        String str="PARAS BHOSDIKA";
        for(int i=0;i<str.length();i++)
        {
            st.push(str.charAt(i));
        }
        obj.reversestack(st);
        while (!st.isEmpty())
        {
            System.out.print(st.pop());
        }
    }
}