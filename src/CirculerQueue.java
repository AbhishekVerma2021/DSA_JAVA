import java.util.Scanner;

public class CirculerQueue
{
    int top,begin,size;
    static int arr[],f=0;
    CirculerQueue(int size)
    {
        arr = new int[size];
        top=-1;
        begin=-1;
        this.size=size;
    }
    public boolean isempty()
    {
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isfull()
    {
        if(top+1==begin||((begin==0)&&(top+1==size)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void dequeue()
    {
        if(isempty())
        {
            System.out.println("Underflow!!!");
        }
        else
        {
            System.out.println("Deleting");
            arr[begin]=0;
            begin++;
            f--;
        }
    }
    public void enqueue(int data)
    {
        if(isempty())
        {
            top++;
            begin=0;
            arr[begin]=data;
            f++;
        }
        else if(isfull())
        {
            System.out.println("Overflow!!!");
            return;
        }
        else
        {
            if(top+1==begin)
            {
                System.out.println("Overflow!!!");
                return;
            }
            else if(top+1==size)
            {
                top=0;
            }
            else
            {
                top++;
            }
            arr[top]=data;
            f++;
        }
    }

    public static void main(String[] args)
    {
        CirculerQueue obj = new CirculerQueue(5);
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter element : ");
            obj.enqueue(sc.nextInt());
        }
        for(int i=0;i<3;i++)
        {
            obj.dequeue();
        }
        for (int i=0;i<2;i++)
        {
            System.out.print("Enter new element : ");
            obj.enqueue(sc.nextInt());
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
