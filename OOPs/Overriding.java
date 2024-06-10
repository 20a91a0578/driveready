//package OOPs;
class A1{
    int age=10000;
public void identity()
{
    System.out.println("ODINSON");
} 
public void proper()
{
    System.out.println("GOD OF EVERYTHING");
}
}
class B1 extends A1
{
    //private int k=9;
   int age=1500;
   public void identity()
   {
    System.out.println("THOR ODINSON");
   }
   public void proper()
   {
    
    System.out.println("Age:"+age);
    System.out.println("GOD OF THUNDER");
    System.out.println("GOD OF WAR");
    super.proper();
   }
}
public class Overriding {
    public static void main(String[] args) {
        B1 b=new B1();
        b.identity();
        b.proper();

    }
}
