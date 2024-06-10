package java;
import java.util.*;
public class Stringtask {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    String s1=s.nextLine();
    long p=1;
    long su=0;
    int i=0;
   //char a='0';
    for(i=0;i<s1.length();i++)
    {
        if(Character.isDigit(s1.charAt(i)))
        {
            su+=((s1.charAt(i))-48);
            p*=((s1.charAt(i))-48);
        }
    }
    System.out.println(p+" "+su);
    System.out.print(Math.abs(p-su));
    s.close();
    }
}
