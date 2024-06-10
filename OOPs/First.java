//package OOPs;

public class First {
    int x;
    float y;
    char z;
    String b;
    public void show()
    {
        System.out.println(x+" "+y+" "+z+" "+b);
    }
    public static void main(String[] args) {
        int []x[]={{1,2},{3,4,5},{6,7,8,9}};
        int [][]y=x;
        System.out.println(y[2][1]);
        First obj=new First();//object creation syntax:::: Classname Objectname =new Classname();
        obj.show();//method accessing.
        // System.out.println(obj.x);
        // System.out.println(obj.y);
        // System.out.println(obj.z);
        // System.out.println(obj.b);
        obj.x=101;
        obj.y=1.2f;//reassigning the values in the object.
        obj.z='d';
        obj.b="kjnwejd";
        obj.show();
    }

}
