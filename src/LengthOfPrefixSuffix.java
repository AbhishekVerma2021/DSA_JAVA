public class LengthOfPrefixSuffix
{
    public static String sliceOut(int first,int last,String str)
    {
        String s="";
        for(int i=first;i<=last;i++)
        {
            s+=str.charAt(i);
        }
        return s;
    }
    public static int PrefixSuffix(String str)
    {
        for(int i=1;i<str.length();i++)
        {
            String suffix = "",prefix="";
            if(str.charAt(i)==str.charAt(0))
            {
                System.out.println(i+" ");
                suffix=str.substring(i);
                prefix=str.substring(0,suffix.length());
                System.out.print(prefix+" ");
                System.out.println(suffix+" ");
                if(prefix.equals(suffix))
                {
                    return suffix.length();
                }
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        String str="abab";
        System.out.println(PrefixSuffix(str));
    }
}
