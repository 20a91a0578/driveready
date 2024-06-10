import java.util.*;
public class Subarraysumk {
 public static void main(String[] args) {
    // Scanner s=new Scanner(System.in);
    // System.out.print("Enter Array Size:");
    // int n=s.nextInt();
    // System.out.print("Enter the array Elements");
    // int a[]=new int[n];
    // for(int i=0;i<n;i++)
    //  a[i]=s.nextInt();
//     //1.To pointer Concept
//System.out.print("Enter the Target sum:")
//int ks=s.nextInt();
//     int i;
//int j=0,cs=0,f=0;
// for(i=0;i<n;i++)
//         {
//             cs+=a[i];
//             while(cs>=ks)
//             {
//                 if(cs==ks)
//                 {
//                     f=1;
//                     break;
//                 }
//                 cs-=a[j++];
//             }
//             if(f==1)
//             {
//                 // a.add(j+1);
//                 // a.add(i+1);
//                 break;
//             }
//         }
//         for(int h=j;h<=i;h++)
// System.out.print(a[h]+" ");
    
// 2.prefix sum
// System.out.print("Enter the Target sum:");
// int ks=s.nextInt();
//  int pre[]=new int[n];
//  pre[0]=a[0];
//  for(int i=1;i<n;i++)
//  pre[i]=pre[i-1]+a[i];
//  int g=2;
// int j=0;
//  int s1;
// while(g<n)
// {
//      s1=pre[g];
//  if(s1==ks){
//    for(int i=0;i<=g;i++) 
//  System.out.print(a[i]+" ");
//  }
//  for(j=g+1;j<n;j++)
//  {
//      s1=pre[j]-pre[j-g-1];
//      if(s1==ks)
//  break;
//  }

// if(s1==ks)
// break;
// g+=1;
// } 
// System.out.println(g+" "+j);
// for(int i=g;i<=j;i++)
// System.out.print(a[i]+" ");

// 3.Arden max Subarray sum---max subarray sum->max sum subarray->max subarray length.
// int msf=a[0];
// int start=0,end=0;
// int men=0;
// for(int i=0;i<a.length;i++)
// {
//     men=men+a[i];
//     if(msf<men){
//         end=i;
//         msf=men;
//     }
//     if(men<0){
//         men=0;
//         start=i+1;
//     }
   
// }

// System.out.print(msf+" "+start+" "+end+"\n");
// for(int h=start;h<=end;h++)
// System.out.print(a[h]+" ");
// Output
// 7 
//-2 -3 4 -1 -2  1 5 -3
// 7

//4.sliding window protocol->to find targetsum subarray with length k->
// System.out.print("Enter the Target sum");
// int ks=s.nextInt();
// System.out.println("Enter the length of Sub array:");
// int k=s.nextInt();
// int pre[]=new int[n];
// int j;
//  pre[0]=a[0];
//  for(int i=1;i<n;i++)
//  pre[i]=pre[i-1]+a[i];
//  int g=k-1;
//  int s1;
//  s1=pre[g];
//  if(s1==ks){
//    for(int i=0;i<=g;i++) 
//  System.out.print(a[i]+" ");
//  }
//  else{
//  for(j=g+1;j<n;j++)
//  {
//      s1=pre[j]-pre[j-g-1];
//      if(s1==ks)
//  break;
//  }
//  for(int i=j-g;i<=j;i++)
//  System.out.print(a[i]+" ");
// }
//int a[]={1,-2,3,4,5};
//maximum product ofsubarray
// int s=0;
// int e=0;
// int r =a[0];
// int m=Integer.MIN_VALUE;
// int n=a.length;
// for(int i=0;i<n;i++)  
// if(a[i]>m)
// m=a[i];

// for(int i=0;i<n;i++)
// {

//     int t=a[i];
//    for(int j=i+1;j<n;j++)
//    {
//     if(t*a[j]>m){
//     m=t*a[j];
//     s=i;
//     e=j;
//     }
//     t*=a[j];

// }
// }
// for(int i=s;i<=e;i++)
// {
// System.out.print(a[i]+" ");
// }
// System.out.println(m);
// }

//Same sum on left and right sub array.
// int a[]={2,0,0,2};
// int l=0,r=0,c=0;
// int n=a.length;
// for(int i=0;i<a.length;i++)
// {
//   l=0;
//   r=0;
//   for(int j=i+1;j<n;j++)
//   r+=a[j];
//   for(int k=0;k<i;k++)
//   l+=a[k];
//   System.out.print(l+" "+r+"\n");
//   if(l==r)
//   {
// c=1;
// break;
//   }

// }
// if(c==1)
// System.out.print(l+" "+r);
// else
// System.out.print("kjior");
 }
}
