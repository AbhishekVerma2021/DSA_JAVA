import java.util.Stack;

public class Leetcodes_Valid_Parentheses
{
    public static void isValid(String s)
    {
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++)
        {

            if(s.charAt(i)==')' && st.peek()=='(')
            {
                st.pop();continue;
            }
            else if(s.charAt(i)=='}' && st.peek()=='{')
            {
                st.pop();continue;
            }
            else if(s.charAt(i)==']' && st.peek()=='[')
            {
                st.pop();continue;
            }
            st.push(s.charAt(i));
        }
        if(st.isEmpty())
        return true;
        else
            return false;
    }
    public static void main(String[] args) {
        String s= "()[{}][[]";
        isValid(s);
    }
}
