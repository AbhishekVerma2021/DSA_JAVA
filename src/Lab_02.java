import java.util.Scanner;

public class Lab_02
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int input2=sc.nextInt();
        str.toCharArray();
        if(input2==0)
        {
            int sum=0,f=0;
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)>47&&str.charAt(i)<58)
                {
                    sum+=Integer.valueOf(str.charAt(i));
                    System.out.println(sum);
                    f++;
                }
            }
            if(f!=0)
            {
                str= String.valueOf(sum);
                System.out.println(sum);
            }
            else
            {
                System.out.println("Zero");
            }
        }
        else
        {
            int f=0;
            StringBuilder str1=new StringBuilder();
            for(int i=0;i<str.length();i++)
            {
                if((str.charAt(i)>64&&str.charAt(i)<91)||(str.charAt(i)>96&&str.charAt(i)<123))
                {
                    str1.append(str.charAt(i));
                    f++;
                }
            }
            str= String.valueOf(str1);
            if(f!=0)
            {
                System.out.println(str);
            }
            else
            {
                System.out.println("Zero");
            }
        }
    }
}
