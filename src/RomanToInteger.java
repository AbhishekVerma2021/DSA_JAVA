package FIRST.src;



public class RomanToInteger
{

    public static int priority(char ch)
    {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 2;
            case 'X':
                return 3;
            case 'L':
                return 4;
            case 'C':
                return 5;
            case 'D':
                return 6;
            case 'M':
                return 7;
            default:
                return -1;
        }
    }
    public static void Roman(String str)
    {

        for(int i=str.length()-1;i>1;i--)
        {
            if(priority(str.charAt(i))>priority(str.charAt(i-1)))
            {
                if(priority(str.charAt(i))-priority(str.charAt(i-1))!=1)
                {
                    System.out.println("INVALID !!");
                    return;
                }
            }
            if(priority(str.charAt(i))>priority(str.charAt(i-2))||priority(str.charAt(i))<priority(str.charAt(i-1)))
            {
                System.out.println("INVALID CASE");
                return;
            }
        }
        int n=0;
        for(int i=str.length()-1;i>0;i--)
        {
            if(priority(str.charAt(i))==1)// iviii CIII  VM
            {
                n+=1;
            }
        }
    }
    public static void main(String[] args) {
        String str="XCVII";
        Roman(str);
    }
}
