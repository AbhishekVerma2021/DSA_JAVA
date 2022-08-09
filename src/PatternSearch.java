package FIRST.src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PatternSearch
{
    public static Set<Integer> searchPattern(String str,String str1)
    {
        Set<Integer> index=new HashSet<>();
        char[] charArray=str.toCharArray();
        int j=str1.length();
        for(int i=0;i<=str.length()-str1.length();i++)
        {
            String smajor="";
            for(int k=i;k<i+j;k++)
            {
                smajor+=charArray[k];
            }
            if(smajor.equals(str1))
                index.add(i);
        }
        System.out.println(index);
        return index;
    }
    public static void main(String[] args)
    {
        String str="AABAACAADAABAABA";
        String str1="AABA";
        System.out.println(searchPattern(str,str1));

    }
}
