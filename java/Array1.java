package java;
import java.util.*;
class Array1
{
  public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int ages[],n;
      n=sc.nextInt();

      ages=new int[n];

      for(int i=0;i<n;i++)
          ages[i]=sc.nextInt();

      for(int i=0;i<n;i++)
           System.out.print(ages[i]+" ");
    
      System.out.println();
      System.out.println(Arrays.toString(ages));		//[ele1, ele2,.....]

      for(int ele:ages)
        System.out.print(ele+" ");
sc.close();
   }

}
