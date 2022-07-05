import java.util.*;

public class LongestPalindromeInString
{
    public static String palindrome(String str)
    {
        ArrayList<String> set=new ArrayList<>(); // For substrings
        for(int i=0;i<str.length();i++) // aaaabbaa
        {
            String s="";
            for(int j=i;j<str.length();j++)
            {
                s+=str.charAt(j);
                set.add(s);
            }
        }
        System.out.println(set);
        Collections.sort(set, Comparator.comparing(String::length).reversed());

        System.out.println(set);
        for(String S:set)
        {
            String st="";
            for (int i=S.length()-1;i>=0;i--)
            {
                st+=S.charAt(i);
            }
            if(S.equals(st))
                return st;
        }
        System.out.println(set);
        return "0";
    }


    public static void main(String[] args) {
        String str="aaaabbaa";
        System.out.println(palindrome(str));
    }
}