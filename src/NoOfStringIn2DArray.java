
import java.util.HashMap;
import java.util.Map;

public class NoOfStringIn2DArray
{
    public static int stringCount(String str,String[] STR)
    {
        Map<Character,Integer> map=new HashMap<>();
        Map<Character,Integer> strMap= new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if (!strMap.containsKey(str.charAt(i)))
                strMap.put(str.charAt(i), 1);
            else
                strMap.put(str.charAt(i), strMap.get(str.charAt(i)) + 1);
        }
        for(String s:STR)
        {
            char[] charArray=s.toCharArray();
            for(int i=0;i<charArray.length;i++)
            {
                if(!map.containsKey(charArray[i]))
                    map.put(charArray[i],1);
                else
                    map.put(charArray[i],map.get(charArray[i])+1);
            }
        }
        int m=0;
        int arr[] =new int[strMap.size()];
        for (Map.Entry strMapset : strMap.entrySet())
        {
            int count=0;
            char strKey = (char)strMapset.getKey();
            if(!map.containsKey(strKey))
                return 0;
            int strval = (int)strMapset.getValue();
            for(Map.Entry mapset : map.entrySet())
            {
                char mapKey=(char)mapset.getKey();
                int mapVal=(int)mapset.getValue();

                if(mapKey==strKey) {
                    count = mapVal / strval;
                    break;
                }
            }
            arr[m]=count;
            m++;
        }
        int max=arr[0];
        for (int a : arr)
            if(a<max)
                max=a;
        return max;
    }
    public static void main(String[] args) {
        String str = "GEEKS";
        String input[] = {
                "DGESAEKDCDGDD",
                "BBDEAIDBS",
                "BSGKHERKBK",
                "DDDSDSDMSE",
                "DDRDEGADARSHHDDE",
                "DDDADADEADG"
        };
        int c=5/1;
        System.out.println(stringCount(str,input));
    }
}
