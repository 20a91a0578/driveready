import java.util.*;
public class trailer
{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7};
		int k=2;
		ArrayList<Integer>a1=new ArrayList<>();
		
		while(k<a.length)
		{
            System.out.println("THE SUB ARRAY OF LENGTH :"+k);
		    for(int i=0;i<k;i++)
            a1.add(a[i]);
            System.out.println(a1);
		for(int i=k;i<a.length;i++)
		{
		    a1.remove(0);
		    a1.add(a[i]);
            System.out.println(a1);
		}
		a1.clear();
		k+=1;
		}    
	}
}
