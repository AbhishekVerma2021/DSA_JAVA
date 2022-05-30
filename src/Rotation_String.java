import java.util.Scanner;

public class Rotation_String
{
    public static void RotationString(String str1,String str2)
    {
        char[] ch1=new char[str1.length()];
        int k=0;
        for(char ch:str1.toCharArray())
        {
            ch1[k]=ch;
            k++;
        }
        int a=0;
        for(a=0;a<str1.length();a++)
        {

            char ch = ch1[str1.length() - 1];
            for (int j = str1.length() - 1; j > 0; j--)
                ch1[j] = ch1[j - 1];
            ch1[0] = ch;
            int f=0;
            for (int i = 0; i < str1.length(); i++) {
                if (str2.charAt(i) != ch1[i]) {
                    break;
                }
                f++;
            }
            if(f==str1.length())
            {
                System.out.println("Same!!!!");
                break;
            }
        }
            if(a==str1.length())
            {
                System.out.println("Not same!!!");

            }

    }
    public static void rotate(char[] ch)
    {
        for(int i=ch.length-1;i>0;i--)
        {
            char c=ch[ch.length-1];
            ch[i]=ch[i-1];
            ch[0]=c;
        }
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1="ABCDEF";
        String str2=sc.nextLine();
        RotationString(str1,str2);
    }
}
