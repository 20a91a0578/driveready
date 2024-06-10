class A5
{
    public void m1()
    {
        System.out.println("AAA");
    }
}
class B5 extends A5{
    public void m1()
    {
        System.out.println("BBBB");
    }
}
class C5 extends A5{
    public void m1()
    {
        System.out.println("CCC");
    }
}
public class Dynamic {
 public static void main(String[] args) {
    A5 a;
    a=new A5();
    a.m1();
    a=new B5();
    a.m1();
    a=new C5();
    a.m1();
    System.out.println(a instanceof A5);

 }   
}
