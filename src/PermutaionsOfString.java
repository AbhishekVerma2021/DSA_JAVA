import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutaionsOfString
{
    public static List<String> permutationString(String str)
    {
        List<String> list=new ArrayList<>();
        Set<String> set=new HashSet<>();
        int n=(int)Math.pow(2,str.length());
        char[] strArr=str.toCharArray();
        for(int k=0;k<n;k++)
        {
            char ch=strArr[str.length()-1];
            for(int i=str.length()-1;i>0;i--)
                strArr[i]=strArr[i-1];
            strArr[0]=ch;
            String temp="";
            for(int i=0;i<str.length();i++)
                temp+=strArr[i];
            set.add(temp);
        }
        for (String st :
                set) {
            list.add(st);
        }
        return list;
    }
    public static void main(String[] args) {
        String str="ABSG";
        List<String> set=permutationString(str);
        for (String st :
                set) {
            System.out.println(st);
        }
    }
}
