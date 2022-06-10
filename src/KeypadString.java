import java.util.*;

public class KeypadString
{
    public static ArrayList<Integer> keypadstring(String str)
    {
        ArrayList<Integer> res = new ArrayList<>();
        Hashtable<Integer,ArrayList<Character>> map=new Hashtable<>();
        ArrayList<Character> list;
        for(int i=2;i<=9;i++)
        {
            list=new ArrayList<>();
            switch (i)
            {
                case 2:
                    list.add('A');
                    list.add('B');
                    list.add('C');
                    map.put(2,list);
                    break;
                case 3:
                    list.add('D');
                    list.add('E');
                    list.add('F');
                    map.put(i, list);
                    break;
                case 4:
                    list.add('G');
                    list.add('H');
                    list.add('I');
                    map.put(i, list);
                    break;
                case 5:
                    list.add('J');
                    list.add('K');
                    list.add('L');
                    if (!map.containsKey(i))

                        map.put(i, list);
                    break;
                case 6:
                    list.add('M');
                    list.add('N');
                    list.add('O');
                    map.put(i, list);
                    break;
                case 7:
                    list.add('P');
                    list.add('Q');
                    list.add('R');
                    list.add('S');
                    map.put(i, list);
                    break;
                case 8:
                    list.add('T');
                    list.add('U');
                    list.add('V');
                    map.put(i, list);
                    break;
                case 9:
                    list.add('W');
                    list.add('B');
                    list.add('Y');
                    list.add('Z');
                    map.put(i, list);
                    break;
            }
        }
        for(int i=0;i<str.length();i++)
        {
            for (Map.Entry mapele : map.entrySet()) {
                list= (ArrayList<Character>) mapele.getValue();
                if(list.contains(str.charAt(i)))
                {
                    int l=0;
                    char[] ch=new char[list.size()];
                    for(char c : list)
                    {
                        ch[l]=c;
                        l++;
                    }


                    int k=1;
                    for(int j=0;j< list.size();j++)
                    {

                        if(ch[j]!=str.charAt(i))
                        {
                            k++;
                            continue;
                        }
                        break;
                    }
                    System.out.print(k+" ");
                    System.out.println(ch);
                    for(int j=0;j<k;j++)
                    {
                        res.add((int)mapele.getKey());
                    }
                }
            }
        }
        System.out.println();
        return res;
    }
    public static void main(String[] args) {
        String str="GEEKSFORGEEKS";
//[4, 3, 3, 3, 3, 5, 5, 7, 7, 7, 7, 3, 3, 3, 6, 6, 6, 7, 7, 7, 4, 3, 3, 3, 3, 5, 5, 7, 7, 7, 7]
        System.out.println(keypadstring(str));
    }
}
