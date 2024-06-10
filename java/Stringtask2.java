package java;
import java.util.*;
public class Stringtask2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    String s1=s.nextLine();
    int d=0;
    int u=0;
    int l=0;
    int i;
    int a=0;
    for(i=0;i<s1.length();i++)
    {
        if(Character.isDigit(s1.charAt(i)))
        d+=1;
        else if(Character.isUpperCase(s1.charAt(i)))
        u+=1;
        else if(Character.isLowerCase(s1.charAt(i)))
        l+=1;
        else
        a+=1;
    
    }
    if((d==u)&&(u==l)&&(l==a) )
    System.out.println("Equal String");
    else
    System.out.println("Not An Equal String");
    s.close();;
}
}
//digits=lower=uppper=symbols