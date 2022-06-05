public class NoOf0sAnd1s
{
    public static void count0sAnd1s(String str)
    {
        int c0=0,c1=0;
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='0')
                c0++;
            else
                c1++;
            if(c1==c0)
                count++;
        }
        if(c1!=c0)
            System.out.println("false");
        else
            System.out.println("true");
    }
    public static void main(String[] args) {
        String str="0100110101";
        count0sAnd1s(str);
    }
}
