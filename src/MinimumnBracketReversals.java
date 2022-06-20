import java.util.Stack;

public class MinimumnBracketReversals
{
    public static int minimumRevNeeded(String str)
    {
        if(str.length()%2!=0)
            return -1;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(!stack.empty())
            {
                if(stack.peek()=='{'&&str.charAt(i)=='}')
                {
                    stack.pop();
                    continue;
                }
            }
            stack.push(str.charAt(i));
        }
        int m=0,n=0;
        for(char ch : stack)
        {
            if(ch=='{')
                m++;
            else
                n++;
        }
        if(m%2==0&&(n&2)==0)
            return (m+n)/2;
        else
            return (m+n)/2+1;
    }
    public static void main(String[] args) {
        String str="}{{}}{{{";
        System.out.println(minimumRevNeeded(str));
    }
}
