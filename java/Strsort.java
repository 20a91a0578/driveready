package java;
import java.util.Arrays;
import java.util.Scanner;;
public class Strsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];

for(int i=0;i<n;i++)
s[i]=sc.next();
for(int i=0;i<n;i++)
System.out.print(s[i]+"\t");
Arrays.sort(s);
System.out.println();
for(int i=0;i<n;i++)
System.out.print(s[i]+"\t");
    }
}
