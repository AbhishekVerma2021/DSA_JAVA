import java.util.ArrayList;

public class PowerSet
{

    public static ArrayList<String> powset(String str)
    {
        ArrayList<String> Set=new ArrayList<>();
        int pow_size= (int) Math.pow(2,str.length());
        for(int i=0;i<pow_size;i++)
        {
//            System.out.println("I LOOP");
            String temp_str="";
            for (int j=0;j<str.length();j++)
            {
//                System.out.println("II LOOP");
                if((i&(1<<j))>0)
                {
                    temp_str+=str.charAt(j);
                }
            }
            System.out.println(temp_str);
            Set.add(temp_str);
        }
        System.out.println(pow_size);
        return Set;
    }
    public static void main(String[] args) {
        String str="abcdef";
        System.out.println("PowerSet with non Contineous indexing : \n"+powset(str));
    }
}
