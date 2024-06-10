package java;
import java.util.*;
class Mat34
{
public static int rowmin(int a[][],int r)
{
int k=a[r].length;
int min=Integer.MAX_VALUE;
for(int i=0;i<k;i++)
{
if(a[r][i]<min)
min=a[r][i];
}
return min;
}

public static void main(String args[])
{
Scanner ak=new Scanner(System.in);
int r=ak.nextInt();
int c=ak.nextInt();
int a[][]=new int[r+1][c+1];
for(int i=0;i<r;i++)
for(int j=0;j<c;j++)
a[i][j]=ak.nextInt();
int i,j,cm,rm,dm=0;
for( i=0;i<r;i++){
 cm=99;rm=99;dm=99;
for( j=0;j<c;j++){
if(a[i][j]<rm)
rm=a[i][j];
if(a[j][i]<cm)
cm=a[j][i];
if(a[i][i]<dm)
dm=a[i][i];
}
a[i][j]=rm;
a[j][i]=cm;
}
a[i][i]=dm;




for( i=0;i<r+1;i++){
for(j=0;j<c+1;j++)
System.out.print(a[i][j]+"  ");
System.out.println("");
}

}
}