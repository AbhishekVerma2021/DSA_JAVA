import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapImplementation
{

    static Map<String,String> map= new HashMap<>();
    public void saveCountryCapital(String count,String cap)
    {
        map.put(count,cap);
    }
    public void fun(String key)
    {
        System.out.println(map.get(key));
    }
    public Map<String,String> NewMap()
    {
        Map<String,String> M2=new HashMap<>();
        Set<String> Keys= map.keySet();
        for(String k : Keys)
        {
            M2.put(k,map.get(k));
        }
        return M2;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        MapImplementation obj=new MapImplementation();
        String cap,count;
        for(int i=0;i<3;i++)
        {
            cap=sc.nextLine();
            count=sc.nextLine();
            obj.saveCountryCapital(count,cap);
        }
        Set<String> st =map.keySet();
//        for(String k : st)
//        {
//            System.out.println(k+"  =  "+map.get(k));
//        }
        String key=sc.nextLine();
        obj.fun(key);
        Map<String,String> m2=obj.NewMap();
        Set<String> Keys=m2.keySet();
        for (String k : Keys)
        {
            System.out.println("Key = " + k + " Value = " + m2.get(k));
        }
    }
}
