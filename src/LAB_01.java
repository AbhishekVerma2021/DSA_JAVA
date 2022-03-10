import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LAB_01
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        String str=String.valueOf(k);
        Set<Character> strset=new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            strset.add(str.charAt(i));
        }
        System.out.println(strset.size());
    }

}
