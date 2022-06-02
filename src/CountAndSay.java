import java.util.*;

public class CountAndSay
{
    public static String IntegerToString(int n)
    {
        String str="";
        switch(n)
        {
            case 0:
                str="Zero";
                break;
            case 1:
                str="One";
                break;
            case 2:
                str="Two";
                break;
            case 3:
                str="Three";
                break;
            case 4:
                str="Four";
                break;
            case 5:
                str="Five";
                break;
            case 6:
                str="Six";
                break;
            case 7:
                str="Seven";
                break;
            case 8:
                str="Eight";
                break;
            case 9:
                str="Nine";
                break;
        }
        return str;
    }
    public static String countAndSay(int n)
    {
        ArrayList<Integer> arr= new ArrayList<>();
        while(n!=0)
        {
            arr.add(n%10);
            n/=10;
        }
        ArrayList<Integer> arr2= new ArrayList<>();
        for(int i=arr.size()-1;i>=0;i--)
        {
            arr2.add(arr.get(i));
        }
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr2.get(i)+" ");
        }
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int i=0;i<arr2.size();i++)
        {
            if(!set.containsKey(arr2.get(i)))
                set.put(arr2.get(i),1);
            else
                set.put(arr2.get(i),set.get(arr2.get(i))+1);
        }
        StringBuilder str=new StringBuilder();
        Set<Integer> set2=new HashSet<>();
        for(int i=0;i<arr2.size();i++)
        {
            set2.add(arr2.get(i));
        }

        for(int k:set2)
        {
            str.append(IntegerToString((int)set.get(k)));
            str.append(IntegerToString(k));
        }

//        set.forEach((k,v)->{
//            int key=(int)k;
//            int val=(int)v+1;
//            str.append(IntegerToString(val));
//            str.append(IntegerToString(key));
//        });
//        Iterator it=set.entrySet().iterator();
//        while(it.hasNext())
//        {
//            Map.Entry setEntry = (Map.Entry)it.next();
//            int val=(int)setEntry.getValue()+1;
//            str.append(IntegerToString(val));
//            str.append(IntegerToString((int)setEntry.getKey()));
//
//        }
//        for(Map.Entry setEntry : set.entrySet())
//        {
//            System.out.print((int)setEntry.getValue());
//            System.out.println((int)setEntry.getKey());
//            int val=(int)setEntry.getValue()+1;
//            str.append(IntegerToString(val));
//            str.append(IntegerToString((int)setEntry.getKey()));
//        }
        String STR= str.toString();
        return STR;
    }
    public static void main(String[] args) {
        int n=3322251;
        System.out.println(countAndSay(n));
    }
}
