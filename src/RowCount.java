import java.util.Scanner;

public class RowCount
{
    public int[] CountMedals(int[][] arr,int m, int n)
    {
        int res[]=new int[m];
        for(int i=0;i<m;i++)
        {
            int sum=0;
            for(int j=0;j<n;j++)
            {
                sum+=arr[i][j];
            }
            res[i]=sum;
        }
        return res;
    }

    public static void main(String[] args)
    {
        RowCount obj = new RowCount();
        Scanner sc =  new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int arr1[]=obj.CountMedals(arr,m,n);
        for(int i=0;i<m;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
