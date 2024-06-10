package java;
import java.util.*;
class Spiral
{
public static void spir(int a[][],int r )
{
int i;
int top=0,down=r-1,left=0,right=r-1;
int dir=0;
while(top<=down && left<=right)
{
if(dir==0)
{
for(i=left;i<=right;i++)
System.out.print(a[top][i]+" ");
top+=1;
}
else if(dir==1)
{
for(i=top;i<=down;i++)
System.out.print(a[i][right]+" ");
right-=1;
}
else if(dir==2)
{
for(i=right;i>=left;i--)
System.out.print(a[down][i]+" ");
down-=1;
}
else if(dir==3)
{
for(i=down;i>=top;i--)
System.out.print(a[i][left]+" ");
left+=1;
}
dir=(dir+1)%4;
}
}
public static void main(String args[])
{
Scanner se=new Scanner(System.in);
int r=se.nextInt();
int a[][]=new int[r][r];
int i,j;
for(i=0;i<r;i++)
for(j=0;j<r;j++)
a[i][j]=se.nextInt();
System.out.println("THE spiralMatrix:");
spir(a,r);
}
}
