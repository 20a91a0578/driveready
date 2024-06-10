package java;
import java.util.*;
public class VowStr {

    public static boolean isVowel(String s1)
    {
        String vowels="aeiouAEIOU";
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(vowels.contains(ch+" "))
            {
                return true;
            }
        }
        return false;
    }
   public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int i;
        String yi=s.nextLine();
        String se[]=new String[n];
        for(i=0;i<n;i++)
        se[i]=s.next();
for(i=0;i<n;i++)
System.out.print(se[i]);
        for(i=0;i<se.length;i++)
        {
            String k=se[i];
         if(isVowel(k))
         {
            System.out.println(k);
         }  
        }
    }
}
