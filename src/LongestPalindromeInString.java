import java.util.*;

public class LongestPalindromeInString
{
    public static void subString(String str,ArrayList<String> strArr,String op)
    {
        if(str.length()==0)
        {
            strArr.add(op);
            return;
        }
        subString(str.substring(1),strArr,op);
        subString(str.substring(1),strArr,op+str.charAt(0));
    }
    public static void longestPal(String str)
    {
        char[] ch=str.toCharArray();
        ArrayList<String> strArr=new ArrayList<>();
        subString(str,strArr,"");

        Set<String> set = new HashSet<>();
        for(int i=0;i<strArr.size();i++)
        {
            set.add(strArr.get(i));
        }
        String[] arr=new String[set.size()];
        int p=0;
        for(String st: set)
        {
            arr[p]=st;
            p++;
        }
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        for (String s : arr)
            System.out.println(s);
        for(int k=strArr.size()-1;k>=0;k--)
        {
            int f=0,c=0;
            for(int i=0;i<strArr.get(k).length()-1;i++)
            {
                if(strArr.get(k).charAt(i)==strArr.get(k).charAt(i+1))
                    continue;
                c++;
            }
            for(int i=0,j=strArr.get(k).length()-1;i<=strArr.get(k).length()/2&&j>=strArr.get(k).length()/2;i++,j--)
            {
                if(strArr.get(k).charAt(i)==strArr.get(k).charAt(j))
                {
                    continue;
                }
                f++;
            }
            if(f==0&&c!=0)
            {
                System.out.println(strArr.get(k)+"-");
                break;
            }
        }
    }
    public static void main(String[] args) {
        String str="aaaabbaa";
        longestPal(str);
    }
}
