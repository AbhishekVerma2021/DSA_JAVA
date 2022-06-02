import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LongestSubseqRepeating
{
    public static void subStrings(String str,ArrayList<String> strArr,String op)
    {
        if(str.length()==0)
        {
            strArr.add(op);
            return;
        }
        subStrings(str.substring(1),strArr,op);
        subStrings(str.substring(1),strArr,op+str.charAt(0));
    }
    public static int longestCommanSubsequenceCount(String str)
    {
        ArrayList<String> strArr=new ArrayList<>();
        subStrings(str,strArr,"");
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<strArr.size();i++)
        {
            if(!map.containsKey(strArr.get(i)))
                map.put(strArr.get(i),1);
            else
                map.put(strArr.get(i),map.get(strArr.get(i))+1);
        }
        int max=0;
        for(Map.Entry mapEle : map.entrySet())
        {
            if(max<(int)mapEle.getValue())
                max=(int)mapEle.getValue();
        }
        return max;
    }
    public static void main(String[] args) {
        String str="axaxxy";
        System.out.println(longestCommanSubsequenceCount(str));
    }
}
