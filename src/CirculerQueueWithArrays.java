import java.util.Scanner;

public class CirculerQueueWithArrays
{
    int top,begin,size;
    static int arr[];
    CirculerQueueWithArrays(int size)
    {
        this.size=size;
        this.begin=-1;
        this.top=-1;
        arr=new int[size];
    }
    public boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        return false;
    }
    public boolean isFull()
    {
        if ((top+1==size && begin==0)||top+1==begin)
        {

            return true;
        }
        return false;
    }
    void enQueue(int data) {
        if (isEmpty()) {
            begin = 0;
            top++;
            arr[top] = data;
            return;
        }
        if (top == size - 1) {
            if (begin > 0) {
                top = -1;
            } else {
                System.out.println("Overflow!!");
                return;
            }

        }

        if (top + 1 == begin) {
            System.out.println("No space left!!");

        } else {
            top++;
            arr[top] = data;
        }
    }
//    public void enQueue(int data)
//    {
//        if(isEmpty())
//        {
//            System.out.println("I");
//            begin=0;
//            arr[begin]=data;
//            top++;
//            return;
//        }
//        else if (isFull())
//        {
//            System.out.println("II");
//            System.out.println("FULLLLL!!!!!!!");
//            return;
//        }
//        else
//        {
//
//            if(top+1==begin)
//            {
//                System.out.println("!!!!!!!!!!!");
//                return;
//            }
//            if(top+1==size)
//            {
//                top=0;
//            }
//            else
//            {
//                top++;
//            }
//            arr[top]=data;
//        }
//    }
    public void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Nothing to delete!!!!");
            return;
        }
        else
        {
            arr[begin]=0;
            begin++;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int s=sc.nextInt();
        CirculerQueueWithArrays obj = new CirculerQueueWithArrays(s);
        for(int i=0;i<s;i++)
        {
            obj.enQueue(i);

        }
        obj.enQueue(5);
        for(int i=0;i<s;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
