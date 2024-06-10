package java;
import java.util.*;
class MatSim
{
public static String simm(int x[][],int r,int c)
{
int i,j;
for(i=1;i<r;i++){
for(j=0;j<i;j++){
if(x[i][j]!=x[j][i]){
return "NO";
}}}
return "YES";
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
System.out.println(simm(x,r,c));

}
}
