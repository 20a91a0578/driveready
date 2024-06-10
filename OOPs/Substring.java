import java.util.*;
public class Substring {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String  k=s.nextLine();
        //int a=s.nextInt();
        
        //using hashmap
    //     HashMap<Character,Integer> hm=new HashMap<>();
    //     ArrayList<Integer> ar=new ArrayList<>();
    //  int i;
    //  for(i=0;i<a;i++)
    //  {
    //     char c=k.charAt(i);
    //     hm.put(c,hm.getOrDefault(c,0)+1);
    //    }   
//        ar.add(hm.size());
//        System.out.println(hm+"\n");
    
//     for(i=a;i<k.length();i++)
//     {
//         char c=k.charAt(i-a);
//         if(hm.get(c)==1)
//         hm.remove(c);
//         else
//         hm.put(c,hm.getOrDefault(c,0)-1);
//         c=k.charAt(i);
//         hm.put(c,hm.getOrDefault(c,0)+1);
//     System.out.print(hm+"\n");
//     ar.add(hm.size());
// }
// for(Integer v:ar)
// System.out.print(v+" ");

//using hashset
// HashSet<Character> hs=new HashSet<>();
// ArrayList<Integer> ar=new ArrayList<>();
// for(int i=0;i<a;i++)
// hs.add(k.charAt(i));
// ar.add(hs.size());
// for(int i=a;i<k.length();i++)
// {
//     hs.remove(k.charAt(i-a));
//     hs.add(k.charAt(i));
//     ar.add(hs.size());
// }
// System.out.print(ar);


//to find unique characters.
// HashMap<Character,Integer> hm=new HashMap<>();
// ArrayList<Integer> ar=new ArrayList<>();
// int i;
// for(i=0;i<a;i++)
// {
// char c=k.charAt(i);
// hm.put(c,hm.getOrDefault(c,0)+1);
// }
// System.out.print("[");
// for(i=0;i<a;i++)
// {
// char c=k.charAt(i);
// if(hm.get(c)==1);
// System.out.print(c+"->");
// }
// System.out.print("],"); 
// for(i=a;i<k.length();i++)
// {
// if(hm.get(k.charAt(i-a))==1)
// hm.remove(k.charAt(i-a));
// else
// hm.put(k.charAt(i-a),hm.getOrDefault(k.charAt(i-a),0)-1);
// hm.put(k.charAt(i),hm.getOrDefault(k.charAt(i),0)+1);
// System.out.print("[");
// for(int j=i-a+1;j<=i;j++)
// {
// if(hm.get(k.charAt(j))==1)
// System.out.print(k.charAt(j)+" ->");
// }
// System.out.print("],");
// }
//max length of substring without repeating
// HashMap<Character,Integer> hm=new HashMap<>();
// int e=0,st=0,max1=0,p=0,q=0;
// int pe=0;
// for(int i=0;i<k.length();i++)
// {
//     char c=k.charAt(i);
//     if(hm.containsKey(c))
//     {
//         st=Math.max(st,hm.get(c)+1);
//     }
//     hm.put(c,i);
//     max1=Math.max(max1,i-st+1);
//     if(max1>pe)
//     {
//         pe=max1;
// p=i;
// q=st;
//     }
//     System.out.println(hm+" "+st+" "+i+" "+max1);
// }
// for(int j=q;j<=p;j++)
// System.out.print(k.charAt(j)+"-");
// System.out.println("\n"+max1+" ");

//containig vowerls only
HashMap<Character,Integer> hm=new HashMap<>();
int c=0,m=0,st=0,end=0;
char a[]={'a','e','i','o','u','A','E','I','O','U'};
for(int i=0;i<a.length;i++)
hm.put(a[i],1);
int i;
for( i=0;i<k.length();i++)
{
    char d=k.charAt(i);
    //System.out.print(d+"->");
    if(hm.containsKey(d))
    {
        c+=1;
        System.out.println(d+"==================="+c);
    }
    else{
        if(c>m)
        {
            end=i-1;
            m=c;
            c=0;
        }
    }
}
if(c>m){
m=c;
end=i-1;}
for(i=end-m+1;i<=end;i++)
System.out.println(k.charAt(i)+"");
System.out.println(m+" ");
s.close();
    }    
}