abstract class Vechile
{
    abstract public int getWheels();
    abstract public int getCapacity();
}
class Bike extends Vechile
{
    public int getWheels()
    {
        return 2;
    }
    public int getCapacity()
    {
        return 2;
    }
}
class Auto extends Vechile
{
    public int getWheels()
    {
        return 3;
    }
    public int getCapacity()
    {
        return 3;
    }
}
class Car extends Vechile
{
    public int getWheels()
    {
        return 4;
    }
    public int getCapacity()
    {
        return 4;
    }
}
public class Absexam {
    public static void main(String[] args) {
        Vechile v;
        v=new Bike();
        System.out.println("===========BIKE============");
        System.out.println("No OF Wheels:"+v.getWheels());
        System.out.println("Capacity:"+v.getCapacity());
        System.out.print("\n======================================\n");
v=new Auto();
        System.out.println("===========CAR============");
        System.out.println("No OF Wheels:"+v.getWheels());
        System.out.println("Capacity:"+v.getCapacity());
        System.out.print("\n======================================\n");
        v=new Car();
        System.out.println("===========CAR============");
        System.out.println("No OF Wheels:"+v.getWheels());
        System.out.println("Capacity:"+v.getCapacity());
        System.out.print("\n======================================\n");
    }
}
