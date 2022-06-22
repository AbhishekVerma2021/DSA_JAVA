import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PalindromesInString
{
    public static boolean isPalindrome(String str)
    {
        String s="";
        for(int i=str.length()-1;i>=0;i--)
            s+=str.charAt(i);
        if(s.equals(str))
            return true;
        return false;
    }
    public static long findPalindrome(String str)
    {
        ArrayList<String> set= new ArrayList<>();
        long c=0;
        for(int i=0;i<Math.pow(2,str.length())-1;i++)
        {
            c++;
            String s="";
            for(int j=0;j<str.length();j++)
            {
                int k=1<<j;
                if((i&k)!=0)
                {
                    s+=str.charAt(j);
                }
            }
            set.add(s);
        }
        System.out.println(set);
        c=0;
        for (String s : set) {
            if(isPalindrome(s))
            {
                c++;
            }
        }
        return c-1;
    }
    public static void main(String[] args)
    {
        String str="aab";
        System.out.println(findPalindrome(str));
    }
}

