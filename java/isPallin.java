package java;
import java.util.Scanner;

public class isPallin {
    public static boolean pallin(String s1)
    {
int i;
for(i=0;i<(s1.length())/2;i++)
{
if(s1.charAt(i)!=s1.charAt(s1.length()-1-i))
return false;
}
return true;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       System.out.print(pallin(s)); 
       sc.close();
    }
}
