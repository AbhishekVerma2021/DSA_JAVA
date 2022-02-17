import java.util.Scanner;

public class ASSIGNMENT_02
{
    public void calsum(int[] arr , int size) {
        if (size % 2 == 0) {
            for (int i = 0; i < size; i += 2) {
                arr[i] = 0;
            }
        } else {
            for (int i = 1; i < size; i += 2) {
                arr[i] = 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        if (sum / 10 == 0) {
            System.out.println(sum);
        }
        else
        {
            int sum2 = 0;
            while (true)
            {
                while (sum != 0) {
                    int rem = sum % 10;
                    sum2 += rem;
                    sum /= 10;
                }
                if (sum2 / 10 == 0)
                {
                    System.out.println(sum2);
                    break;
                }
                else
                {
                    sum = sum2;
                    sum2 = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        ASSIGNMENT_02 obj=new ASSIGNMENT_02();
        Scanner sc= new Scanner(System.in);
        int s=sc.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++)
        {
            arr[i]=sc.nextInt();
        }
        obj.calsum(arr,s);
    }

}
