//package OOPs;
class A4
{
    public  void m1()
    {
        System.out.println("Parent \tHello\n");
    }
    public void m2()
    {
        System.out.println("Parent\tWelcome\n");
    }
}
class B4 extends A4
{
    public void m2()
    {
        System.out.println("child\tWelcome\n");
    }
}
public class DynamicDispatch {
    public static void main(String[] args) {
        A4 a=new A4();
        a.m1();
        //a.m2(); Error
        B4 b=new B4();
        b.m1();
        b.m2();
        A4 a1=new B4();
        a1.m1();
        //The method m2() is undefined for the type A4 if m2() is not defined in parentclass it will gives errorduring compilation but
        //during execution method willget executed according to instance of object.
        a1.m2();//code with respect to child class executed.
        //B4 b1=new A4();  Child can not store the instance of Parent class.
    }
}
