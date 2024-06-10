package java;
import java.util.*;
class RasterMat
{
public static void raster(int x[][],int r,int c)
{
int i,j=0;
for(i=0;i<r;i++){
if(i%2!=0)
{
for(j=c-1;j>=0;j--)
System.out.print(x[i][j]+"   ");
}
else{
for(j=0;j<c;j++)
System.out.print(x[i][j]+"   ");
}
System.out.println("");
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

raster(x,r,c);

}
}
