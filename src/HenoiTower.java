import java.util.Scanner;

public class HenoiTower
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of disks : ");
        int n=sc.nextInt();
        System.out.println("Enter the rowers name: ");
        int A=sc.nextInt();
        int B= sc.nextInt();
        int C=sc.nextInt();
        towerofhenoi(n,A,B,C);
    }
    public static void towerofhenoi(int n,int A,int B,int C)
    {
        towerofhenoi(n-1,A,C,B); // Moves the top 2 rings to the C tower using B tower
        System.out.println(n+ "[" + A + "->" + B + "]"); // Moves the last ring to the B tower from A
        towerofhenoi(n-1,C,B,A);
    }
}
