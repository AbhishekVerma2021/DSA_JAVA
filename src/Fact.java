import java.util.Scanner;

public class Fact
{
    public int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int f= sc.nextInt();
        Fact obj=new Fact();
        System.out.println(obj.factorial(f));;
    }
}
