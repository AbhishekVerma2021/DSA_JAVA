import java.util.Scanner;

public class QueueArrays
{
    static int arr[];
    static int size,f=0;
    int front;
    int last;

    QueueArrays(int size)
    {
        this.size=size;
        arr= new int[size];
        front=-1;
        last=-1;
    }
    public boolean isfull()
    {
        if(last+1==size&&front==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isempty()
    {
        if(last==-1)
        {
            return true;
        }
        return false;
    }
    public void enqueue(int data)
    {
        if(isempty())
        {
            front=0;
            arr[front]=data;
            last++;
        }
        else if(isfull())
        {
            System.out.println("Overflow");
            return;
        }
        else
        {
            last++;
        }
        arr[last]=data;

    }
    public void dequeue()
    {
        if(isempty())
        {
            System.out.println("Underflow!!!!");
            return;
        }
        else
        {
            for(int i=0;i<=last-1;i++)
            {
                arr[i]=arr[i+1];
            }
            arr[last]=0;
            last--;
            f++;
        }
    }

    public static void main(String[] args)
    {
        QueueArrays obj = new QueueArrays(6);
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            System.out.println("Enqu");
            obj.enqueue(sc.nextInt());
        }
        for(int i=0;i<3;i++)
        {
            System.out.println("Dequ");
            obj.dequeue();
        }
        for (int i=0;i<size-f;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<2;i++)
        {
            System.out.println("Enqu");
            obj.enqueue(sc.nextInt());
        }
        for (int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
