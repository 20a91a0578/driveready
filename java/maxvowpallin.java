package java;
public class maxvowpallin {
    public static boolean pallin(String s1)
    {
int i;
for(i=0;i<(s1.length())/2;i++)
{
if(s1.charAt(i)!=s1.charAt(s1.length()-1-i))
return false;
}
return true;
    }
public static int isVowel(String s1)
{
    String v="aeiouAEIOU";
    int c=0;
    for(int i=0;i<s1.length();i++)
    {
        if(v.contains(s1.charAt(i)+" "))
        {
            c=c+1;
        }
    }
    return c;
}
public static void main(String[] args) {
    System.out.println(isVowel("hello"));
}
}
