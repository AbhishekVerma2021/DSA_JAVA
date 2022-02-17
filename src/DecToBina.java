public class DecToBina
{
    public void DecimalToBinary(int n)
    {
        if(n==0)
        {
            return;
        }

        int bin=n%2;
        n/=2;
        DecimalToBinary(n);
        System.out.print(bin+" ");
    }

    public static void main(String[] args) {
        DecToBina obj= new DecToBina();
        obj.DecimalToBinary(8);
    }
}
