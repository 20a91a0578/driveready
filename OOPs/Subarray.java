import java.util.*;
public class Subarray {
    public static void main(String[] args) {
      Scanner se=new Scanner(System.in);
      int sum=0,i;
      int nu=se.nextInt();
      int arr[]=new int[nu];
      for(i=0;i<nu;i++)
            arr[i]=se.nextInt();
      
            int pre[]=new int[arr.length];
            pre[0]=arr[0];
            int n=arr.length;
                for(i=1;i<n;i++)
                    pre[i]=arr[i]*pre[i-1];
    //=================================================================================================================================================
    //tO to print subarrays  
  
for(i=0;i<n;i++)
System.out.print(pre[i]+" ");
  int g=1;
      while(g<n)
      {
          System.out.print(pre[g]+" ");
          for(i=g+1;i<n;i++)
              System.out.print(pre[i]/pre[i-g-1]+" ");
        System.out.println();
      g+=1;
      }
      se.close();
    }
}
