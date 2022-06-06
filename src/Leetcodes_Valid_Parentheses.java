import java.util.*;

public class Leetcodes_Valid_Parentheses
{
    public static boolean validOrNot(String str)
    {
        if(str.length()==0)
        {
            return false;
        }
        HashMap<Character,Integer> table=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(!table.containsKey(str.charAt(i)))
                table.put(str.charAt(i),1);
            else
                table.put(str.charAt(i),table.get(str.charAt(i))+1);
        }
        if((table.get('{')==table.get('}'))&&(table.get(')')==table.get('('))&&(table.get('[')==table.get(']')))
        {
            Stack<Character> stack=new Stack<>();
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='{'||str.charAt(i)=='['||str.charAt(i)=='(')
                    stack.push(str.charAt(i));
                else if((str.charAt(i)=='}'&& stack.peek()=='{')||(str.charAt(i)==')'&& stack.peek()=='(')||(str.charAt(i)==']'&& stack.peek()=='['))
                    stack.pop();
                else
                {
                    return false;
                }
            }
            if(stack.isEmpty())
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        String str="[{}[]{()}]";
        System.out.println(validOrNot(str));
    }
}