//package OOPs;

public class Constructor {
    int x,y;
    Constructor()
    {
x=9;
y=99;
    }
    Constructor(int m,int n)
    {
this.x=m;
this.y=n;
    }
    Constructor(int m)
    {
        x=m;
        y=0;
    }
    public void show()
    {
        System.out.println(this+" "+x+" "+y);
    }
    public static void main(String[] args) {
        Constructor c=new Constructor();
        Constructor k=new Constructor(100,350);
        Constructor l=new Constructor(8);
        l.show();
        c.show();
        k.show();
    }
}
