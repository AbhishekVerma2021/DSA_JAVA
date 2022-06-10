import java.util.ArrayList;

public class PatternSearch
{
    public static ArrayList<Integer> searchPattern(String str,String str1)
    {
        ArrayList<Integer> list = new ArrayList<>();
        char[] shstr=str.toCharArray();
        char[] shstr1=str1.toCharArray();
        for(int i=0;i< shstr.length;i++)
        {
            if(shstr[i]==shstr1[0])
            {
                int k=i,f=0;
                for(int j=0;j< shstr1.length;j++)
                {
                    if(shstr[k]==shstr1[j])
                        f++;
                    if(k + shstr1.length < shstr.length)
                        k++;
                }
                if(f==shstr1.length)
                    list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args)
    {
        String str="AABAACAADAABAABA";
        String str1="AABA";
        System.out.println(searchPattern(str,str1));
    }
}
