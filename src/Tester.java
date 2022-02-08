import java.util.*;
 class NumberGenerator
{
    private static int counter;
    private int num1;
    static
    {
        counter = 101;
    }
    public NumberGenerator(int num1)
    {
        this.num1=NumberGenerator.counter-num1;
        NumberGenerator.counter-=num1;
    }
    public static int generateNumber()
    {
        return NumberGenerator.counter+10;
    }
    public void updateNumber(int val1,int val2)
    {
        if(val1>=val2)
        {
            NumberGenerator.counter-=(this.num1+val1);
        }
        else
        {
            NumberGenerator.counter+=(this.num1-val2);
        }
    }
}
class Tester
{
    public static void main(String[] args) {
        NumberGenerator obj = new NumberGenerator(2);
        obj.updateNumber(2,4);
        NumberGenerator obj2 = new NumberGenerator(3);
        System.out.println(NumberGenerator.generateNumber());
    }
}
