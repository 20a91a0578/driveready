package java;
//import java.lang.invoke.StringConcatException;
import java.util.*;

//import javax.lang.model.util.ElementScanner14;
class Collect
{
public static void main(String[] args) {
//     ArrayList<Integer> a=new ArrayList<>();
//     a.add(8);
//     a.add(7);
//     a.add(12);
//     a.add(65);
//     a.add(12);
//     System.out.println(a);
//     System.out.println(Collections.max(a));//for finding max
//     System.out.println(Collections.min(a));//for finding min
//     Collections.shuffle(a);//to shuffle array
//     System.out.println(a);
//     System.out.println(Collections.frequency(a, 12));//to find count of an element
// Collections.rotate(a, 3);//to rotate elements in array
// System.out.println(a);
// Collections.sort(a);//for sorting the list
// System.out.println(a);
// System.out.println(Collections.binarySearch(a, 12));//for searching an element
// System.out.println(Collections.binarySearch(a, 100));
Scanner s=new Scanner(System.in);
Stack<Character> a=new Stack<>();
String d=s.next();
for(int i=0;i<d.length();i++)
{
    if(a.empty()||a.peek()!=d.charAt(i))
    {
        a.add(d.charAt(i));
    }
    
}
String e="";
int n=a.size();
for(int i=0;i<n;i++)
e=a.pop()+e;
System.out.println(e);
s.close();
}
}