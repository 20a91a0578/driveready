package java;
import java.util.*;
class MatrixDemo
{
public static String matrixCalculat(int x[][],int r,int c)
{
int s1=0,s2=0,s3=0;
int  i;
//fordiagonal sum
for(i=0;i<r;i++)
{
s1+=x[i][i];
s2+=x[i][r-i-1];
}
if(s1!=s2)
return "NO";
else
{
for(i=0;i<r;i++)
{
s2=0;
s3=0;
for(int j=0;j<c;j++)
{
s2+=x[i][j];
s3+=x[j][i];
}
if(s1!=s3 || s1!=s2)
return"NO";
}
return "YES";
}
}
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int r=s.nextInt();
int c=s.nextInt();
int x[][]=new int[r][c];
int i,j;
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
x[i][j]=s.nextInt();
}
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(x[i][j]+"   ");
}
System.out.println("");
}
System.out.println(matrixCalculat(x,r,c));

}
}