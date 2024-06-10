package java;
import java.util.Scanner;
public class Evenlengthsubarray {
        public static int sumEvenLengthSubarrays(int[] arr) {
            int sum=0,i;
            int pref[]=new int[arr.length];
            pref[0]=arr[0];
            int n=arr.length;
            for(i=1;i<n;i++)
                pref[i]=arr[i]+pref[i-1];
            int g=1;
            while(g<n)
            {
                sum+=pref[g];
                for(i=g+1;i<n;i++)
                    sum+=pref[i]-pref[i-g-1];
            g+=2;
            }
            return(sum);
            
        }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter Elements");
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    sc.close();
   System.out.println(sumEvenLengthSubarrays(a));
    
   }
}
