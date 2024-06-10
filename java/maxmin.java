package java;
import java.util.*;
	class Sam
	      {
		public static void minmax(int a[],int n)
		{
int m1=a[0]>a[1]?a[0]:a[1];
int m2=a[0]<a[1]?a[0]:a[1];
int n1=a[0]<a[1]?a[0]:a[1];
int n2=a[0]>a[1]?a[0]:a[1];
for(int i=0;i<n;i++)
{
if(a[i]>m1){
m2=m1;
m1=a[i];
}
else if(a[i]>m2)
m2=a[i];

if(a[i]<n1){
n2=n1;
n1=a[i];
}
else if(a[i]<n2)
n2=a[i];

}
int k= m1*m2;
int x=n1*n2;
if(k<x)
System.out.print(x);
else
System.out.print(k);
}
public static  void  main(String arg[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
// int m1,m2,n1,n2;
for(int i=0;i<n;i++)
a[i]=s.nextInt();
System.out.println("\n\n");
minmax(a,n);
s.close();
}
}