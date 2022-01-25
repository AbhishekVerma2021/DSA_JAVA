import java.util.Scanner;

public class String01<str2>
{
    public static void main(String[] args) {
        //Removing a particular element from the string
        String str="Abhishek";
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        String str2= str.substring(0,i)+str.substring(i+1);
        System.out.println(str2);
    }
}
