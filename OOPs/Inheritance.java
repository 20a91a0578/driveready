//package OOPs;
class A
{
    int x;
public A()
{
    System.out.println("A cons");
    x=5;

}
public A(int x)
{
    System.out.println("Default");
    this.x=x;
}
}
class B extends A{
    int y;
    public B(int x,int y)
    {
        super(x);
        System.out.println("B cons");
       this.y= y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.x+" ");
        B b=new B(9,8);
        System.out.println(b.x+" "+b.y);
    }
}
