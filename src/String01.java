import java.util.Scanner;

public class String01
{
    public static void main(String[] args)
    {
        String str="HOW aARE YOU";
        String strarr[]=str.split("\\s");
        int maxlen=0;
        for(String tstr : strarr)
        {
            if(tstr.length()>maxlen)
            {
                maxlen= tstr.length();
            }
        }

        char[][] chararr= new char[strarr.length][maxlen];
        for(int i=0;i< strarr.length;i++)
        {
            int j=0;
            for (char ch: strarr[i].toCharArray()) {
                chararr[i][j] = ch;
                j++;
            }
        }
        for (int i=0;i<maxlen;i++)
        {
//            System.out.print(chararr[i ][0]);
//            System.out.print(chararr[i][1]);
//            System.out.print(chararr[i][2]);
//            System.out.print(chararr[i][3]);
            for (int j=0;j< strarr.length;i++)
            {
                System.out.println(chararr[j][i]);
            }
//            for (int j=0;j<maxlen;j++)
//            {
//                if(i!=0)
//                    System.out.print(" ");
//                System.out.print(chararr[i][j]);
//            }
//            System.out.println();
        }


    }
}