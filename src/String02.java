import java.util.*;

public class String02 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int f=0,s=sc.nextInt();
        sc.nextLine();
        List<String> STR= new ArrayList<>();
        for(int i=0;i<s;i++)
        {

            String str=sc.nextLine();
            if(str.charAt(0)=='H' && str.charAt(1)=='R')
            {
                STR.add(str.toUpperCase());
                f++;
            }
        }
        System.out.println(f);
        for(int i=0;i<f;i++)
        {
            System.out.println(STR.get(i));
        }
    }
}