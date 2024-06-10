package java;
import java.util.*;
class Codingday2
{
public static void main(String arg[])
{
Scanner ak=new Scanner(System.in);
int m=ak.nextInt();
int n=ak.nextInt();
int a[][]=new int[m][n];
int i,j;
for(i=0;i<m;i++)
for(j=0;j<n;j++)
a[i][j]=ak.nextInt();

int c=0,z=0,k=0;
for(i=0;i<m;i++)
{
c=0;
for(j=0;j<n;j++)
{
if(a[i][j]==1)
c+=1;
}
if(c>z){
z=c;
k=i;
}
}
System.out.print("\n\n\n"+k);
}
}