import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrefixString
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String strs[]= new String[3];
        for(int i=0;i<3;i++)
        {
            strs[i]=sc.nextLine();
        }
        Queue<Character> que=new LinkedList<>();
        for(String st : strs)
        {
            char chstr[]=new char[st.length()];
            for(int i=0;i<chstr.length;i++)
            {
                chstr[i]=st.charAt(i);
            }
            if(que.isEmpty())
            {
                for(int i=0;i<st.length();i++)
                {
                    que.add(chstr[i]);
                }
            }
            for(int i=0;i< chstr.length;i++)
            {
                for(int j=0;j<que.size();j++)
                {
                    
                }
            }
        }
    }
}
