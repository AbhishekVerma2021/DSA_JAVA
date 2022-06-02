public class LongestPalindrom
{
    public static void longestPal(String str)
    {
        String[] strArr= str.split(" ");
        int[] arr=new int[strArr.length];
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=strArr[i].length();
        }
        for (int i=1 ;i< arr.length; i++)
        {
            String temp = strArr[i];

            // Insert s[j] at its correct position
            int j = i - 1;
            while (j >= 0 && temp.length() < strArr[j].length())
            {
                strArr[j+1] = strArr[j];
                j--;
            }
        }
        for(int k= arr.length-1;k>=0;k--)
        {
            int f=0;
            for(int i=0,j=strArr.length-1;i< strArr.length/2&&j>= strArr.length;i++,j--)
            {
                if(strArr[k].charAt(i)==strArr[k].charAt(j))
                    continue;
                f++;
            }
            if(f==0)
            {
                str=strArr[k];
                break;
            }
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        String str="aab1baa";
//        longestPal(str);
        int f=0;
        for(int i=0,j=str.length()-1;i<=str.length()/2&&j>= str.length()/2;i++,j--)
        {
            if(str.charAt(i)==str.charAt(j))
                continue;
            f++;
        }
        if(f==0)
        {
            System.out.println("YESS");
        }
    }
}
