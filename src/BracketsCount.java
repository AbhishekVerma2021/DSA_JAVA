import java.util.Scanner;

public class BracketsCount
{
    public boolean BRACKETS(String str)
    {
        if(str.length()%2!=0)
        {
            return false;
        }
        else
        {
            int count=0;
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='(')
                {
                    count++;
                }
                else
                {
                    count--;
                }
            }
            if(count==0)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        BracketsCount obj=new BracketsCount();
        Scanner sc= new Scanner(System.in);
        System.out.println(obj.BRACKETS(sc.nextLine()));
    }
}
