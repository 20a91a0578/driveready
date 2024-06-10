abstract class A6
{
abstract   void show();
}
class B6 extends A6
{
public void show()
{
System.out.println("HELLLLLLO");
}
}
public class Abstract {
    public static void main(String[] args) {
        B6 b=new B6();
        b.show();
    }
}
