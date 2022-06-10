import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MixTwoStrings
{
    public static void mixedOrNot(String Str1,String Str2,String Str3)
    {
        if(Str3.length()==(Str1.length()+Str2.length()))
        {
            HashMap<Character,Integer> set1=new HashMap<>();
            HashMap<Character,Integer> set2=new HashMap<>();
            char[] str1=new char[Str1.length()];
            int j=0;
            for (char ch : Str1.toCharArray())
            {
                str1[j]=ch;
                j++;
            }
            j=0;
            char[] str2=new char[Str2.length()];
            for (char ch : Str2.toCharArray())
            {
                str2[j]=ch;
                j++;
            }
            System.out.println(set1);
            j=0;
            char[] str3=new char[Str3.length()];
            for (char ch : Str3.toCharArray())
            {
                str3[j]=ch;
                j++;
            }
            for(int i=0;i<str3.length;i++) // This loop throws the exception no matter where I place it
            {
                if(!set1.containsKey(str3[i]))
                    set1.put(str3[i],0);
                else
                    set1.put(str3[i],set1.get(str1[i])+1);
            }
            System.out.println("II LOOP");
            for(int i=0;i<str1.length;i++)
            {
                if(!set2.containsKey(str1[i]))
                    set2.put(str1[i],0);
                else
                    set2.put(str1[i],set2.get(str1[i])+1);
            }
            System.out.println("III LOOP");
            for(int i=0;i<str2.length;i++)
            {
                if(!set2.containsKey(str2[i]))
                    set2.put(str2[i],0);
                else
                    set2.put(str2[i],set2.get(str2[i])+1);
            }


            System.out.println(set1.size()+"---"+set2.size());
            if(set1.size()!=set2.size())
            {
                System.out.println("Not Same Size");
            }
            if(set1.equals(set2))
            {
                System.out.println("TRUE!!!!!!");
            }
        }
        else
        {
            System.out.println("NOT SAME LENGTH");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s3=sc.nextLine();
        mixedOrNot(s1,s2,s3);
    }
}
